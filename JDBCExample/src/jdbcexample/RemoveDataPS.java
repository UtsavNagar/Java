package jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RemoveDataPS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int id = 0;
        
        try{
            System.out.print("Enter id to be deleted : ");
            id = sc.nextInt();  
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        
        try{
            Connection con = Utility.connnectDB();
        
            String sql = "DELETE FROM students WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int n = ps.executeUpdate();
            System.out.println(n + " rows deleted");
    
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
            System.out.print("id Not Found");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
