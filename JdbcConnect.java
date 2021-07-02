import javax.sql.rowset.JdbcRowSet;
import java.sql.*;

public class JdbcConnect {

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement ps;

    public JdbcConnect()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phanidb",
                    "root","Jesus@54321");
            stmt=con.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void getData()  {
        try {
            rs=stmt.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println("Id : "+rs.getInt(1));
                System.out.println("Name : "+rs.getString(2));
                System.out.println("City : "+rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("hiiii");
        System.out.println("hellooooo");
    }

    public void insertData(){
       stmt.executeQuery("insert into emploeyee ")
    }

    public static void main(String[] args)  {

        JdbcConnect j=new JdbcConnect();
        j.getData();
        j.insertData();
        j.getData();

    }
}
