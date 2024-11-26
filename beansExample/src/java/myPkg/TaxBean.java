package myPkg;

public class TaxBean {
    private int income;
    private int age;
    private int tax;

    public void setIncome(int income) {
        this.income = income;
        computeTax();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIncome() {
        return income;
    }

    public int getAge() {
        return age;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
    
    void computeTax(){
        if(income >= 50000){
            tax = income*20/100;
        }else{
            tax = income*10/100;
        }
    }
    
}
