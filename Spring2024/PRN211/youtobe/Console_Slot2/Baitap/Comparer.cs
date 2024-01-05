using Baitap;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baitap
{
     class IdComparer : IComparer<Course>
{
        public int Compare(Course c1, Course c2)
        {
            return c1.Id.CompareTo(c2.Id);
        }
}
    class StartDateComparer: IComparer<Course>
    {
        public int Compare(Course c1, Course c2)
        {
            return c1.StartDate.CompareTo(c2.StartDate);
        }
    }
}
