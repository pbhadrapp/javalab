import java.util.*;
class StudentMemo
{
String stdName;
int rollNum;
static String clgName;
public static void main(String[] args)
{
StudentMemo m = new StudentMemo();
Scanner s=new Scanner(System.in);
System.out.println("Enter student name");
m.stdName=s.nextLine();
System.out.println("Enter rollno");
m.rollNum =s.nextInt();
s.nextLine();
System.out.println("Enter college name");
m.clgName = s.nextLine();
System.out.println("Enter 6 subjects  marks");
int m1=s.nextInt();
int m2=s.nextInt();
int m3=s.nextInt();
int m4=s.nextInt();
int m5=s.nextInt();
int m6=s.nextInt();
int totalmarks=m1+m2+m3+m4+m5+m6;
float avgmarks=totalmarks/6.0f;
System.out.println("Name: "+m.stdName);
System.out.println("Rollno: "+m.rollNum);
System.out.println("clgname: "+m.clgName);
System.out.println("totalmarks: "+totalmarks);
System.out.println("percentage: "+avgmarks);
}
}



