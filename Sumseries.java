import java.util.Scanner;
public class Sumseries{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0.0;
		for(int i=1;i<=n;i++)
		{
	sum = sum+(double)1/i;
		}
		  System.out.printf("Sum is %f", sum(n));



	}
}
