using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baitap
{
    internal class Course : IComparable<Course>
    {
        public int Id { get; private set; }
        public string Title { get; private set; }
        public DateTime StartDate { get; set; }


        // Input function
        public virtual void input()
        {
            Console.WriteLine("Input id");
            Id = Validation.GetInt(1,1000,"Vui Long Nhap So");
            Console.WriteLine("Input title course");
            Title = Validation.GetString("Vui Long Nhap Title");
            Console.WriteLine("Input the startDate");
            StartDate = Validation.GetDate(new DateTime(2023, 1, 1),new DateTime(2023, 12, 30)
                , "Vui long nhap ngay", "dd-MM-yyyy");
            /*StartDate = Convert.ToDateTime(Console.ReadLine());*/
        }



        //ToString Property
        public override string ToString()
        {
            return $"ID: {Id}, CourseName : {Title} , StartDate :{StartDate.ToString("dd-MM-yyyy")}";
        }

        public int CompareTo(Course other)
        {
            return this.Title.CompareTo(other.Title);
        }


        // Create Constructor



        public Course() { }
        public Course(int id, string title, DateTime startDate)
        {
            Id = id;
            Title = title;
            StartDate = startDate;
        }
    }
    class OnlineCourse : Course
    {


        public string MeetLink { get; private set; }


        // Create Constructor

        public OnlineCourse() { }
        public OnlineCourse(int id, string title, DateTime startDate,string meetlink) : base(id, title, startDate)
        {
            MeetLink= meetlink;
        }

        public override void input()
        {
            base.input();
            Console.WriteLine("Input MeetLink");
            MeetLink = Console.ReadLine();
        }

        public override string ToString()
        {
            return base.ToString() + $"MeetLink : {MeetLink}";
        }
    }
}
