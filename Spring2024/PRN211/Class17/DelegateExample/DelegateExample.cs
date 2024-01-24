using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateExample
{
    internal class CarEventArgs:EventArgs
    {
        public readonly string msg;
        public CarEventArgs(string msg)=> this.msg = msg;    
    }
}
