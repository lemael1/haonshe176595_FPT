using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;

namespace Baitap
{
    internal class Program
    {
        static void Main(string[] args)
        {
          List<Course> courses = new List<Course>();
            while (true)
            {
                Console.WriteLine("Do you want create a new course(0 for exit)");
                string choice = Console.ReadLine();
                if (choice.Equals("0")) {
                    break;
                }
                else {
                    CreateCourse();
                }

            }
        }

        private static void CreateCourse()
        {
           
        }
    }
}
