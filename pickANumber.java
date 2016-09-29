import java.util.Scanner;
public class Numbers
{
static int p; static String hi;
public static void main(String [] args) {

Scanner s = new Scanner(System.in);
System.out.println(“Enter sum to get the sum of the numbers and product to get the product of the numbers”);
hi = s.nextLine();
System.out.println(“Enter a number n”);
p = s.nextInt();
Entry(p,hi);

}

public static void Entry( int n,String s)
{
if(s.equals(“sum”))
{
p=0;
for(int i=1;i<n+1;i++)
{
p=p+i;
}
System.out.println(“The sum of the numbers is equal to “+p);
}

else if(s.equals(“product”))
{
p=1;
for(int i=1;i<n+1;i++)
{
p=p*i;
}
System.out.println(“The product of the numbers is equal to “+p);
}

else
{
System.out.println(“Invalid input”);
}

}

}