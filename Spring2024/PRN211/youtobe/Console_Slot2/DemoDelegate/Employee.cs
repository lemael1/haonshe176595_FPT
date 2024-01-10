using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoDelegate
{
    public delegate double SalaryCalculationDelegate();

    internal class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public double Salary { get; set; }
        public string Position { get; set; }

        public void Input()
        {
            Console.Write("Enter ID: ");
            Id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter Name: ");
            Name = Console.ReadLine();

            Console.Write("Enter Salary: ");
            Salary = Convert.ToDouble(Console.ReadLine());

            Console.Write("Enter Position (Manager/Developer/Tester): ");
            Position = Console.ReadLine();
        }

        public SalaryCalculationDelegate SalaryCalculation => () =>
        {
            if (Position.Equals("Manager")) return Salary * 16;
            else if (Position.Equals("Developer") || Position.Equals("Tester")) return Salary * 14;
            else return Salary * 12;
        };

        public void Display(SalaryCalculationDelegate delobj)
        {
            double annualSalary = delobj() * 12;
            Console.WriteLine($"ID: {Id}, Name: {Name}, Position: {Position}, Annual Salary: {annualSalary}");
        }
    }
}
