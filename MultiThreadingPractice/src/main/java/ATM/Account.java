/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

/**
 *
 * @author utsav
 */
public class Account {
    private int acno,balance;

    public Account(int acno, int balance) {
        this.acno = acno;
        this.balance = balance;
    }
    
    public synchronized void withdraw(int amount){
        if(balance >= amount){
            System.out.println("Account No. :- " + acno);
            System.out.println("New Balance. :- " + balance + " - " + amount + " = " + (balance - amount));
            balance = balance - amount;
        }else{
            System.out.println("Insufficient Balance :- " + balance);
        }
    }
}
