package fileHandling;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteByte {
	static Scanner sc= new Scanner(System.in);
	static FileOutputStream fout;

	public static void main(String[] args) {
		System.out.print("Enter The Path:");
		String path=sc.nextLine();
		try {
			
			fout=new FileOutputStream(path);
			System.out.print("Enter The Data:");
			String data=sc.nextLine();
			fout.write(data.getBytes());
			System.out.println("Done");
			fout.flush();
			fout.close();
		} catch (Exception e) {
			System.out.println("Check the path");
			
		}
	}

}