package fileHandling;

import java.io.File;
import java.util.Scanner;

public class DeleFile {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter The Path: ");
		String path=sc.nextLine();
		try {
			File df=new File(path);
			if(df.delete())
			{
				System.out.println("Suceessfully File is deleted........."+df.getName());
			}
			else
			{
				System.out.println("Can't deleted file is not there.......");
			}
			
		} catch (Exception e) {
			System.out.println("An Error is Occurred........... ");
		}
	}

}
