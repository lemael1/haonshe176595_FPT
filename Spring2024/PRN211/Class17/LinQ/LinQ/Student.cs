using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LinQ
{
    internal class Student
    {
        public int Id { get; set; }
        public string Name { get; set; }    
        public int Age {  get; set; }
        public string Gender { get; set; }
        public int Score {  get; set; }
        public string Class {  get; set; }

       public Student(int id, string name, int age, string gender, int score, string @class)
        {
            Id = id;
            Name = name;
            Age = age;
            Gender = gender;
            Score = score;
            Class = @class;
        }
        public Student() { }

        public override string? ToString() => $"Id: {Id} , Name :{Name} , Age :{Age}, Gender: {Gender}, Score: {Score}, Class:{Class}";
        
    }
}
