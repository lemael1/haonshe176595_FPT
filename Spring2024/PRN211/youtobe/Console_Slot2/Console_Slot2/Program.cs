using System;
using Console_Slot2.Model;
using Library;


internal class Program
{
    private static void Main(string[] args)
    {
        Employee e = new Employee();
        Console.WriteLine("Hello World!");
        Student s = new Student();
        s.Id = 12;  // Co dau bang, loi goi den setter

        Console.WriteLine("id =:" + s.Id); // loi goi den getter
        Student s1 = new Student(1, "Nguyen Sy Hao");
        s1.Display();
        SEStudent s2 = new SEStudent(2, "Hao Nuyen Sy", "LOL");
        s2.Display();

        SEStudent s3 = new SEStudent();
        s3.input();
        s3.Display();
    }
}