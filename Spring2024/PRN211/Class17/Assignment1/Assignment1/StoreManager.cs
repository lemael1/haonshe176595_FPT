using System;
using System.Collections.Generic;
using System.Linq;

namespace Baitap
{
    internal class StoreManager
    {
        List<Product> products;
        double cash;
        string msg;
        Action<string> thongbao;
        public StoreManager()
        {
            products = new List<Product>();
            thongbao = (message) => Console.WriteLine(message);
        }
        public void InitData()
        {
            Console.WriteLine("Input money in your cash");
            cash = Convert.ToDouble(Console.ReadLine());
            products.Add(new Product(1, 12, 5));
            products.Add(new Product(2, 15, 10));
            products.Add(new Product(3, 20, 8));
            products.Add(new Product(4, 25, 6));
            products.Add(new Product(5, 30, 4));
        }
        public void menu()
        {
            while (true)
            {
                if (msg != null) thongbao(msg);
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
                        quantity = Validation.GetInt(1, 1000, "Pleas input quantity Product you want to buy");
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
        public void ShowAllProducts()
        {
            foreach (Product product in products)
            {
                Console.WriteLine(product.ToString());
            }
        }
        public void SortbyQuantiTy()
        {
            products.Sort((x, y) => x.Quantity.CompareTo(y.Quantity));
        }

        public void BuyProduct(int productID, int quantity)
        {

            var product = products.FirstOrDefault(p => p.ProductID == productID);
            if (product == null)
            {
                msg = "Khong co san pham trong cua hang";
            }
            else
            {
                if (cash <= product.Price * quantity)
                {
                    msg = "You haven't enough to buy all them";
                }
                else
                {
                    product.Quantity = product.Quantity + quantity;
                    cash = cash - product.Price * quantity;
                }
            }
        }

        public void SellProduct(int productID, int quantity)
        {
            var product = products.FirstOrDefault(p => p.ProductID == productID);
            if (product == null)
            {
                msg = "Khong co san pham trong cua hang";
            }

            else
            {
                if (product.Quantity < quantity)
                {
                    msg = "Not enough quantity to sell";
                }
                else if (product.Quantity <= 5)
                {
                    msg = "here is a product having quantity less than 5";
                }
                else
                {
                    product.Quantity = product.Quantity - quantity;
                    cash = cash + product.Price * quantity;
                }
            }
        }
    }
}
