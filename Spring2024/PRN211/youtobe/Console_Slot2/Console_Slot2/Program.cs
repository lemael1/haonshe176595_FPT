using System;
using System.Collections;
using System.Collections.Generic;
using Console_Slot2.Model;
using Library;


internal class Program
{
    private static void Main(string[] args)
    {
        /*Employee e = new Employee();
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
        s3.Display();*/

        // *************** Slot 3 ****************
        /*SEStudent s;
        s = new SEStudent(1, "Nguyen Sy Hao", ".NET");*/
        //s.Display();
        /*Console.WriteLine(s.ToString());*/


        /* Student s1 = new Student(1, "hao");
         Student s2 = new Student(1, "hao");
         if (s1.Equals(s2)) { Console.WriteLine("Bang nhau"); } 
         else { Console.WriteLine("Khong bang nhau"); }
        */
        DemoArrayList();
        DemoList();
    }

    private static void DemoList()
    {
        List<int> l1= new List<int>();
        l1.Add(1);          
        l1.Add(2);
            l1.Add(3);
        int sum = l1[0] + l1[1];
       Console.WriteLine(sum);
    }  

    public static void DemoArrayList()
    {
         ArrayList a= new ArrayList();
        a.Add(1);
            a.Add(2);
        a.Add(3);
        int sum = (int)a[1] + (int)a[2];
        Console.WriteLine(sum);

    }
}