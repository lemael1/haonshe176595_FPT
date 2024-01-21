using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateExample
{

    internal class Car
    {
        // 1. Define a delegate type
        public delegate void CarEngineHandler(string msgForCaller);

        // 2. Define a member variable of this delegate
        private CarEngineHandler _listOfHandlers;

        // 3. Add registration function for the caller
        public void RegisterWithCarEngine(CarEngineHandler methodToCall)
        {         
            _listOfHandlers = methodToCall;            
        }

        // 4. Implement the Accelerate method to invoke
        //    the delegate's invocation list under the correct circumstances
        public void Accelerate(int delta)
        {
            if (_carBroken)
            {
                _listOfHandlers?.Invoke("Sorry, this car is broken...");
            }
            else
            {
                Speed += delta;
                if ((MaxSpeed - Speed) == 10)
                {
                    _listOfHandlers.Invoke("Careful buddy! Gonna blow!");
                }
                Console.WriteLine("Speed = {0}", Speed);
                if (Speed > MaxSpeed)
                {   
                    _carBroken = true;
                    _listOfHandlers?.Invoke("Over the max speed...BROKEN!");
                }
                               
            }
        }

        public static int numCars = 0;
        public readonly int MaxSpeed;
        private int _currSpeed;
        private bool _carBroken;
        public readonly int ID;
        public Car(int max, int currentSpeed)
        {
            numCars++;
            ID = numCars;
            MaxSpeed = max;
            Speed = currentSpeed;
            _carBroken = false;
        }
        public Car() : this(55, 10) { }
        
        public int Speed
        {
            get { return _currSpeed; }
            set
            {
                _currSpeed = value;
            }
        }
    }
}
