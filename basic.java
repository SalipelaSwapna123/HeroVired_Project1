package swapna;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("open files");
	        int n=args.length;
	        System.out.println("n= "+n);
	        int a=45/n;
	        System.out.println("a= "+a);
		System.out.println("Hey this is running");
		}
		
		
		
		
		catch(ArithmeticException ae) 
		{
			System.out.println(ae);
			System.out.println("Please pass the data while running this problem");
		}
        finally
        {
        	//close the files
        	System.out.println("close files");
        }
	}

}
