using Assignment1;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Baitap
{
    internal class StoreManager
    {
        public event EventHandler<NotificationEventArgs> NotificationEvent;

        private readonly object lockObject = new object();

        private readonly Action<string> Notify;

        private List<Product> products;
        private double cash;

        public StoreManager()
        {
            Notify = message => OnNotificationEvent(message);
            products = new List<Product>();
        }

        public void InitData()
        {
            cash = 50;
            Console.WriteLine("Your Cash: " + cash);

            products.Add(new Product(1, 12, 5));
            products.Add(new Product(2, 15, 10));
            products.Add(new Product(3, 20, 8));
            products.Add(new Product(4, 25, 6));
            products.Add(new Product(5, 30, 4));
        }

        private void OnNotificationEvent(string message)
        {
            EventHandler<NotificationEventArgs> handler = NotificationEvent;
            if (handler != null)
            {
                lock (lockObject)
                {
                    handler.Invoke(this, new NotificationEventArgs(message));
                }
            }
        }

        private void RaiseNotification(string message)
        {
            Notify?.Invoke(message);
        }

        public void BuyProduct(int productID, int quantity)
        {
            var product = products.FirstOrDefault(p => p.ProductID == productID);
            if (product == null)
            {
                RaiseNotification("Khong co san pham trong cua hang");
            }
            else
            {
                double totalCost = product.Price * quantity;
                if (cash < totalCost)
                {
                    RaiseNotification("You haven't enough to buy all of them");
                }
                else
                {
                    product.Quantity += quantity;
                    cash -= totalCost;
                    RaiseNotification("Buy successful!");
                    CheckConditions();
                }
            }
        }

        public void SellProduct(int productID, int quantity)
        {
            var product = products.FirstOrDefault(p => p.ProductID == productID);
            if (product == null)
            {
                RaiseNotification("Khong co san pham trong cua hang");
            }
            else
            {
                if (product.Quantity < quantity)
                {
                    RaiseNotification("Not enough quantity to sell");
                }
                else if (product.Quantity <= 5)
                {
                    RaiseNotification("There is a product having quantity less than 5");
                }
                else
                {
                    product.Quantity -= quantity;
                    cash += product.Price * quantity;
                    RaiseNotification("Sell successful!");
                    CheckConditions();
                }
            }
        }

        private void CheckConditions()
        {
            if (products.FirstOrDefault().Quantity < 5)
            {
                RaiseNotification("There is a product having quantity less than 5");
            }
            else if (cash < products.Min(p => p.Price))
            {
                RaiseNotification("The wallet almost run out of money (the amount is less than the price min)");
            }
            else if (products.Any(p => p.Quantity == 0))
            {
                RaiseNotification("The shop runs out of some products");
            }
        }

        public void ShowAllProducts()
        {
            foreach (Product product in products)
            {
                RaiseNotification(product.ToString());
            }
        }

        public void SortbyQuantiTy()
        {
            products.Sort((x, y) => x.Quantity.CompareTo(y.Quantity));
        }

        public void menu()
        {
            while (true)
            {
                Console.WriteLine("1.Sell Product");
                Console.WriteLine("2.Buy Product");
                Console.WriteLine("3.List of Product by  Quantity");
                Console.WriteLine("4.Show your cash and list Product");
                int choice = Validation.GetInt(1, 4, "Input your choice");
                switch (choice)
                {
                    case 1:
                        int productID = Validation.GetInt(1, 1000, "Please input Product Id");
                        int quantity = Validation.GetInt(1, 1000, "Please input quantity Product you want to sell ");
                        SellProduct(productID, quantity);
                        break;
                    case 2:
                        productID = Validation.GetInt(1, 1000, "Please input Product Id");
                        quantity = Validation.GetInt(1, 1000, "Please input quantity Product you want to buy");
                        BuyProduct(productID, quantity);
                        break;
                    case 3:
                        Console.WriteLine("List Product by Quantity");
                        SortbyQuantiTy();
                        break;
                    case 4:
                        Console.WriteLine("Your Cash" + cash);
                        ShowAllProducts();
                        break;
                }
            }
        }
    }
}
