/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Skill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Employee;

public class DAO extends DBContext {

    //lay toan bo tu bang skill
    public List<Skill> getSkills() {
        List<Skill> list = new ArrayList<>();
        String sql = "select * from skill";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Skill(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException e) {

        }
        return list;
    }

    //insert into 2 bang employee, Employee_Skill
    public void insert(Employee e) {
        try {
            //insert employee
            String sql1 = "INSERT INTO [dbo].[Employee]\n"
                    + "           ([id]\n"
                    + "           ,[name])\n"
                    + "     VALUES\n"
                    + "           (?,?)";

            PreparedStatement st1 = connection.prepareStatement(sql1);
            st1.setInt(1, e.getId());
            st1.setString(2, e.getName());
            st1.executeUpdate();

            //insert Employee_Skill
            List<Skill> list = e.getSkills();
            if (!list.isEmpty()) {
                String sql2 = "INSERT INTO [dbo].[Employee_Skill]\n"
                        + "           ([sid]\n"
                        + "           ,[eid])\n"
                        + "     VALUES\n"
                        + "           (?,?)";
                PreparedStatement st2=connection.prepareStatement(sql2);
                for(Skill s:list){
                    st2.setInt(1, s.getId());
                    st2.setInt(2, e.getId());
                    st2.executeUpdate();
                }
            }

        } catch (SQLException ex) {

        }
    }
    
}
