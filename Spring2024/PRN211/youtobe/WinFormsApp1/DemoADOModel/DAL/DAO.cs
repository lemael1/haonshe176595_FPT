using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Data;

namespace DemoADOModel.DAL
{
    internal class DAO
    {
        public static SqlConnection GetConnection()
        {
            string ConnectionStr = "server=ADMIN-PC\\SQLEXPRESS;database=MyStudentData;user=sa;password=1111";
            return new SqlConnection(ConnectionStr);
        }
        public static DataTable GetDataBySQL(String sql)
        {
            SqlCommand command= new SqlCommand(sql,GetConnection());
            SqlDataAdapter adapter = new SqlDataAdapter();
            adapter.SelectCommand= command;
            DataTable dt = new DataTable();
            adapter.Fill(dt);
            return dt;
        }
        public static DataTable GetDataBySQL(String sql,params SqlParameter[] parameters)
        {
            SqlCommand command = new SqlCommand(sql, GetConnection());
            command.Parameters.Add(parameters);
            SqlDataAdapter adapter = new SqlDataAdapter();
            adapter.SelectCommand = command;
            DataTable dt = new DataTable();
            adapter.Fill(dt);
            return dt;
        }
    }
}
