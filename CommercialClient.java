/**
 * Date : 27/4/2021
 * A class to describe the commercial client's information
 * @author DELL AYA MOHAMED MOHAMED AL-AKKAD
 */
public class CommercialClient extends Client {
	

    //Data member of CommercialClient class 
    private long commercialid;
    
     /**
      *  this method to set the client's commercial ID
      * @param comid the client's commercial ID
      */
    public void setComercialid(int comid)
    {         
        this.commercialid=comid;
    }
    
    /**
     * 
     * @return this method returns the commercial ID of the client
     */
    public long getCommercialid()
    {
        return commercialid;
    }
        /**
         * parameterized constructor , this constructor might initialize data members with the passed values of arguments when object is created
         * @param n is the name of the client
         * @param addr the client's address
         * @param ph the client's phone number
         * @param acco the client's account
         * @param Id  the client's ID
         * @param coid the commercial Id 
         */
     public CommercialClient(String n , String addr, long ph , Account acco ,long Id , long coid){
         super (n , addr , ph , acco , 0000000000000 );
         commercialid = coid;
     }    
   
    


     @Override
     public String toString() {
         return "CommercialClient{name=" + getName() + ", address=" + getAddress ()+ ", phone=" + getPhone ()+ ", account=" + getAccount()+ " ,commercialid=" + commercialid + '}';
     }
    
    
        


}
