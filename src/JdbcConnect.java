
import java.sql.*;
import java.util.Scanner;

public class JdbcConnect {

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;

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
//        System.out.println("hiiii");
//        System.out.println("hellooooo");
    }

    public void insertData(String name,String city) throws SQLException {
      //  stmt.executeUpdate("insert into employee(name,city) values('Emp3','Chennai')");
        pst=con.prepareStatement("insert into employee(name,city) values(?,?)");
        pst.setString(1,name);
        pst.setString(2,city);
        pst.execute();
        System.out.println("Data inserted...");
    }

    public void updateData(){
        try {
            stmt.executeUpdate("update employee set name='Emp4', city='Hyderabad' where id=3");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Employee updated...");
    }

    public void deleteData(){
        try {
            stmt.executeUpdate("delete from employee where id=3");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Employee deleted...");
    }

    public static void main(String[] args)  {

        JdbcConnect j=new JdbcConnect();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter City: ");
        String city=sc.next();
        try {
            j.insertData(name,city);
        } catch (SQLException e) {
            e.printStackTrace();
        }
       // j.updateData();
      //  j.deleteData();
        j.getData();
    }
}

// Fetch data from multiple tables
// Insert, update, delete, select based on user inputs
// Stored procedure calling / CallableStatement
// Implement using the switch

// throws and throw keywords in exception