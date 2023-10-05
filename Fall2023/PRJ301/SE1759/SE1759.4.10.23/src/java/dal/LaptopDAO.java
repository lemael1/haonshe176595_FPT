/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Laptop;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 1112v
 */
public class LaptopDAO extends DBContext {

    public List<Laptop> getAll() {
        List<Laptop> list = new ArrayList<>();
        String sql = "select * from Laptop";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Laptop c = new Laptop(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price"),
                        rs.getString("color"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);

        }

        return list;
    }

}
