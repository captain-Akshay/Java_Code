package javaDatabase;
import java.sql.*;
public class mongodb{
    public static void main(String[] args) {
        try {
            String dbUrl="jdbc:mysql://localhost:3306/products";
            String username="root";
            String password="sumansharma1997";
            Connection myConnection=DriverManager.getConnection(dbUrl,username,password);
            Statement myStatement=myConnection.createStatement();
            ResultSet myResult=myStatement.executeQuery("Select * from products");
            while(myResult.next()){
                System.out.println(myResult.getString("id"));
            }
}catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
