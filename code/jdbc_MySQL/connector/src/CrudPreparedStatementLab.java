/**
 * Lab on MySQL Database using Java
 * -  CRUD
 * -  with preparedStatement
 */

import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.Scanner;

public class CrudPreparedStatementLab {

    public static void main(String arg[])
    {
        try {

            // 1. 向项目中导入jar包
            // see notes

            // register driver
            Class.forName("com.mysql.cj.jdbc.Driver"); //%%% what's this


            // 2. connectivity. 得到连接/connect to db
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root"; // username of database
            String pwd = "root1234"; // password of database
            Connection connection = DriverManager.getConnection(
                url, user, pwd
                );
            System.out.println("Login success ");
            

            //3.1 PreparedStatement-1
            String sql;
            sql = "select * from designation where code=?";
            // Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            Scanner scanner = new Scanner(System.in);
            System.out.println(sql);
            String userInput = scanner.nextLine();
            // System.out.println(userInput);

            preparedStatement.setString(1, userInput); // start from 1. 1 for 1st '?'
            // System.out.println(preparedStatement); // e.g. com.mysql.cj.jdbc.ClientPreparedStatement: select * from designation where code='1'

            // 输出用variable
            int code;
            String title;


            // 4. select. 执行 select 语句使用 preparedStatement.executeQuery(sql)
            System.out.println("\nSELECT");
            // ResultSet resultSet = statement.executeQuery(sql); // 查询语句，返回查询结果
            // ResultSet resultSet = preparedStatement.executeQuery(sql); // X 不需要String sql，否则不认识
            ResultSet resultSet = preparedStatement.executeQuery(); // 查询语句，返回查询结果

            // System.out.println(resultSet); 
            // 输出
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code + " Title : " + title);
            }


            // // 3.2 insert
            // System.out.println("\nINSERT");
            // sql = "insert into designation values(null, 'Alice')";
            // int rowsInserted = statement.executeUpdate(sql); // dml语句，返回的就是影响行数
            // System.out.println(rowsInserted > 0 ? "Alice - successed" : "Alice - failed");

            // // show (3.1 select)
            // sql = "select * from designation";
            // resultSet = statement.executeQuery(sql);
            // while (resultSet.next()) {
            //     code = resultSet.getInt("code");
            //     title = resultSet.getString("title").trim();
            //     System.out.println("Code : " + code + " Title : " + title);
            // }


            // // 3.3 modify
            // System.out.println("\nMODIFY");
            // sql = "UPDATE designation SET code=3 WHERE title='Alice'";
            // int rowsUpdated = statement.executeUpdate(sql); // dml语句，返回的就是影响行数
            // System.out.println(rowsUpdated > 0 ? "modify Alice - successed" : "modify Alice - failed");

            // // show (3.1 select)
            // sql = "select * from designation";
            // resultSet = statement.executeQuery(sql);
            // while (resultSet.next()) {
            //     code = resultSet.getInt("code");
            //     title = resultSet.getString("title").trim();
            //     System.out.println("Code : " + code + " Title : " + title);
            // }


            // // 3.4 delete
            // System.out.println("\nDELETE");
            // sql = "delete from designation where title = 'Alice'";
            // int rowsDeleted = statement.executeUpdate(sql); // 如果是 dml语句，返回的就是影响行数
            // System.out.println(rowsDeleted > 0 ? "title = 'bbb' delete - successed" : "title = 'bbb' delete - failed");

            // // show (3.1 select)
            // sql = "select * from designation";
            // resultSet = statement.executeQuery(sql);
            // while (resultSet.next()) {
            //     code = resultSet.getInt("code");
            //     title = resultSet.getString("title").trim();
            //     System.out.println("Code : " + code + " Title : " + title);
            // }



            // 5. 关闭连接资源
            resultSet.close(); // ？%%%
            preparedStatement.close(); // 如果不关闭，每次有程序都建立一个连接并保持，终有一日新的程序会连接不上
            connection.close();

        }
        catch (Exception exception) {
            System.out.println(exception);
        }

    } // function ends

} // class ends









// About SQL

//➜  bin mysql -u root -p
//Enter password: 
//Welcome to the MySQL monitor.  Commands end with ; or \g.
//Your MySQL connection id is 13
//Server version: 8.0.15 MySQL Community Server - GPL
//
//Copyright (c) 2000, 2019, Oracle and/or its affiliates. All rights reserved.
//
//Oracle is a registered trademark of Oracle Corporation and/or its
//affiliates. Other names may be trademarks of their respective
//owners.
//
//Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.
//
//mysql> show databases
//    -> ;
//+--------------------+
//| Database           |
//+--------------------+
//| information_schema |
//| mysql              |
//| performance_schema |
//| sys                |
//| testdb             |
//+--------------------+
//5 rows in set (0.00 sec)
//
//mysql> use testdb;
//Reading table information for completion of table and column names
//You can turn off this feature to get a quicker startup with -A
//
//Database changed
//mysql> show tables
//    -> ;
//+------------------+
//| Tables_in_testdb |
//+------------------+
//| aaaStrings       |
//+------------------+
//1 row in set (0.00 sec)
//
//mysql> create table designation
//    -> (
//    ->     code int primary key auto_increment,
//    ->     title char(35) not null unique
//    -> );
//Query OK, 0 rows affected (0.03 sec)
//
//mysql> show tables
//    -> ;
//+------------------+
//| Tables_in_testdb |
//+------------------+
//| aaaStrings       |
//| designation      |
//+------------------+
//2 rows in set (0.00 sec)
//
//mysql> show tables;
//+------------------+
//| Tables_in_testdb |
//+------------------+
//| aaaStrings       |
//| designation      |
//+------------------+
//2 rows in set (0.01 sec)
//
//mysql> describe designation
//    -> ;
//+-------+----------+------+-----+---------+----------------+
//| Field | Type     | Null | Key | Default | Extra          |
//+-------+----------+------+-----+---------+----------------+
//| code  | int(11)  | NO   | PRI | NULL    | auto_increment |
//| title | char(35) | NO   | UNI | NULL    |                |
//+-------+----------+------+-----+---------+----------------+
//2 rows in set (0.11 sec)
//
//mysql> insert into designation values(null,'somechar');
//Query OK, 1 row affected (0.04 sec)
//
//mysql> select * from designation
//    -> ;
//+------+----------+
//| code | title    |
//+------+----------+
//|    1 | somechar |
//+------+----------+
//1 row in set (0.00 sec)
