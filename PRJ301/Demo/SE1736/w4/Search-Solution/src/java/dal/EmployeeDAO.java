
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Department;
import model.Employee;

public class EmployeeDAO extends DBContext {
    
    public List<Employee> search(Integer id, 
            String name, 
            Boolean gender,
            Date from, Date to, int did) {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT e.id,e.name,e.gender,e.dob,\n"
                + "d.id as did, d.name as dname\n"
                + "FROM Employee e INNER JOIN Department d\n"
                + "ON e.did = d.id WHERE 1 = 1 ";        
        if (id != null) 
            sql += " AND e.id = "+id;        
        if (name != null && !name.equals("")) 
            sql += " AND e.name like '%"+name+"%'";
        if (gender!=null){
            if(gender)
               sql += " AND e.gender = "+1;
            if(gender==false)
               sql += " AND e.gender = "+0;
        }
        if (from != null) 
            sql += " AND e.dob >= '"+from+"'";
        if (to != null) 
            sql += " AND e.dob <= '"+to+"'";

        if (did > 0) 
            sql += " AND d.id = "+did;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getBoolean("gender"));
                e.setDob(rs.getDate("dob"));
                Department d=new Department();
                d.setId(rs.getInt("did"));
                d.setName(rs.getString("dname"));
                e.setDept(d);
                list.add(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }
}
