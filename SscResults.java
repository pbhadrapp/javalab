import java.util.Scanner;
class SscResults
{
String stdName;
int rollNumber,teluguMarks,hindiMarks,englishMarks,mathsMarks,scienceMarks,socialMarks;
static String CollegeName;
public static void main(String args[])
{
SscResult m=new SscResults();
Scanner s = new Scanner(System.in);
System.out.println("Name "+m.stdName);
m.stdName = s.next();
System.out.println("Roll No: "+m.rollNumber);
m.rollNumber = s.nextInt();
System.out.println("College Name: "+m.collegeName);
m.collegeName = s.nextLine();
System.out.println("Total Marks: "+m.totalMarks);
m.totalMarks = s.nextInt();
System.out.println("Enter teluguMarks");
m.teluguMarks =s.nextInt();
System.out.println("Enter hindiMarks");
m.hindiMarks =s.nextInt();
System.out.println("Enter englishMarks");
m.englishMarks =s.nextInt();
System.out.println("Enter mathsMarks");
m.mathsMarks =s.nextInt();
System.out.println("Enter scienceMarks");
m.scienceMarks =s.nextInt();
System.out.println("Enter socialMarks");
m.socialMarks =s.nextInt();
int totalMarks = (teluguMarks)+(hindiMarks)+(englishMarks)+(mathsMarks)+(scienceMarks)+(socialMarks);
float avgMarks=totalMarks/6.0f;
System.out.println("Percentage: "+avgMarks);
}
}





