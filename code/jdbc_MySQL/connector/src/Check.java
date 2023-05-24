/**
 * Check MySQL Database Connection
 *      by try accessing data in it
 */

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class Check {

    public static void main(String arg[])
    {
        try {

            // 1. 向项目中导入jar包
            // see notes

            // 2. 得到连接 for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root", "root1234"
                );
            // `jdbc:mysql://`: 协议，通过 jdbc 的方式连接 mysql
            // `localhost`: 主机，可以是 ip 地址
            // `3306`: MySQL 监听的端口
            // mysql 的连接本质是 socket 连接
            // `testdb`: name of database (in MySQL DBMS)
            // `root`: username of database
            // `root1234`: password of database

            System.out.println("Login success ");
            
            //3. 执行 sql
            // statement 用于执行静态 SQL 语句并返回其生成的结果的对象
            Statement statement = connection.createStatement();
            String sql = "select * from designation";
            ResultSet resultSet = statement.executeQuery(sql);

            // 4. 使用结果（e.g., 输出）
            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code + " Title : " + title);
            }

            // 5. 关闭连接资源
            resultSet.close();
            statement.close();
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
