namespace BaiTapOPP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Tạo một hình chữ nhật
            Rectangle rectangle = new Rectangle(1, "Red", 5, 10);
            Console.WriteLine(rectangle.ToString());

            // Tạo một hình vuông
            Square square = new Square(2, "Blue", 4);
            Console.WriteLine(square.ToString());

            // Tạo một hình tròn
            Circle circle = new Circle(3, "Green", 3);
            Console.WriteLine(circle.ToString());

            // In ra tổng số hình đã tạo
            Console.WriteLine($"Total number of shapes: {Shape.NumOfShapes}");
        }
    }
}
