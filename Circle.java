import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter r value");
float f = (float)3.14;
float r = s.nextFloat();
float ar = (float)(f*r*r);
float cr = (float)(2*(f*r)) ;
System.out.println("Area is : " +ar);
System.out.println("Circumference is : " +cr);
}
}





