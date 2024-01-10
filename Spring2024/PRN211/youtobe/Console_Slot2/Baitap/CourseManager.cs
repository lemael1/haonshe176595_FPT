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
        public void ReadFromFile(string FileName)
        {
            courses.Clear();
            try
            {
                using (StreamReader reader = new StreamReader(FileName))
                {
                    string line;
                    while ((line = reader.ReadLine()) != null)   //C|1|MAS|1 Jan 2023|meet.....
                    {                     
                        Course c;
                        if (line[0] == 'C') {                          
                            c = new Course();
                        }
                        else {
                            c = new OnlineCourse();
                        }
                        c.ReaderFromText(line);
                        courses.Add(c);
                    }
                }           
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
