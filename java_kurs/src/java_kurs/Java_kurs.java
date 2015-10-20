/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_kurs;

import java.sql.*;

/**
 *
 * @author macbook
 */
public class Java_kurs {
public static final String USERNAME = "";
	public static final String PASSWORD = "";
	public static final String CONN_STRING = 
			"jdbc:mysql://localhost/";

    public static void main(String[] args) {
 Statement stmt = null;
Connection conn = null;        

try {
conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
    System.out.println("Connected to MySql DB");
}catch(SQLException e){System.err.println(e); }
// TODO code application logic here
    try {Statement st = conn.createStatement();
        //int id = Q;
    String sql = "CREATE DATABASE Magnus" ;      
  //  String sql = "SELECT Name FROM Users WHERE Id = " + id;
//ResultSet rs = st.executeQuery(sql);
// ... read from result set ...
//rs.getSQLXML(sql);
    }catch(SQLException e){System.err.println(e);}
    
    String query = "select COF_NAME, SUP_ID, PRICE, " +
                   "SALES, TOTAL " +
                   "from " + "dbName" + ".COFFEES";
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String coffeeName = rs.getString("COF_NAME");
            int supplierID = rs.getInt("SUP_ID");
            float price = rs.getFloat("PRICE");
            int sales = rs.getInt("SALES");
            int total = rs.getInt("TOTAL");
            System.out.println(coffeeName + "\t" + supplierID +
                               "\t" + price + "\t" + sales +
                               "\t" + total);
        }
    } catch (SQLException e ) {
//       
//    } finally {
//        if (stmt != null) { stmt.close(); }
//    }
    
    
    }
    
}
}