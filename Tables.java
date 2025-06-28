import java.util.Scanner;
class Tables
{
  public static void main(String[] args)
{
 Scanner choose=new Scanner(System.in);
System.out.println("Display the table of 1 to 10 is to be calculated:");
int n=1;
for(int i=1;i<=10;i++)
 {

for (int j=1;j<=10;j++)
{
      n=i*j;
System.out.println("table of  given no is= "+i+"*"+j+"="+n);

}
System.out.println();
}

}
}