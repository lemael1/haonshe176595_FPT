using Baitap;
using static DemoDelegate.Employee;

namespace DemoDelegate
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //DemoDelegate();
            //DemoMulticast();
            //OrderBy();
            SalaryCalculationDelegate SalaryCalculation;
        }
        public static int Add(int x, int y)
        {
            Console.WriteLine("Add function");
            return x + y;
        }
        public static int Sub(int x, int y)
        {
            Console.WriteLine("Sub function");
            return x - y;
        }
        public static void Calculate(int x, int y, Calculation delobj)
        {
            delobj(x, y); // noi quyet dinh goi ham
        }
        public static void DemoDelegate()
        {
            Calculation delegateobj;// khai bao 1 bien co kieu Calculation
            delegateobj= new Calculation(Add);
            Console.WriteLine("Output :"+delegateobj(5, 4));// loi goi Add(5,4);
            delegateobj = Sub;// Cach viet ngan gon thay cho new Calculation(Sub);
            Console.WriteLine("Output :" + delegateobj(5, 4));// loi goi Sub(5,4);
            Calculate(5, 4, Sub); // noi quyet dinh ham nao se dc goi

        }
        public static void DemoMulticast()
        {
            Console.WriteLine("DemoMulticast");
            Calculation delegateobj = Add;
            delegateobj += Sub;
            delegateobj += Add;
            Console.WriteLine("Output: " + delegateobj(5, 4));
            Console.WriteLine("After Remove:");
            delegateobj -= Add;
            Console.WriteLine("Output: " + delegateobj(5, 4));


        }
        // Target : Write a method use obj.Sort(); Sử dụng delegate và lamda để viết để in ra thứ tự sắp xếp của course theo Title và theo Id
        public static void OrderBy()
        {   
            CourseManager cm = new CourseManager();
            cm.InitData();
            // Order by ID
            Console.WriteLine("Order by ID");
            cm.SortById();
            cm.ShowAllCourses();
            //Order by Title
            Console.WriteLine("Order by Title");
            cm.SortByTitlte();
            cm.ShowAllCourses();




        }
    }
}
