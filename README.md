# Project-on-depression-study
package depression;

public class Date {
	int dd;
	int mm;
	int yyyy;
	void setDate(String date) {
		String date1[] = date.split("/");
		dd = Integer.parseInt(date1[0]);
		mm = Integer.parseInt(date1[1]);
		yyyy = Integer.parseInt(date1[2]);
	}
	String getDate() {
		String date="";
		date = date+dd+"/"+mm+"/"+yyyy;
		return date;
	}
}
package depression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecisionMaker {
	int score;
	DecisionMaker(){
		score = 0;
	}
	public void check() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println("Here we are gonna ask a few questions to which you can type numbers from 0 to 3");
		System.out.println("The numbers represent:");
		System.out.println("0 - Not at all");
		System.out.println("1 - Several Days");
		System.out.println("2 - More than half the days");
		System.out.println("3 - Nearly everyday");
		System.out.println();
		System.out.println();
		int temp;
		System.out.println("Do you feel less interest or no pleasure in doing things");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		System.out.println("Do you feel hopless?(down or empty or something like that)");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		System.out.println("Do you have trouble with sleeping?(Trouble falling asleep or staying asleep or sleeping too much");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		System.out.println("Do you have trouble with overeating or undereating?");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		System.out.println("Do you feel bad about yourself, or that you are a failure, or have let yourself or your family down?");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		System.out.println("Do you have trouble concentrating on things which you used to be intrested in like watching TV");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		System.out.println("Do you feel restless always?");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		System.out.println("Do you feel like harming yourself or killing yourself?");
		temp = Integer.parseInt(br.readLine());
		scoreUpdater(temp);
		
	}
	void scoreUpdater(int c) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Invalid choice");
			System.out.println("Enter a no between 0 and 3 including 0 and 3");
			System.out.println("The numbers represent");
			System.out.println("0 - Not at all");
			System.out.println("1 - Several Days");
			System.out.println("2 - More than half the days");
			System.out.println("3 - Nearly everyday");
			c = Integer.parseInt(br.readLine());
			
		}while(!((c>=0)&&(c<=3)));
		score+=c;
		
	}
	public void result() {
		if(score<5) {
			System.out.println("Normal range or full remission.");
			System.out.println("The score suggests the patient may not need depression treatment");
			System.out.println("Talking with a health worker would be sufficient");
		}
		else if ((score>=5) && (score<=9)) {
			System.out.println("Minimal depressive symptoms.");
			System.out.println("Support, educate, call if worse, return in 1 month.");
		}
		else {
			System.out.println("Doctor consultation is a must!");
			if((score>=10) && (score<=14)) {
				System.out.println("Major depression, mild severity.");
				System.out.println("Use clinical judgement about treatment, based on patient's duration of symptoms and functional impairment.");
				System.out.println("Treat with antidepressant or psychotherapy");
			}
			else if((score>=15) && (score<=19)) {
				System.out.println("Major depression, moderate severity.");
				System.out.println("Warrants treatment for depression, using antidepressant, psychotherapy or a combination of treatment.");
			}
			else {
				System.out.println("Major depression, severe severity.");
				System.out.println("Warrents treatment with antidepressant and psychotherapy, especially if not improved on monotherapy; follow frequently.");
				
			}
		}
	}
}
package depression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* This program will help identify depression in people by keeping score based PHQ-9 test
 * and it will suggest solutions based on the score
 */
public class DepressionChecker {

	public static void main(String[] args) throws IOException {
		char ch;
		do {
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
package depression;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Patient_Details {
	private String name;
	private int age;
	private String sex;
	private Date d = new Date();
	public Patient_Details() {
		name = "";
		age = 0;
		sex = "";
		d.dd = 1;
		d.mm = 1;
		d.yyyy = 2018;
	}
	public Patient_Details(String n, int a, String s, String date) {
		name = n;
		age = a;
		sex = s;
		String date1[] = date.split("/");
		d.dd = Integer.parseInt(date1[0]);
		d.mm = Integer.parseInt(date1[1]);
		d.yyyy = Integer.parseInt(date1[2]);
	}
	public void setName(String n) {
		name = n;
		
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setSex(String s) {
		sex = s;
	}
	public String getSex() {
		return sex;
	}
	public void setDate(String date) {
		String date1[] = date.split("/");
		d.dd = Integer.parseInt(date1[0]);
		d.mm = Integer.parseInt(date1[1]);
		d.yyyy = Integer.parseInt(date1[2]);
	}
	public String getDate() {
		String date = "";
		date = date+d.dd+"/"+d.mm+"/"+d.yyyy;
		return date;
	}
	public void setDetails() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		setName(br.readLine());
		System.out.println("Enter your age:");
		setAge(Integer.parseInt(br.readLine()));
		System.out.println("Enter your gender");
		setSex(br.readLine());
		System.out.println("Enter the Date(Remember give it in dd/mm/yyyy format) and use '/' while typing date");
		setDate(br.readLine());
		br.close();
	}
	public void printDetails() {
		System.out.println("Name:"+getName());
		System.out.println("Age:"+getAge());
		System.out.println("Gender"+getSex());
		System.out.println("Date:"+getDate());
	}
}
