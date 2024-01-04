﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baitap
{
    internal class Course
    {
        public int Id { get; private set; }
        public string Title { get; private set; }
        public DateTime StartDate { get; set; }


        // Input function
        public virtual void input()
        {
            Console.WriteLine("Input id");
            Id = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Input title course");
            Title = Console.ReadLine();
            Console.WriteLine("Input the startDate");
            StartDate = DateTime.ParseExact(Console.ReadLine(), "dd-MM-yyyy", null);
        }



        //ToString Property
        public override string ToString()
        {
            return $"ID: {Id}, CourseName : {Title} , StartDate :{StartDate}";
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
