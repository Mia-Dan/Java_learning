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
            


            // SELECT
            System.out.println("\nSELECT");

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


            // 4. select. 执行 select 语句使用 preparedStatement.executeQuery()
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



            // INSERT
            System.out.println("\nINSERT");

            //3.1 PreparedStatement-2
            // String sql;
            sql = "insert into designation values(null, ?)";
            // PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql);
            // Scanner scanner = new Scanner(System.in);
            scanner = new Scanner(System.in);
            System.out.println(sql); // 提示语
            // String userInput = scanner.nextLine();
            userInput = scanner.nextLine();

            preparedStatement.setString(1, userInput); // start from 1. 1 for 1st '?'

            // 输出用variable
            // int code;
            // String title;

            // 4. insert. 执行 select 语句使用 preparedStatement.executeUpdate()
            int rowsInserted = preparedStatement.executeUpdate(); 
            System.out.println(rowsInserted > 0 ? "insert - successed" : "insert - failed");


            // show (3.1 select)
            sql = "select * from designation";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code + " Title : " + title);
            }



            // // 3.3 modify
            // // 3.4 delete
            // `dml` similar to insert


            // 5. 关闭连接资源
            resultSet.close(); 
            preparedStatement.close(); // 如果不关闭，每次有程序都建立一个连接并保持，终有一日新的程序会连接不上
            connection.close();

        }
        catch (Exception exception) {
            System.out.println(exception);
        }

    } // function ends

} // class ends









// About SQL

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
