package email;
import java.util.*;

public class EmailValidation {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        
	        ArrayList<String> emailId = new ArrayList<String>();
	        
	        emailId.add("sachin.singh@abc.com");
	        emailId.add("priyanka.kapoor@abc.com");
	        emailId.add("aishwarya@abc.com");
	        emailId.add("abhinaya.sri@abc.com");
	        emailId.add("sree.kumar@abc.com");
	        emailId.add("arjun.chowdary@abc.com");
	        emailId.add("john.x@abc.com");
	        emailId.add("joseph1@abc.com");
	        
	        System.out.println("Enter the emailId you want to search : ");
	        String str=sc.nextLine();
	        System.out.println("Entered emailId:" +str);
	        
	    for(String email:emailId)
	    {
	    	if(email.contains(str))
	    	{
	    	      System.out.println("EmailId : "+email+"   found");
	    	     
	         } 
        }
	 }
}
