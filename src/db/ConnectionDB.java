/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author e2a
 */
public class ConnectionDB {
    public static Connection createConnection() throws SQLException{
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL="jdbc:mysql://localhost:3306/pbo_modul14?serverTimezone=Asia/Jakarta" ;
        String DB_USERNAME="root"; 
        String DB_PASSWORD= "";
        
        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        
        Connection conn = dataSource.getConnection();
        return conn;
    }
   
}
