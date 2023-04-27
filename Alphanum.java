import java.util.Scanner;

public class Alphanum 
{

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
            char ch = s.next().charAt(0);
if(ch>=65 && ch<=90)
{
System.out.println("Uppercase");
}
else if(ch>=97 && ch<=122)
{
System.out.println("Lowercase");
}
else if(ch>=48 && ch<=57)
{
System.out.println("Number");
}
}
}



