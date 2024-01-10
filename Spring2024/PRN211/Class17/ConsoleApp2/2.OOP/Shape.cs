using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2.OOP
{
    abstract class Shape
    {
        public static int NumOfShape { get; set; }
        public int ID { get; set; }
        public string Color { get; set; }         
        protected Shape(int id,string color)
        {
            ID = id;
            Color= color;
        }

        public abstract double Area();
        public abstract double Perimeter();

        public override string? ToString()
        {
            return $"Id :{ID}, Color:{Color}";
        }
    }
    class Retangle : Shape
    {
        private double x;
        private double y;
        public double X
        {
            get
            {
                return x;
            }
            set
            {
                if (value > 0) x = value;
                else throw new Exception("X must be greater than 0");
            }
        }
        public double Y
        {
            get
            {
                return y;
            }
            set
            {
                if (value > 0) y = value;
                else throw new Exception("Y must be greater than 0");
            }
        }
        public Retangle(int id, string color,double x, double y):base(id, color)
        {
            this.X = x;
            this.Y = y;
        }
        public override double Area()
        {
            return X * Y;
        }
        public override double Perimeter()
        {
            return 2 * (X + Y);
        }
    }
    class Square : Shape
    {
        public double shape
        {
            get
            {
                return shape;
            }
            set
            {
                if (value > 0) shape = value;
            }
        }

        public Square(int id, string color, double shape):base(id,color)
        {
            this.shape = shape;
        }

        public override double Area()
        {
            return shape * shape;
        }
        public override double Perimeter()
        {
            return 4 * shape;
        }

        
    }
    
}
