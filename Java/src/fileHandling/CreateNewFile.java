package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The Path ");
		String path=sc.nextLine();
		File f=new File(path);
		try {
			if(f.createNewFile())
			{
				System.out.println("File created Successs........");
			}
			else {
				System.out.println("File is Already exits....... ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
