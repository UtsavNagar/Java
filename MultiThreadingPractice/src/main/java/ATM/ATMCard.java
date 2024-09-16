/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

/**
 *
 * @author utsav
 */
public class ATMCard extends Thread {
    public Account account;
    
    public void run(){
        account.withdraw(7000);
    }
    public static void main(String[] args) {
        ATMCard c1 = new ATMCard();
        ATMCard c2 = new ATMCard();
        ATMCard c3 = new ATMCard();
        
        Account ac1 = new Account(111,10000);
        Account ac2 = new Account(112,20000);
        Account ac3 = new Account(113,30000);
        
        c1.account = ac1;
        c2.account = ac2;
        c3.account = ac1;
        
        c1.start();        
        c2.start();
        c3.start();
    }
}  
