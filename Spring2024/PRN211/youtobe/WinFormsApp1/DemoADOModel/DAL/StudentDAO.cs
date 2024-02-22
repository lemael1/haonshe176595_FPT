using DemoADOModel.Models;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoADOModel.DAL
{
    internal class StudentDAO
    {
        public List<Student> GetAllStudent() {
            String sql = "select * from Students";
            DataTable dt = DAO.GetDataBySQL(sql);
            List<Student> students= new List<Student>();
            foreach (DataRow dr in dt.Rows)
            {
                students.Add(new Student(Convert.ToInt32(dr["StudentId"]), dr["RollNumber"].ToString()
                    , dr["FirstName"].ToString()
                    , dr["MidName"].ToString()
                    , dr["LastName"].ToString()));
            }
            return students;
        }
        public Student GetStudentById(int StudentId) {
            String sql = "select * from Students where StudentId = @sid";
            SqlParameter[] parameters = new SqlParameter[1];
            parameters[0] = new SqlParameter("@sid", DbType.Int32);
            parameters[0].Value=StudentId;
            DataTable dt = DAO.GetDataBySQL(sql, parameters);
            if (dt.Rows.Count == 0) return null;
            DataRow dr = dt.Rows[0];
            return new Student(Convert.ToInt32(dr["StudentId"]), dr["RollNumber"].ToString()
                    , dr["FirstName"].ToString()
                    , dr["MidName"].ToString()
                    , dr["LastName"].ToString());

        }
    }
}
