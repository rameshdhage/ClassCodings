
public class User {
       int id =101;
       static String name="ramesh";
       
       
      public void getData() {
    	  System.out.println("Hello");
    	  System.out.println("id is>>" +id);
    	  System.out.println("name is>>"+ name);
    	  
      }
       public static void getDetail() {
    	    System.out.println("Hi");
    	    User user1 =new User();
    	    
    	    System.out.println(user1.id);
    	    System.out.println("name is >>"+name);
    	    
       }
       public static void main(String args[]) {
    	   getDetail();
    	   
       }
       static {
    	   System.out.println("hello team");
    	   
       }
       
      static {
    	 
    	  System.out.println("how are you");
      }
}

