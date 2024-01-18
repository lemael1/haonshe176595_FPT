namespace LinQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            StudentManager manager = new StudentManager();

            // Initialize the data
            manager.InitData();

            // Show all students
            Console.WriteLine("All students:");
            manager.ShowAllStudents();

            // Test Q1
            Console.WriteLine("\nAfter removing duplicates:");
            manager.Q1();

            // Test Q2
            Console.WriteLine("\nGrouped by class:");
            manager.Q2();

            // Test Q3
            Console.WriteLine("\nStudents with age 15:");
            manager.Q3(15);

            // Test Q4
            Console.WriteLine("\nCount of students with score > 90:");
            manager.Q4();

            // Test Q5
            Console.WriteLine("\nTop 5 students by score:");
            manager.Q5(5);

            Console.ReadKey();
        }
    }
}
