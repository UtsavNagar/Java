import java.sql.*;


public class DataEntry {
    public static void main(String[] args) {
        try {
            //step - 1
            Class.forName("com.mysql.cj.jdbc.Driver");  // Correct driver class name
            System.out.println("Driver Loaded");
    //------------------------------------------------------------------------------------        
            // step - 2
            String url = "jdbc:mysql://localhost:3306/school";
            String userid = "root";
            String password = "root";
            
            Connection con = DriverManager.getConnection(url,userid,password);
            System.out.println("Database Connected");
    //------------------------------------------------------------------------------------        
            
            //step - 3
            
            Statement stmt = con.createStatement();

    //------------------------------------------------------------------------------------        
            
            // step - 4
            
            String sqlCmd = "INSERT INTO users (username, password, email) VALUES ('Utsav','1234','un@email.com')";
            
            stmt.executeUpdate("INSERT INTO students (name, branch, sem) VALUES ('Utsav','CS','1')");
            stmt.executeUpdate("INSERT INTO students (name, branch, sem) VALUES ('Raj','IT','2')");
            stmt.executeUpdate("INSERT INTO students (name, branch, sem) VALUES ('Jaya','Mech','4')");
            stmt.executeUpdate("INSERT INTO students (name, branch, sem) VALUES ('Uma','CS','1')");
            stmt.executeUpdate("INSERT INTO students (name, branch, sem) VALUES ('K','Med','1')");
            
            System.out.println("Row Added");
    //------------------------------------------------------------------------------------       
    
            con.close(); // close the connection
    
    //------------------------------------------------------------------------------------        
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } 
    }
}
