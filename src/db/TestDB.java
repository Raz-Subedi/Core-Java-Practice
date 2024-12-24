package db;

import java.sql.*;

public class TestDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //get Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb5pm","root","");

        //-------------------------------insert sql-----------------------------------

//        //1.Write sql
//        String sql = "insert into user(username,password) values('Admin','a1e222')";
//
//        //2.Create Statement
//        Statement st = con.createStatement();
//
//        //3.Execute sql
//        st.execute(sql);
//
//        //4. close db
//        con.close();
//
//        System.out.println("Success");
//


        //----------------------------------select sql-----------------------------------
//        String sql = "select * from user";
//        Statement st = con.createStatement();
//
//        ResultSet rs = st.executeQuery(sql);
//
//        while(rs.next()){
//            System.out.println("ID = "+rs.getInt("id"));
//            System.out.println("UserName = "+rs.getString("username"));
//            System.out.println("Password = "+rs.getString("password"));
//            System.out.println("-------------------------");
//        }


        //---------------------------------update sql-----------------------------------------
//        String sql = "update user set password = 'test555' where id = 3";
//        Statement st = con.createStatement();
//
//        st.execute(sql);
//        System.out.println("Success");



        //---------------------------------delete sql----------------------------------
        String sql = "delete from user where id =5";
        Statement st =con.createStatement();

        st.execute(sql);
        System.out.println("Delete Success");


    }
}
