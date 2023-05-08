public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	System.out.println("open files");
	int n=args.length;
	System.out.println(n);
	int a=45/n;
	System.out.println("a+ "+a);
	int b[]= {10,20,30};
	b[50]=100;
	
}
catch(ArithmeticException ae) {
	System.out.println(ae);
	System.out.println("Please pass the data while running this progrm");
}
catch(ArrayIndexOutOfBoundsException aie)
{
	aie.printStackTrace();//to print exception details
	System.out.println("please see that arrray index is with in range");
}
finally
{
	System.out.println("close the files");
}
	}

}
