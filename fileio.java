import java.io.*;

public class Fileio {
	
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("D://myjava.txt");// THIS WILL SEE IN D DRIVE 
	
		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
			System.out.println("Enter the data (0 at the end): ");
			int ch;
			FileReader fr= null;
			try
			{
				fr=new FileReader("D://myjava.txt");
			}catch(FileNotFoundException fe)
			{
				System.err.println("file is not found");
			}
			while((ch=fr.read())!=-1)
			{
				bout.write(ch);
				System.out.println((char)ch);
			}
			fr.close();

		}
}
