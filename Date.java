public class Date
{
int dd;
int mm;
int yyyy;
void setDate(String date)
{
String date1[] = date.split("/");
dd = Integer.parseInt(date1[0]);
mm = Integer.parseInt(date1[1]);
yyyy = Integer.parseInt(date1[2]);
}
String getDate()
{
String date="";
date = date+dd+"/"+mm+"/"+yyyy;
return date;
}
}
