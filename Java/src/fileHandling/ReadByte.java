package fileHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadByte {
	
	static Scanner sc=new Scanner(System.in);
	static FileInputStream fin;
	public static void main(String[] args) {
		System.out.print("Enter The Path:");
		String path=sc.nextLine();
		try {
			fin=new FileInputStream(path);
			System.out.print("Enter The Data:");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
