//2.Difference b/w static and instance variables and accessing
//To display following output write the appropriate code 
//Output:
//1234
//Venu
//Codegnan






public class Student1 {
	int rno;
	String name;
	static String clgName;

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.name="Venu";
		s1.rno=1234;
		s1.clgName="Codegnan";

		System.out.println(s1.rno);
		System.out.println(s1.name);
		System.out.println(s1.clgName);

	}

}
