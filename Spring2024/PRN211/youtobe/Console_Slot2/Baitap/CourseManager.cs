using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Baitap
{
    internal class CourseManager
    {
        List<Course> courses;
        public CourseManager() { courses = new List<Course>(); }



        public void InputListofCourse()
        {
            while (true)
            {
                Console.WriteLine("Course(C)? OnlineCourse(O) ? Stop(S)");
                string type=Console.ReadLine();
                if(type.ToUpper().Equals("S")) break;
                Course c;
                if (type.ToUpper().Equals("C")) c = new Course();
                else c= new OnlineCourse();
                c.input();
                courses.Add(c);
            }
        }
         public void ShowAllCourses()
        {
            foreach( Course course in courses)
            {
                Console.WriteLine(course.ToString());
            }
        }
        public void Search(DateTime startDate,DateTime endDate)
        {
            foreach(Course course in courses)
            {
                if(course.StartDate>=startDate && course.StartDate <= endDate)
                {
                    Console.WriteLine(course.ToString());
                }
            }
        }
        public void SearchByDate()
        {
            Console.WriteLine("Input the startDate");         
            DateTime startDate = DateTime.ParseExact(Console.ReadLine(), "dd-MM-yyyy", null);
            Console.WriteLine("Input the endDate");
            DateTime endDate = DateTime.ParseExact(Console.ReadLine(), "dd-MM-yyyy", null);
            Search(startDate, endDate);
          

        }
        public void InitData()
        {
            courses.Add(new Course(13, "MAS", new DateTime(2023,6,7)));
            courses.Add(new Course(17, "PAS", new DateTime(2023, 10, 7)));
            courses.Add(new Course(15, "AS", new DateTime(2023, 12, 7)));
            courses.Add(new Course(13, "SAS", new DateTime(2023, 11, 7)));
        }
        public void Sort()
        {
            courses.Sort();
        }
        public void ReadFromFile()
        {
            try
            {
                using (StreamReader sr = new StreamReader("C:\\Users\\Admin\\Desktop\\Sample.txt"))
                {
                    string line;
                    while ((line = sr.ReadLine()) != null)
                    {
                        if (!string.IsNullOrWhiteSpace(line))
                        {
                            SplitForObject(line);
                        }
                    }
                }
                Console.ReadLine();
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: " + e.Message);
            }
            finally
            {
                Console.WriteLine("Executing finally block.");
            }
        }

        public void SplitForObject(string line)
        {
            string[] strings = line.Split("|");
            Course c;
            if (strings.Length == 4)
            {
                c = new OnlineCourse(Convert.ToInt32(strings[0]), strings[1],
                    DateTime.ParseExact(strings[2], "dd-MM-yyyy", null), strings[3]);
            }
            else if (strings.Length == 3)
            {
                c = new Course(Convert.ToInt32(strings[0]), strings[1],
                    DateTime.ParseExact(strings[2], "dd-MM-yyyy", null));
            }
            else
            {
                Console.WriteLine("Invalid line format: " + line);
            }
        }
        public void SortById()
        {
            courses.Sort(new IdComparer());
        }
        public void SortByStartDate()
        {
            courses.Sort(new StartDateComparer());
        }
       


    }
}
