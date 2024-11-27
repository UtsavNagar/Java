package Services;

import java.sql.SQLException;
import myPkg.Medicine;
import myPkg.MedicineDAO;

public class MedicineService {
    private MedicineDAO dao;
    public MedicineService(){
        dao = new MedicineDAO();
    }
    
    int getDiscount(int price){
        if(price >= 500){
            return price - (price * 10 / 100);
        }else{
            return price - (price * 5 / 100);
        }
    }
    
    public void save(Medicine med) throws SQLException{
        dao.saveMedicine(med);
    }
    
    public Medicine search(int code) throws SQLException{
        return dao.searchMedicine(code);
    }
}
