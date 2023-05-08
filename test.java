import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("enter array size ");
		int size=in.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("enter the value of"+i+"th index");
			arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
				
		
		
		
	}

}

