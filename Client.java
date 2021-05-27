/**
 * Date : 27/4/2021
 * A class to describe the client's information 
 * @author DELL AYA MOHAMED MOHAMED AL-AKKAD
 */

// Super class
public class Client {
	// Data members of the class
	
    private String name ;
    private String address;
    private long phone ;
    Account acco;
    private long nationalid;
    
/**
 *   Default constructor 
 *   This might be invoked when an object of this class is created 
 */
    public Client ()
    {
    } 
    /**
     * parameterized constructor , this constructor might initialize data members with the passed values of arguments when object is created
     * @param n is the name of the client
     * @param addr the client's address
     * @param ph   the client's phone number
     * @param acco the client's account
     * @param Id the client's ID
     */

    public Client(String n , String addr , long ph , Account acco , long Id )
    {       
        this.name=n;
        this.address=addr;
        this.phone=ph;
        this.acco=acco;
        this.nationalid=Id;
    }
    
   /**
    * This method to set the  client's name
    * @param name the client's name
    */
    public void setName(String name) {              
       this.name = name;
    }
    
    /**
     * 
     * @return this method to return client's name
     */
    public String getName(){
        return name;
    }
    /**
     * This method to set the  client's address
     * @param add the  client's address
     */
    public void setAddress(String add) {          
    	this.address = add;
    }
    /**
     * 
     * @return this method to return client's address
     */
    public String getAddress(){
        return address;}
    /**
     * 
     * This method to set the  client's phone number
     * @param p  client's phone number
     *  
     */
        
    public void setPhone(long p ){                
         this.phone=p;
        }     
    /**
     * 
     * @return it returns the client's phone number
     */
    public long getPhone(){
        return phone;
    }    
    /**
     * This method to set the  client's account
     * @param acco the  client's account
     * 
     */
    public void setAccount(Account acco){            
        this.acco=acco;
    }
    /**
     * 
     * @return the method returns the client's account
     */
    public Account getAccount(){
        return acco;}
    /**
     *  this method to set the  client's ID
     * @param id the client's ID
     */
    public void setNationalid(int id) 
    {       
        this.nationalid = id;
    }  
    /**
     * 
     * @return it returns the client's ID
     */
    public long getNationalid()
    {
        return nationalid;
    }

    
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", account=" + acco + ", nationalid=" + nationalid + '}';
    }
}
   



