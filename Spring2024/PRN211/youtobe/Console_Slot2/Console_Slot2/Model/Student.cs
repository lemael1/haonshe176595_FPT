using System;

namespace Console_Slot2.Model
{
    internal class Student
    {
        // private field
        int id;
        /*string name;*/
        // property
        public int Id
        {
            get
            {
                return id;
            }
            set
            {
                if (value > 0)
                {
                    id = value;
                }
                else { id = 0; }
            }
        }
        /* public string Name
         {
             get { return name; }
             set { name = value; }
         }*/
        //Viet tat
        public string Name { get; set; }  //Should use when in property don't have logic

        public Student(int id, string name)
        {
            Id = id;
            Name = name;
        }

        public Student()
        {
        }
        public void Display() {
            Console.WriteLine($"Student: Id:{Id}, Name:{Name}");
        }
        public void input()
        {
            Console.WriteLine("Input Id :");
            Id = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Input Name:");
            Name=Console.ReadLine();
        }
    }
      class SEStudent : Student
    {
        public string Skill {  get; set; }

        public SEStudent(int id,string name,string skill):base(id,name) // loi goi ham tao lop cha
        {
            Skill = skill;
        }
        public void Display()
        {
            base.Display();
            Console.WriteLine($"Skill:{Skill}");
        }
        public void input()
        {
            base.input();
            Console.WriteLine("Input Skill");
            Skill=Console.ReadLine();
        }

        public SEStudent()
        {
        }
    }
}
