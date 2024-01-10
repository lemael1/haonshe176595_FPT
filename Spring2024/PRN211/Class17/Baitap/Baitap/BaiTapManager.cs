using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Baitap
{
    internal class BaiTapManager
    {
        public void Question1()
        {
            string name = Validation.GetString("Enter your name");
            char[] nameChar = name.ToCharArray();
            Array.Reverse(nameChar);
            string ReverseString = new string(nameChar);
            Console.WriteLine(ReverseString);

        }
        public void Question2()
        {
            int count = 0;
            int[] numbers = new int[5];
            while (count < 5)
            {
                numbers[count] = Validation.getInteger(1, 1000, "Enter the number");
                if (IsSeparated(numbers, numbers[count], count))
                {
                    count++;
                }
                else
                {
                    Console.WriteLine("Re-try");
                }

            }
            Array.Sort(numbers);
            Console.WriteLine("Sorted List:");
            foreach (int number in numbers)
            {
                Console.WriteLine(number);
            }
        }
        public bool IsSeparated(int[] nums, int number, int count)
        {

            for (int i = 0; i < count; i++)
            {
                if (number == nums[i]) return false;
            }
            return true;
        }


        public void Question3()
        {
            Console.WriteLine("Input the list");
            string value;
            while (true)
            {
                value = Console.ReadLine();
                string[] texts = value.Split(',');
                if (String.IsNullOrEmpty(value)
                    && texts.Length < 5)
                {
                    Console.WriteLine("Invalid List, re-try");
                }
                else
                {
                    Array.Sort<string>(texts);
                    Console.WriteLine($"3 smallest number : {texts[0]} ,{texts[1]}, {texts[2]} ");
                }
            }

        }
        public void Question4()
        {
            List<int> numbers= new List<int>();
            bool isRunning = true;
            while (isRunning)
            {
                Console.WriteLine("1.Enter a number");
                Console.WriteLine("2.Exit and show unique numbers");
                int choice = Validation.getInteger(1, 2, "Input your choice");           
                switch (choice)
                {
                    case 1:int number= Validation.getInteger(1, 1000, "Please input number");
                        numbers.Add(number);
                         break;
                    case 2: Console.WriteLine();
                        UniqueNumber(numbers);
                        isRunning= false;
                        break;
                }
            }
        }
        public void UniqueNumber(List<int> numbers)
        {
            List<int> uniqueNumbers= new List<int>();
            for(int i = 0; i < numbers.Count; i++)
            {
                bool isUnique = true;
                for(int j = 0; j < numbers.Count; j++)
                {
                    if(i!=j && numbers[j] == numbers[i])
                    {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique)
                {
                    Console.WriteLine(numbers[i]);
                }
            }         
        }
        
            

        }
    }
