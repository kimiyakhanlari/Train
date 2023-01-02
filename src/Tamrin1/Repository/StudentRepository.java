package Tamrin1.Repository;

import java.sql.*;

public class StudentRepository {

    public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.121:1521/lcdev", "train", "train");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void findAll() {

        try {
         Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select * from STUDENT");
            while(rs.next())
                System.out.println(rs.getInt(1)+""+rs.getString(2));

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
