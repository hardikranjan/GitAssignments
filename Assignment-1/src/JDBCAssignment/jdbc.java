package JDBCAssignment;

/**
 * Created by hardikranjan on 25/02/17.
 */
import java.util.*;
import java.sql.*;
public class jdbc
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        //1. Driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Installed");

        //2. Connection
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "password");
        System.out.println("Connection Established");

        //3. Create Statement
        Statement st = con.createStatement();
        System.out.println("Statement Clause Executed");

        /*
        int no;
        String s1, s2;
        no = sc.nextInt();
        s1 = sc.next();
        s2 = sc.next();
        */

        //4. Execute Query
        //A. CREATE
        //String str1 = "create table hardik1(id int(3) primary key,name varchar(20),email varchar(20))";
        //st.execute(str1);

        //B. INSERT
        //String str2 = "insert into hardik(id,name,email) values('2','hhh','hagmail')";
        //st.execute(str2);

        //B. INSERT WITH ENTERING VALUES BY USERS
        //String str21 = "insert into hardik(id,name,email) values(" +no +"','"+s1+"','"+s2+"')";
        //st.execute(str21);

        //C. DISPLAY
        ResultSet rst = st.executeQuery("select * from hardik");
        System.out.println("\nDATA IN DATABASE\n");
        while (rst.next())
        {
            try
            {
                System.out.print(rst.getString(1)+ " ");
                System.out.print(rst.getString(2) + " ");
                System.out.println(rst.getString(3));
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

        //D. DELETE
        //st.executeUpdate("delete from Student");

        System.out.println("\nExecuted");
        con.close();
    }
}