import java.util.Scanner;
public class Emp1
{
	int eid;
	String empName;
	double salary;
	static String CompanyName;
	public static void main(String[] args)
	{
		long mobilenum;
		String aadharno;		
		Emp1 m = new Emp1();
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the employeeid:");
		m.eid = s.nextInt();
		s.nextLine();
		System.out.println("Enter the employeename:");
		m.empName = s.nextLine();
		System.out.println("Enter the salary:");
		m.salary = s.nextDouble();
		s.nextLine();
		System.out.println("Enter the Companyname:");
		m.CompanyName = s.nextLine();
		System.out.println("Enter the mobilenumber:");
		mobilenum = s.nextLong();
		s.nextLine();
		System.out.println("Enter the aadharnumber:");
		aadharno = s.nextLine();
		System.out.println("Employee Details:\nEmployee Id = "+m.eid+"\nEmployeeName = "+m.empName+"\nCompany Name = "+m.CompanyName+"\nSalary = "+m.salary+"rs"+"\nMobile Number = "+mobilenum+"\nAadhar Number = "+aadharno);
	}
}
 


