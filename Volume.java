import java.util.Scanner;
class Volume
{
 public static void main(String[] args)
{
 int height,radius;
 double volume;
 Scanner choose=new Scanner(System.in);
System.out.println("enter the height and radius  of two values");
radius=choose.nextInt();
height=choose.nextInt();
volume=(1.0/3.0)*Math.PI*Math.pow(radius,2)*height;

System.out.println("the volume of the cone is="+volume);
}
}