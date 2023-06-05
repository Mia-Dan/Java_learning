/**
 * Lab on MySQL Database using Java
 */

import java.sql.*;
import com.mysql.cj.jdbc.Driver;



public class Lab {

    public static void main(String arg[])
    {
        try {

            // 1. 向项目中导入jar包
            // see notes


            // 2. connectivity. 得到连接/connect to db
            Class.forName("com.mysql.cj.jdbc.Driver"); //%%% what's this
            // `jdbc:mysql://`: 协议，通过 jdbc 的方式连接 mysql
            // `localhost`: 主机，可以是 ip 地址（比如要连接到其他机器上了）
            // `3306`: MySQL 默认监听的端口
            // mysql 的连接本质是 socket 连接
            // `testdb`: name of database (in MySQL DBMS)，MySQL这个DBMS会管理多个db
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root"; // username of database
            String pwd = "root1234"; // password of database
            Connection connection = DriverManager.getConnection(
                url, user, pwd
                );
            System.out.println("Login success ");
            

            //3. 执行 sql

            // statement 用于
            //   1. 发送到MySQL并执行静态 SQL 语句，并
            //   2. 从MySQL返回其生成的结果的对象
            // 执行SQL语句，靠的是statement对象。
            // 有statement.executeQuery(sql)（查），和statement.executeUpdate(sql)（增删改）
            Statement statement = connection.createStatement();
            // sql字符串
            String sql;

            // 输出用variable
            int code;
            String title;


            // 3.1 select
            System.out.println("\nSELECT");
            sql = "select * from designation";
            ResultSet resultSet = statement.executeQuery(sql); // 查询语句，返回查询结果
            System.out.println(resultSet); // %%%是set吗？
            // 输出
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code + " Title : " + title);
            }


            // 3.2 insert
            System.out.println("\nINSERT");
            sql = "insert into designation values(null, 'Alice')";
            int rowsInserted = statement.executeUpdate(sql); // dml语句，返回的就是影响行数
            System.out.println(rowsInserted > 0 ? "Alice - successed" : "Alice - failed");

            // show (3.1 select)
            sql = "select * from designation";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code + " Title : " + title);
            }


            // 3.3 modify
            System.out.println("\nMODIFY");
            sql = "UPDATE designation SET code=3 WHERE title='Alice'";
            int rowsUpdated = statement.executeUpdate(sql); // dml语句，返回的就是影响行数
            System.out.println(rowsUpdated > 0 ? "modify Alice - successed" : "modify Alice - failed");

            // show (3.1 select)
            sql = "select * from designation";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code + " Title : " + title);
            }


            // 3.4 delete
            System.out.println("\nDELETE");
            sql = "delete from designation where title = 'Alice'";
            int rowsDeleted = statement.executeUpdate(sql); // 如果是 dml语句，返回的就是影响行数
            System.out.println(rowsDeleted > 0 ? "title = 'bbb' delete - successed" : "title = 'bbb' delete - failed");

            // show (3.1 select)
            sql = "select * from designation";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code + " Title : " + title);
            }



            // 5. 关闭连接资源
            resultSet.close(); // ？%%%
            statement.close(); // 如果不关闭，每次有程序都建立一个连接并保持，终有一日新的程序会连接不上
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
