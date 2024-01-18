using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BaiTapDelegate
{
    internal class Buyer
    {
        public double MoneyInWallet { get; set; }

      
        public Func<int, string> Pay;
        public Buyer(double moneyInWallet)
        {
            MoneyInWallet = moneyInWallet;
            Pay = Payment;
        }
        public string Payment(int amount)
        {
            if (amount > MoneyInWallet)
            {
                return "You don't have any money";
            }
            else if (MoneyInWallet == 0)
            {
                return "You don’t have any money.";
            }
            else if (MoneyInWallet <= 10)
            {
                return "You almost run out of money";
            }
            else
            {
                MoneyInWallet -= amount;
                return "Pay successfully";
            }
        }
    }
}
