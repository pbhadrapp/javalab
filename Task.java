import java.util.Scanner;  
public class Task   
{  
	static int rootdigit(){
	int num,r,sum=0;
	Scanner sc = new Scanner(System.in);  
	System.out.println("Enter the number: ");  
	num = sc.nextInt();  
	while(num > 0)  
	{  
  		r = num % 10;  
  		sum = sum + r;  
		num = num / 10;  
	}
	return sum;
	}
public static void main(String args[])
{
	int r1,sum1=0;
	Task t = new Task();
	int num2 = t.rootdigit();
	while(num2 > 0)  
	{  
  		r1 = num2 % 10;  
  		sum1 = sum1 + r1;  
		num2 = num2 / 10;  
	}

	System.out.println("result: "+sum1);   
}
}