using System.Diagnostics;

namespace DelegateExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Car car1 = new Car(100, 10);
            /* explicitly writing
            Car.CarEngineHandler handler = new Car.CarEngineHandler(OnCarEngineEvent);
            car1.RegisterWithCarEngine(handler);
            */
            car1.RegisterWithCarEngine(OnCarEngineEvent);
            Console.WriteLine("SPEEDING UP.......");
            for (int i = 0; i < 6; i++)
            {
                car1.Accelerate(20);
            }

            Console.WriteLine("---------- MULTICASTING ----------");
            Car2 car2 = new Car2(100, 20);
            car2.RegisterWithCarEngine(OnCarEngineEventsArgs);
            car2.RegisterWithCarEngine(OnCarEngineEvent2);
            for (int i = 0; i < 6; i++)
            {
                car2.Accelerate(20);
            }

            //GenericDelegate.RunSample();

            Console.ReadLine();
        }

        static void OnCarEngineEvent(String msg)
        {
            Console.WriteLine("\n**** Message From Car Engine Object ****");
            Console.WriteLine("=> {0}", msg);
            Console.WriteLine("****************************************\n");
        }

        static void OnCarEngineEvent2(String msg)
        {
            Console.WriteLine("\n**** Message From Car Engine Object ****");
            Console.WriteLine("=> {0}", msg.ToUpper());
            Console.WriteLine("****************************************\n");
        }
       static void OnCarEngineEventsArgs(object sender, CarEventArgs e)
        {
            Console.WriteLine(e.msg);
        }
    }
}