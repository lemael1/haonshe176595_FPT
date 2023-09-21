
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Department;

public class DepartmentDAO extends DBContext {

    public List<Department> getAllDepts() {
        List<Department> list = new ArrayList<>();
        String sql = "SELECT id,name FROM Department";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Department d = new Department();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                list.add(d);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }
}
