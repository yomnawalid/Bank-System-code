
/**
 * Date : 27/4/2021
 * A class for the client's special account in a bank
 * @author DELL YOMNA WALID REZK 
 */
public class SpecialAccount extends Account {
	
	
	/**
	 *  Default constructor
	 */
	public SpecialAccount()
    {
    }

/**
 * parameterized constructor to set account number and balance's initial value which is inherited from super class 
 * @param accNum the client's account number
 */
    public SpecialAccount(int accNum ) 
    {
       super( accNum );
    }

    
   /**
    * This method is overridden to allow the customer to withdraw money with overdraft less than or equal 1000 LE only
    * @param value is the value that will be withdrawn
    */
    
    @Override
    public void withdraw(double value)
    {
        
       if (value<=getBalance()+1000)  
       {
          setBalance ( getBalance() - value);
          
    }  else 
    	System.out.println ("The withdrawal process is cancelled due to insufficient money");
        
    	   
     }
  
    
}  
	




