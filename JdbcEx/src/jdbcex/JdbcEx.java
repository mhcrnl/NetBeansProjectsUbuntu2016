/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mhcrnl
 */
public class JdbcEx {
    
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306";
   static final String USER = "root";
   static  final String PASS = "db24cor";
    
    
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectarea la baza de date ..................");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Crearea bazei de date AGENDA.................");
            stmt = con.createStatement();
            String sql = "CREATE DATABASE AGENDA";
            stmt.executeUpdate(sql);
            System.out.println("Baza de date AGENDA a fost creata............");
            
        } catch (SQLException se) {
            se.printStackTrace(); // erorile din JDBC
        } catch (Exception e) {
            e.printStackTrace(); // erorile din Class.forName
        } finally {
            try {
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException se){
                //nu se face nimic
            } 
            try { if (con != null) con.close();
                
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
        
    }
    
}
