package fileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteChar {

	static Scanner sc=new Scanner(System.in);
	static FileWriter fw;
	public static void main(String[] args) {
		System.out.print("Enter The path: ");
		String path=sc.nextLine();
		try {
			fw=new FileWriter(path);
			System.out.print("Enter The data:");
			String data=sc.nextLine();
			fw.write(data);
			System.out.println("Done");
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
