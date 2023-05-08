package swapna;
import java.util.Scanner;

public class s {
public static void main(String[]args) {
	System.out.println("SWAPNA");
	
	int a=10;
	System.out.println(a); 
	System.out.println("value of a is :"+a); 
    
	int x;
	Scanner sc=new Scanner(System.in);	
	
	System.out.println("value of x :");
	x=sc.nextInt();
	System.out.println("value of x is"+x);
    
	String s;
	System.out.println("Enter name :");
	s=sc.nextLine();
	System.out.println("the user name :"+s);
    int a,b;
	System.out.println("Enter a value :");
	System.out.println("Enter b value :");
  a=sc.nextInt();
  b=sc.nextInt();
	System.out.println("sum  :"+(a+b));

	a=5;
	b=7;
	if(a>b)
	{
		System.out.println("a is greater than b");

	}
	else
	{
		
	}
	System.out.println("b is greater than a");


	
	

}
}
