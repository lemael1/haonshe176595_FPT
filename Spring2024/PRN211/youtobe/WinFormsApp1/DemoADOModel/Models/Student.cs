using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoADOModel.Models
{
    internal class Student
    {
        public int StudentId {  get; set; }
        public String RollNumber {  get; set; }
        public String FirstName {  get; set; }
        public String MidName {  get; set; } 
        public String LastName { get; set; }

        public Student(int studentId, string rollNumber, string firstName, string midName, string lastName)
        {
            StudentId = studentId;
            RollNumber = rollNumber;
            FirstName = firstName;
            MidName = midName;
            LastName = lastName;
        }
    }
}
