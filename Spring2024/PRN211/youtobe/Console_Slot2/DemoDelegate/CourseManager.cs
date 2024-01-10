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



      
         public void ShowAllCourses()
        {
            foreach( Course course in courses)
            {
                Console.WriteLine(course.ToString());
            }
        }
       
        
        public void InitData()
        {
            courses.Add(new Course(13, "MAS", new DateTime(2023,6,7)));
            courses.Add(new Course(17, "PAS", new DateTime(2023, 10, 7)));
            courses.Add(new Course(15, "AS", new DateTime(2023, 12, 7)));
            courses.Add(new Course(13, "SAS", new DateTime(2023, 11, 7)));
        }
       public void SortByTitlte()
        {
            courses.Sort((x,y)=> x.Title.CompareTo(y.Title));
        }
        public void SortById()
        {
            courses.Sort((x,y)=> x.Id.CompareTo(y.Id));
        }
       


    }
}
