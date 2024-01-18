using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace baitaplinQ
{
    internal class StudentManager
    {
        List<Student> students;
        public StudentManager() {
            students = new List<Student>();
        }
        public void InitData()
        {
            students.Add(new Student(13, "Hao", 15,"nam",10,"SE1759"));
            students.Add(new Student(13, "Hao1", 15, "nam", 10, "SE1759"));
            students.Add(new Student(16, "Hao", 15, "nam", 10, "SE1759"));
            students.Add(new Student(18, "Hao1", 15, "nam", 10, "SE1759"));
            students.Add(new Student(20, "Hao1", 15, "nam", 10, "SE1759"));
        }
        public void ShowAllStudents()
        {
            foreach (Student student in students)
            {

                Console.WriteLine(students.ToString());
            }
        }
        public void Q1()
        {
            for(int i=0; i<students.Count; i++)
            {
                for(int j=0; j<i; j++)
                {
                    if(i!=j && students[i].Id== students[j].Id&& students[i].Name== students[j].Name
                        && students[i].Age== students[j].Age && students[i].Gender== students[j].Gender
                        && students[i].Score== students[j].Score&& students[i].Class== students[j].Class) students.RemoveAt(i);
                }
            }
        }
    }
}
