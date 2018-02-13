/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework2;

import java.util.ArrayList;
/**
 *
 * @author Awad
 */
public class User extends Thread                     //Class
{
    
 private final String name;
 private final String surname;
 private final BankAccount bankAccount;
 private final ArrayList<Double> transactionList;
  
 public User(String n, String s, BankAccount bA, ArrayList<Double> tL)
 {
 this.name = n;
 this.surname = s;
 this.bankAccount = bA;
 this.transactionList = tL;
 }
 
 
 
 public String getUserName(){
     return this.name+" "+this.surname;
 }
 @Override
 public void run()
 {
     for(int i=0; i<transactionList.size();i++)
     {
         if(transactionList.get(i)<0)
         {    
      bankAccount.withdraw(transactionList.get(i),this.name+"");
         }
     if(
             bankAccount.getAccountBalance()<=0)
             {
             System.out.println("Your current balance is $" + bankAccount.getAccountBalance() + "You don't have a sufficient amount to withdraw");
             break;
             }
     else
             {
             bankAccount.deposit(transactionList.get(i),this.name+"");
             }
 }
}
}

