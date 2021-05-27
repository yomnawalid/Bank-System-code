/**
 * THE MAIN CLASS
 * @author DELL YOMNA WALID REZK / NOURHAN HOSSAM EL-DIN MOHAMED / AYA MOHAMED MOHAMED AL-AKKAD
 *
 */
public class Main {
/**
 * @param args Array of string arguments
 */
	public static void main(String[] args) {
	
		 // creating client's account  
	       
	        Account client1 = new Account (12565 );
	        client1.deposite(1000);
	        client1.withdraw(600);
          //  System.out.println (client1.toString());
            
            
            Client c1 = new Client ("Ahmed" , "3 st Aldokki" , 22365265 , client1 , 1268952);
			//System.out.println(c1.toString());
            
           
	        //////////////////////////////////////////////////////////////////////////////////////////
	        
	        // creating special client's commercial account
	       SpecialAccount client2 = new SpecialAccount (65423 );
	       client2.deposite(2000);
	       client2.withdraw(3000);
	      // System.out.println (client2.toString());
	        
			
			CommercialClient c2 = new CommercialClient("Mohamed" , "3 st Algiza" , 31264554 , client2 , 459764 , 255452 );
		   // System.out.println(c2.toString());
	        
		    // Creating Bank 
		    
		    Bank bank1 = new Bank("QNB", "ELGIZA",15696845);
		    System.out.println(bank1.toString());
		     bank1. Accounts.add ( client1);
		     bank1.Clients.add(c1);
		     bank1. Accounts.add ( client2);
		     bank1.Clients.add(c2);
		     
		    System.out.println(bank1.Accounts.get (0).toString());
		    System.out.println(bank1.Clients.get (0).toString());
		    System.out.println(bank1.Accounts.get (1).toString());
		    System.out.println(bank1.Clients.get (1).toString());
		    
		    
		    
		    
		    
	        }


	}


