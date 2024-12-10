package fileHandling;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class ReadByte {
	
	static Scanner sc=new Scanner(System.in);
	static FileInputStream fin;
	public static void main(String[] args) {
		System.out.print("Enter The Path:");
		String path=sc.nextLine();
		try {
			fin=new FileInputStream(path);
			byte[]res=fin.readAllBytes();
			fin.close();
			for (int i = 0; i < res.length; i++) {
				System.out.print((char)res[i]);
				
			}
			System.out.println();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
