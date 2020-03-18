/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhospital.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import myhospital.User;

/**
 *
 * @author Osagie Erhabor
 */
public class Connect {
    public Connection connect(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(
                    "jdbc:mysql://localhost/my_hospital?useUnicode=true"
                            + "&useJDBCCompliantTimezoneShift=true&"
                            + "useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "osagie", "erhabor");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
