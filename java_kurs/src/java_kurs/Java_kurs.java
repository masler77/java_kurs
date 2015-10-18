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
public static final String USERNAME = "leray";
	public static final String PASSWORD = "";
	public static final String CONN_STRING = 
				"jdbc:mysql://leray.se/mysql";

    public static void main(String[] args) {

Connection conn = null;        

try {
conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
    System.out.println("Connected to MySql DB");
}catch(SQLException e){System.err.println(e); }
// TODO code application logic here
    }
    
}
