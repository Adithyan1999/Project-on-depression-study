import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* This program will help identify depression in people by keeping score based PHQ-9 test
and it will suggest solutions based on the score */
public class DepressionChecker
{
public static void main(String[] args) throws IOException
{
char ch;
do{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("This is A program to help identify depression in people");
System.out.println("And suggest what to do and whom to visit based on the depression grade");
System.out.println("The result of the test is based on the honesty of the patient");
Patient_Details p = new Patient_Details();
p.setDetails();
DecisionMaker d = new DecisionMaker();
d.check();
String choice;
System.out.println("Are there more patients(y/n)?");
choice = br.readLine();
choice = choice.toLowerCase();
ch = choice.charAt(0);
}while(ch=='y');
}
}
