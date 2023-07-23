import java.util.Scanner;

public class EmployeeInformation {
	
	public void getUserInput() {
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first name");
	emp.firstName =sc.nextLine();
	
	System.out.println("Enter the last name");
	emp.lastName=sc.nextLine();
	
	System.out.println("Enter the city");
	emp.city=sc.nextLine();
	
	System.out.println("Enter the mobile number");
      emp.mobileNumber	=sc.nextLong();
	
		getEmployeeInformation(emp.firstName,emp.lastName,emp.city,emp.mobileNumber,emp.country);
	}
	 public void getEmployeeInformation(String fNname,String IName, String city,long mobNum,String country) {
		 System.out.println("Employee Information:");
		 System.out.println("first Name:"+fNname);
		 System.out.println("last Name:" +IName);
		 System.out.println("mobileNumber:"+city);
		 System.out.println("country:"+mobNum);
		 System.out.println("country:"+country);
	}
	         public static void main(String[] args) {
				EmployeeInformation emp=new EmployeeInformation();
				System.out.println("Enter the number of Employee ");
				Scanner sc=new Scanner(System.in);
				int count=sc.nextInt();
				
				for(int i=1;i<=count;i++) {
					System.out.println("Enter the employee detail");
					emp.getUserInput();
				}
			}

}
