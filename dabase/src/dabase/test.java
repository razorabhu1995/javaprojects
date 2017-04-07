package dabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class test {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
        try{
      
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
        Statement state =conn.createStatement();
        ResultSet myRs = state.executeQuery("select * from mytable");
        while(myRs.next()){
            System.out.println(myRs.getString("id")+myRs.getString("name") + myRs.getString("address"));
        }
        }catch(SQLException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

	}

}
