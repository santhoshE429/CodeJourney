package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter The Path: ");
		String path=sc.nextLine();
		File f=new File(path);
		try {
			if(f.createNewFile())
			{
				System.out.println("File created Successs........"+f.getName());
			}
			else {
				System.out.println("File is Already exits....... "+f.getName());
			}
		} catch (IOException e) {
			System.out.println("An Error Occured.........");
			e.printStackTrace();
		}
		

	}

}
