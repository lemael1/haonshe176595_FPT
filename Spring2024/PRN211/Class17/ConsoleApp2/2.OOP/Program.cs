using _2.OOP;
using System.Drawing;

namespace OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*A objA = new A(2, 3, "hello");
            Console.WriteLine(objA);
            objA.S = "hao";
            Console.WriteLine(objA.S);
            B objB = new B(5);
            Console.WriteLine($"N= {objB.N}");
            Console.WriteLine($" Number of B: {B.numOfB}");
            C objC = new C();
            objC.Greeting();*/

            Retangle r = new Retangle(1, "color", 3, 5);
            Console.WriteLine(r.Perimeter());
        }
    }
    class A
    {
        public int X { get; set; }
        public int Y { get; set; }
        public string S { get; set; }

        public A()
        {
        }
        public A(int x, int y) : this(x, y, "") { }

        public A(int x, int y, string s)
        {
            X = x;
            Y = y;
            S = s;
        }
        public virtual void Greeting()
        {
            Console.WriteLine("Greeting from A");
        }

        // Cach viet ToString() cu
        /*public override string ToString()
        {
            return $"A({X},{Y},{S})";
        }
        */
        public override string? ToString() => $"A({X},{Y},{S})";

    }
    class B
    {
        public static int numOfB;
        public int N { get; set; }

        public B(int n)
        {
            N = n;
            numOfB++;
        }

        public B()
        {
        }

    }
    class C : A
    {
        public int Z { get; set; }
        public C() { }
        public C(int x, int y, int z) : base(x, y)
        {
            Z = z;
        }
        public override void Greeting()
        {
            base.Greeting();
            Console.WriteLine("Greetings from C");
        }
        Func<int, int, int> tinhtong;
    }
}
