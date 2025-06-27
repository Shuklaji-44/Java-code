import java.util.Scanner;
class Area
{
 public static void main(String[] args)
{
 Scanner choose=new Scanner(System.in);
System.out.println("Enter the length of a rectangle");
int length=choose.nextInt();
System.out.println("enter the width of a rectangle");
int width=choose.nextInt();

System.out.println("Calculate area of a rectangle:");
int result=length*width;
System.out.println("result of area is ="+result);
}
}