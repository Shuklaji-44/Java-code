import java.util.Scanner;
class Student
{
 Scanner choose=new Scanner(System.in);

   public int rollnum;
  public String name;
public int[] marks=new int[5];
public void readInfo()
{
 //Scanner choose=new Scanner(System.in);
System.out.println("enter the roll number:");
rollnum=choose.nextInt();
choose.nextLine();
System.out.println("enter the name of student:");
 name=choose.nextLine();
System.out.println("enter the marks of 5 subject");
for(int i=0;i<5;i++)
{
 System.out.println("subject "+(i+1) +":");
marks[i]=choose.nextInt();
}
}
public void displayInfo()
{
 System.out.println("Rollnumber ="+ rollnum);
 System.out.println("Name ="+ name);
 System.out.println("marks is=");

for(int mark:marks){
System.out.println(mark+"");
}
 int total=caltotal(); 
double average=calaverage();
System.out.println("Total marks obtained is="+total);
System.out.println("average Calculated is="+average);
}
private int caltotal()
{
int total=0;
for(int mark:marks)
{
total+=mark;
}
return total;
}
private double calaverage()
{
 return caltotal()/5.0;
}
}

 public class StudentInfo{
 public static void main(String[] args)
{
   //  Scanner choose=new Scanner(System.in);
 //Student[] students=new Student[5];
for(int i=0;i<5;i++)
{
 System.out.println("entering information for student "+(i+1)+"=");
 //students[i]=new Student();
 Student students=new Student();

students.readInfo();
System.out.println();

 System.out.println("Displaying information for student ");


// for(Student student:students)
//{
  students.displayInfo();
}
}
}
