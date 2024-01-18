using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baitap
{
    internal class Validation
    {
        public static int GetInt(int min, int max, string msg)
        {
            int value;
            while (true)
            {
                Console.WriteLine(msg);
                try
                {
                    value = Convert.ToInt32(Console.ReadLine());
                    if (value >= min && value <= max)
                    {
                        return value;
                    }
                    else Console.WriteLine("Vuot qua gioi han. Vui long nhap lai");
                }
                catch (FormatException e)
                {
                    Console.WriteLine(" Sai partern , vui long nhap lai");
                }

            }
        }
    }
}
