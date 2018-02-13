
package coursework2;

/**
 *
 * @author Awad
 */
public class BankAccount
{
 private final long accountNo;
 private double accountBalance;
 public BankAccount(long accountNo, double accountBalance)
 {
 this.accountNo = accountNo;
 this.accountBalance = accountBalance;
 }
 public long getAccountNo()
 {
 return this.accountNo;
 }

 public double getAccountBalance()
 {
 return this.accountBalance;
 }
 public  synchronized void  deposit(double value, String name)
 {
 System.out.println("User " + name + " deposited " + value);
 accountBalance+= (accountBalance + value);
 
 }
 public synchronized void withdraw(double value, String name)
 {
System.out.println("User " + name + "withdrawn " + value);
accountBalance-=value;

 }
}
