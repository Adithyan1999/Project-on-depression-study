import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Patient_Details
{
private String name;
private int age;
private String sex;
private Date d = new Date();
public Patient_Details()
{
name = "";
age = 0;
sex = "";
d.dd = 1;
d.mm = 1;
d.yyyy = 2018;
}
public Patient_Details(String n, int a, String s, String date)
{
name = n;
age = a;
sex = s;
String date1[] = date.split("/");
d.dd = Integer.parseInt(date1[0]);
d.mm = Integer.parseInt(date1[1]);
d.yyyy = Integer.parseInt(date1[2]);
}
public void setName(String n)
{
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
	String f=br.readLine();
	if(f.length()==12)
	setDate(f);
}
public void printDetails() {
	System.out.println("Name:"+getName());
	System.out.println("Age:"+getAge());
	System.out.println("Gender"+getSex());
	System.out.println("Date:"+getDate());
}
}
