using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BaiTapOPP
{
    abstract class Shape
    {
        public static int NumOfShapes { get; set; }
        public int ID { get; set; }
        public string Color { get; set; }

        protected Shape(int id, string color)
        {
            ID = id;
            Color = color;
            NumOfShapes++;
        }

        public abstract double CalculateArea();
        public abstract double CalculatePerimeter();

        public override string ToString()
        {
            return $"ID: {ID}, Color: {Color}";
        }
    }

    class Rectangle : Shape
    {
        private double width;
        private double height;

        public double Width
        {
            get { return width; }
            set
            {
                if (value > 0) width = value;
                else throw new Exception("Width must be greater than 0");
            }
        }

        public double Height
        {
            get { return height; }
            set
            {
                if (value > 0) height = value;
                else throw new Exception("Height must be greater than 0");
            }
        }

        public Rectangle(int id, string color, double width, double height) : base(id, color)
        {
            this.Width = width;
            this.Height = height;
        }

        public override double CalculateArea()
        {
            return Width * Height;
        }

        public override double CalculatePerimeter()
        {
            return 2 * (Width + Height);
        }

        public override string ToString()
        {
            return base.ToString() + $", Area: {CalculateArea()}, Perimeter: {CalculatePerimeter()}";
        }
    }

    class Square : Shape
    {
        private double side;

        public double Side
        {
            get { return side; }
            set
            {
                if (value > 0) side = value;
                else throw new Exception("Side length must be greater than 0");
            }
        }

        public Square(int id, string color, double side) : base(id, color)
        {
            this.Side = side;
        }

        public override double CalculateArea()
        {
            return Side * Side;
        }

        public override double CalculatePerimeter()
        {
            return 4 * Side;
        }

        public override string ToString()
        {
            return base.ToString() + $", Area: {CalculateArea()}, Perimeter: {CalculatePerimeter()}";
        }
    }

    class Circle : Shape
    {
        private double radius;

        public double Radius
        {
            get { return radius; }
            set
            {
                if (value > 0) radius = value;
                else throw new Exception("Radius must be greater than 0");
            }
        }

        public Circle(int id, string color, double radius) : base(id, color)
        {
            this.Radius = radius;
        }

        public override double CalculateArea()
        {
            return Math.PI * Math.Pow(Radius, 2);
        }

        public override double CalculatePerimeter()
        {
            return 2 * Math.PI * Radius;
        }

        public override string ToString()
        {
            return base.ToString() + $", Area: {CalculateArea()}, Perimeter: {CalculatePerimeter()}";
        }
    }

}
