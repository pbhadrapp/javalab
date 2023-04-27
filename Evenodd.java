import java.util.Scanner;

public class Evenodd 
{

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
            System.out.println("Enter the number");
            int n =s.nextInt();
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}

	}

}
