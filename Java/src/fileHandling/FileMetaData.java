package fileHandling;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class FileMetaData {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter The path:");
		String path=sc.nextLine();
		try {
			File fm=new File(path);
			
			Date date=new Date(fm.lastModified());
			System.out.println("File name:"+fm.getName());
			System.out.println("Absoulte Path:"+fm.getAbsolutePath());
			System.out.println("Writable:"+fm.canWrite());
			System.out.println("readable:"+fm.canRead());
			System.out.println("Get Bytes:"+fm.length());
			System.out.println("Last Modified:"+date);
		} catch (Exception e) {
			System.out.println("An errors Occurred...........");
			e.printStackTrace();
		}
		

	}

}
