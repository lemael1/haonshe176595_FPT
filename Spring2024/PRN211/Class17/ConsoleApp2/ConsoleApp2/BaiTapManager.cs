using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class BaiTapManager
    {
        public void Question1()
        {        
            int number = Validation.GetInt(1,1000, "Input a number from 1 to 10");
            if (number >= 0 && number <= 10) Console.WriteLine("Valid");
            else Console.WriteLine("Invalid");
        }
        public void Question2()
        {    
            int number1 = Validation.GetInt(1, 1000, "Input number 1");
            Console.WriteLine("Input number 2");
            int number2= Validation.GetInt(1, 1000, "Input number 2");
            Console.WriteLine(Math.Max(number1,number2));

        }
        public void Question3()
        {
            double height, width;
            while(true)
            {
                Console.WriteLine("Input height");
                height= Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Input width");
                 width= Convert.ToDouble(Console.ReadLine());
                if (height >= width) break;
            }
            if (height == width) Console.WriteLine("Poitrait");
            else Console.WriteLine("Lanscape");
        }
        public void Question4()
        {
            string msg;
            Console.WriteLine("Input max speed limit");
            double speedLimit= Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Input car speed");
            double carSpeed = Convert.ToDouble(Console.ReadLine());
            if(speedLimit >= carSpeed) {
                msg = "Ok";
            }
            else
            {
                double DemeritPoint = (double)(carSpeed - speedLimit) / 5;
                if (DemeritPoint > 12) msg = "License Suspended";
                else msg = DemeritPoint.ToString();
            }
            Console.WriteLine(msg);
        }
        public void Question5()
        {
            int count=0;
            for(int i = 1;i <= 100; i++) {
                if (i % 3 == 0) count += 1;          
            }
            Console.WriteLine(count);
        }
        public void Question6()
        {
            int sum = 0;
            bool isRunning = true;
            while(isRunning)
            {
                Console.WriteLine("1. Enter a number");
                Console.WriteLine("2. Exit and cal sum");     
                int choice = Validation.GetInt(1, 2, "Input your choice");
                switch (choice)
                {
                    case 1: 
                        int number= Validation.GetInt(1, 1000, "Please input number");
                        sum += number;
                        break;
                    case 2: Console.WriteLine(sum);
                        isRunning = false;
                        break;                        
                }


            }
        }
        public void Question7()
        {
            int result = 1;
            int number = Validation.GetInt(1, 1000, "Enter Number");
            for (int i = 1; i <= number; i++) {
                result = result * number;
            }

        }
        public void Question8()
        {
            int size = Validation.GetInt(1, 1000, "Enter size of series numbers");
            int[] numbers = new int[size];
            for(int i = 0; i < size; i++)
            {
                numbers[i] = Validation.GetInt(1, 1000, "Please input Number" + (i + 1));

            }
            Console.WriteLine(numbers.Max());


        }
        public void Question9()
        {
            string listofName = Validation.GetString("Vui Long Nhap List of Name");
            string[] names = listofName.Split(' ');
            Console.WriteLine($"{names[0]},{names[1]} and {names.Length-2} others like your post.");
        }

    }
}
