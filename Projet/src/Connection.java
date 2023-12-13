/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection
{
    private static final String URL = "jdbc:postgresql://localhost:5432/fifidianana";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static Connection connect() throws SQLException 
    {
        Connection con = null;
        // Example:
        con = DriverManager.getConnection(URL, USER, PASSWORD);
        return con;
    }       
}