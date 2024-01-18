using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baitap
{
    internal class Product
    {
        public int ProductID {  get; set; }
        public double Price {  get; set; }
        public int Quantity {  get; set; }

        public Product(int productID, double price, int quantity)
        {
            ProductID = productID;
            Price = price;
            Quantity = quantity;
        }
        public Product() { }

        public override string? ToString()
        {
            return $"ProductId {ProductID}, Price : {Price}, Quantity :{Quantity}";
        }
    }
}
