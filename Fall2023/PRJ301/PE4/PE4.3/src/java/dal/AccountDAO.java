/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;

/**
 *
 * @author 1112v
 */
public class AccountDAO extends DBContext {

    public List<Account> GetAllAccount() {
        String sql = "select * from Account";
        List<Account> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setUserid(rs.getString("userid"));
                a.setPassword(rs.getString("password"));
                a.setDisplayname(rs.getString("displayname"));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public String CheckAccount(String userid, String password) {
        String msg = "";

        AccountDAO accDAO = new AccountDAO();
        List<Account> list = accDAO.GetAllAccount();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserid().equals(userid) && list.get(i).getPassword().equals(password)) {
                msg = "Login successfully";
                break;
            } else {
                msg = "Login failed";
            }
        }
        return msg;
    }

    public Account getAccout(String userid, String password) {
        Account a= new Account();
        String sql = "SELECT [userid]\n"
                + "      ,[password]\n"
                + "      ,[displayname]\n"
                + "  FROM [dbo].[Account]\n"
                + "  where userid=? and password=?";
        try {
            PreparedStatement st= connection.prepareStatement(sql);
            st.setString(1,userid);
            st.setString(2,password);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
            a.setUserid(rs.getString("userid"));
            a.setPassword(rs.getString("password"));
            a.setDisplayname(rs.getString("displayname"));
            
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        return a;
    }
   public Account getAccoutbyUserID(String userid) {
    Account a= new Account();
    String sql = "SELECT [userid]\n"
            + "      ,[password]\n"
            + "      ,[displayname]\n"
            + "  FROM [dbo].[Account]\n"
            + "  where userid=?";
    try {
        PreparedStatement st= connection.prepareStatement(sql);
        st.setString(1, userid); // Sử dụng biến userid
        ResultSet rs= st.executeQuery();
        while(rs.next()){
        a.setUserid(rs.getString("userid"));
        a.setPassword(rs.getString("password"));
        a.setDisplayname(rs.getString("displayname"));

        }
    } catch (SQLException e) {
        System.out.println(e);
    }


    return a;
}


}
