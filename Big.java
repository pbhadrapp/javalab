import java.util.Scanner;

public class Big 
{

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
            System.out.println("Enter a value");
s.nextLine();
int a = s.nextInt();
System.out.println("Enter b value");
s.nextLine();
int b = s.nextInt();
System.out.println("Enter c value");
s.nextLine();
int c = s.nextInt();
if(a>b && a>c)
{
System.out.println("a+ is big");
}
else if(b>a && b>c)
{
System.out.println("b+ is big");
}
else if(c>a && c>b)
{
System.out.println("c+ is big");
}
}
}



