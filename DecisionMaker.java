package depression;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DecisionMaker
{
int score;
DecisionMaker()
{
score = 0;
}
public void check() throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("\nHere we are gonna ask a few questions to which you can type numbers from 0 to 3");
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
scoreUpdater(temp); System.out.println("Do you have trouble with overeating or undereating?");
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
