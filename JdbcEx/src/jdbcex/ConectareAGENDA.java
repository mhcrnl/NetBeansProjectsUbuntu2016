/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class ConectareAGENDA {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/AGENDA";
    static final String USER = "root";
    static final String PASS = "db24cor";
    
    static Connection con = null;
    static Statement stmt = null;
    static PreparedStatement preparedStatement = null;
    
    public Connection conectareAgenda() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectarea la baza de date...................");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Conectarea la baza de date s-a facut ........");
            return con;
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void creareTabelDBAgenda(Connection con){
        try {
            System.out.println("Crearea tabelului agenda in Baza de date AGENDA..");
            stmt = con.createStatement();
            String sql = "CREATE TABLE agenda"+
                    "(id INTEGER not NULL, " +
                    "nume VARCHAR(255), " +
                    "prenume VARCHAR(255), " +
                    "telefon VARCHAR(10), " +
                    "email VARCHAR(255), "+
                    "PRIMARY KEY(id))";
            stmt.executeUpdate(sql);
            System.out.println("Tabelul agenda a fost creat ......");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("La revedere!");
        
    }
    
    public void insertDataInAgenda(Connection con){
        try {
            System.out.println("Inserarea datelor in agenda .....................");
                                 
            Scanner in = new Scanner(System.in);
            System.out.println("Introduce-ti un numar ID: ");
            int id = Integer.parseInt(in.nextLine());
            //in.nextLine();
            //in.skip("[\r\n]+");
            System.out.println("Introduce-ti numele dvs: ");
            String nume = in.nextLine();
            System.out.println("Introduce-ti prenumele dvs: ");
            String prenume = in.nextLine();
            System.out.println("Introduce-ti numarul de telefon: ");
            String telefon = in.nextLine();
            System.out.println("Introduce-ti adresa de email: ");
            String email = in.nextLine();
            String sql = "INSERT INTO agenda" +
                    "(id, nume, prenume, telefon, email)" +
                    "VALUES(?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nume);
            preparedStatement.setString(3, prenume);
            preparedStatement.setString(4, telefon);
            preparedStatement.setString(5, email);
            preparedStatement.executeUpdate();
        } catch (SQLException es) {
            es.printStackTrace();
        }
        System.out.println("Datele au fost adaugate!");
    }
    
    public static void main(String[] args) {
        ConectareAGENDA ca = new ConectareAGENDA();
        ca.conectareAgenda();
        //ca.creareTabelDBAgenda(con);
        ca.insertDataInAgenda(con);
        try {
            con.close();
            //stmt.close();// aceasta linie se activeaza la crearea tabelului
            preparedStatement.close();
            System.out.println("Conexiunea a fost inchisa....................");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("LA REVEDERE!");
    }
    
}
