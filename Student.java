import java.util.Scanner;
class Student
{
public static void main(String args[])
{
String name,clgname,gender;
	int roll,age,fee;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter student name");
	name = s.nextLine();
	System.out.println("Enter college name");
	clgname = s.nextLine();
	System.out.println("Enter gender");
	gender = s.nextLine();
	System.out.println("Enter roll number");
	roll = s.nextInt();
	System.out.println("Enter age");
	age = s.nextInt();
	System.out.println("Enter fee");
	fee =s.nextInt();
	System.out.println("the student details is");
System.out.println(name);
System.out.println(clgname);
System.out.println(gender);
System.out.println(roll);
System.out.println(age);
System.out.println(fee);
}
}




