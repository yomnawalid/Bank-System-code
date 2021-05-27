/**
 * Date : 27/4/2021
 * A class for the client's account in a bank
 * @author DELL YOMNA WALID REZK 
 */
public class Account {
	
	// the class's attributes 
    private double balance ;
    private int accountNumber;
    
    
    /**
     * Default constructor
     */
    public Account ()   
    {
    }
    /**
     *parameterized constructor to set account number and balance's initial  value 
     * @param accountNum the client's account number
     */
    
    public Account (int accountNum ) 
    {
        accountNumber = accountNum;
        balance = 0.0 ;           
    }
    /**
     *  This method to set the balance of the client 
     * @param bal this parameter is the balance of the client 
     */
    public void setBalance ( double bal)
    {
    	balance = bal;
    }
    /**
     * @return  This method returns the balance of the user
     */
    public double getBalance()  
    {
        return balance ;
    }
    /**
     * @return This method returns the account number of the client 
     */
    public double getaccountNumber()
    {
        return accountNumber ;
    }
    /**
     * this method allow the customer to withdraw money from his balance if the balance is greater than zero
     * @param value is the value that will be withdrawn
     */
    public void withdraw (double value)
    {
        if ( value <= balance) 
        {
        balance -= value  ;
       
        }  
        else 
            System.out.println("The withdrawal process is cancelled due to insufficient money");
           
    }   
    /**
     * this method allow the customer to deposit money in the account balance
     * @param value is the value that will be deposited
     */
                    
     public void deposite (double value)
    {
        balance += value  ;
    } 

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance +"LE" +  ", accountNumber=" + accountNumber + '}';
        
    }
     
     
}





