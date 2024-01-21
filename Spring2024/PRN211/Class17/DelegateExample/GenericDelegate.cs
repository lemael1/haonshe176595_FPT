using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateExample
{
    internal class GenericDelegate
    {
        public delegate void MyGenericDelegate<T> (T obj);
        public static void RunSample()
        {
            Console.WriteLine("***** Generic Delegates *****\n");
            MyGenericDelegate<String> strTarget = new MyGenericDelegate<String>(StringTarget);
            MyGenericDelegate<int> intTarget = new MyGenericDelegate<int>(IntTarget);

            strTarget("Some string data");
            intTarget(9);

            Console.ReadLine();

        }

        static void StringTarget(string msg)
        {
            Console.WriteLine("msg in uppercase: {0}", msg.ToUpper());
        }

        static void IntTarget(int val)
        {
            Console.WriteLine("++val is: {0}", ++val);
        }
    }
}
