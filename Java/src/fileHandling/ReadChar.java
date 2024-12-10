package fileHandling;

import java.io.FileReader;
import java.util.Scanner;

public class ReadChar {

	static Scanner sc=new Scanner(System.in);
	static FileReader fr;
	public static void main(String[] args) {
		System.out.print("Enter The Path:");
		String path=sc.nextLine();
		try {
			fr=new FileReader(path);
			int res=fr.read();
			while(res!=-1)
			{
				System.out.print((char)res);
				res=fr.read();
				
			}
			System.out.println();
			System.out.println("Done....");
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
