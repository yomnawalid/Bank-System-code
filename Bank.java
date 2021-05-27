import java.util.ArrayList;
/**
 * Date : 27/4/2021
 * @author DELL NOURHAN HOSSAM EL-DIN MOHAMED
 * A bank system class
 */
public class Bank {
	 private String name ;
	 private String address;
	 private long phone ;
	 
	 /**
	  * Default constructor 
	  */
	 public Bank ()
	    {
	    }
	 /**
	  * Parameterized constructor to set class's attributes
	  * @param name bank's name
	  * @param address bank's address
	  * @param phone bank's phone number
	  */
	
	    public Bank(String name, String address, long phone) {
	        this.name = name;
	        this.address = address;
	        this.phone=phone;
	    }
       /**
        * this method is a name getter
        * @return it returns bank name
        */
	    
	    public String getName() {
	        return name;
	    }
       /**
        * this method is a name setter
        * @param name bank name
        */
	    public void setName(String name) {
	        this.name = name;
	    }
        /**
         * this method is an address getter
         * @return it returns bank address
         */
	    public String getAddress() {
	        return address;
	    }
	    /**
	     * this method is an address setter
	     * @param address bank address
	     */

	    public void setAddress(String address) {
	        this.address = address;
	    }
	    /**
	     * this method is a phone number getter
         * @return it returns bank phone number
	     */
		public long getPhone() {
			return phone;
		}
		/**
		 * this method is a phone number setter
		 * @param phone bank phone number
		 */
		public void setPhone(long phone) {
			this.phone = phone;
		}
		
		/**
		 * Array lists of accounts and clients
		 */
		
		ArrayList <Account> Accounts = new ArrayList <Account>();
		
	    ArrayList <Client> Clients = new ArrayList <Client>();
	    
	    /**
	     * Method display to get client and account information from the two arrays
	     */
	    
	    public void display ()
	    {
		     for (int i=0 ; i<= Clients.size() ; i++)
		        {
		        	System.out.println(this.Clients.get(i).toString());
		        	
		        }
		     for (int i=0 ; i<= Accounts.size(); i++)
			{
				
		    	 System.out.println(this.Accounts.get (i).toString());
			}
		 }
	    /**
	     * Method add to add a new client and account in the two arrays
	     */
		public void add () {  
			 for (int i=0 ; i<= Clients.size() ; i++)
		        {
				this. Clients.add (new Client());
					
		        }
		     for (int i=0 ; i<= Accounts.size(); i++)
			{
		    	 this.Accounts.add (new Account());
				
			}
		     
		}
		     @Override
		     public String toString() {
		         return "Bank{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", Accounts=" + Accounts + ", Clients=" + Clients + '}';
		     }
		
			
		    
		          
		        
	    
	    
	    
	    
		   
}

	    
	    
		   


