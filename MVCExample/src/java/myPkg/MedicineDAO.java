package myPkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

// write crud operations 

public class MedicineDAO {
    public Connection con;

    public MedicineDAO() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coviddata?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
            System.out.println("DB Connected");
        }catch(Exception e){
            System.out.println("--------------------------------------------------------------------------------------------");
            e.printStackTrace();
        }
    }
    
    public Medicine searchMedicine(int code) throws SQLException{
        Medicine medicine = new Medicine();
        
        PreparedStatement ps = con.prepareStatement("SELECT * FROM medicines WHERE code=?");
        
        ps.setInt(1,code);
        
        ResultSet rs = ps.executeQuery();
        rs.next();
        
        medicine.setCode(rs.getInt(1));
        medicine.setName(rs.getString(2));
        medicine.setType(rs.getString(3));
        medicine.setPrice(rs.getInt(4));
        
        System.out.print("Data Stored in the DB");
        
        return medicine;
    }
    
    // we pass some values and this method will save that data in DB
    public void saveMedicine(Medicine medicine) throws SQLException{
        PreparedStatement ps = con.prepareStatement("INSERT INTO medicines VALUES(?,?,?,?)");
        
        ps.setInt(1,medicine.getCode());
        ps.setString(2,medicine.getName());
        ps.setString(3,medicine.getType());
        ps.setInt(4,medicine.getPrice());
        
        ps.executeUpdate();
        System.out.print("Data Stored in the DB");
    }
    
    public void deleteMedicine(int code) throws SQLException{
        PreparedStatement ps = con.prepareStatement("DELETE FROM medicines WHERE code=?");
        
        ps.setInt(1,code);
        
        ps.executeUpdate();
    }
    
    public void updateMedicine(){
        
    }
    
    public static void main(String[] args) throws SQLException {
        Medicine med = new Medicine();
        
        med.setCode(123);
        med.setName("xyz");
        med.setType("vit");
        med.setPrice(50);
        
        MedicineDAO dao = new MedicineDAO();
//        dao.saveMedicine(med);
//        Medicine med = dao.searchMedicine(123);
//        dao.deleteMedicine(123);
        
        //System.out.println("Deleted");
        
//        con.close();
    }
}
