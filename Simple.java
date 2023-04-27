import java.util.Scanner;
class Simple
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the p value");
double p = s.nextDouble();
System.out.println("Enter the t value");
int t = s.nextInt();
System.out.println("Enter r value");
float r = s.nextFloat();
double si = (p*t*r)/100;
System.out.println("the simple interest: "+si);
}
}
