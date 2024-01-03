namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            dynamic myValue = 0;
            Console.WriteLine("myInt is a: {0}", myValue.GetType().Name);
            myValue = true;
            Console.WriteLine("myInt is a: {0}", myValue.GetType().Name);
            myValue = "Hello World";
            Console.WriteLine("myInt is a: {0}", myValue.GetType().Name);
            myValue = 0.5;
            Console.WriteLine("myDouble is a: {0}", myValue.getType().Name);
            Console.ReadLine();


        }
    }
}
