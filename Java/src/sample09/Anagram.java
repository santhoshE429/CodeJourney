package sample09;

import java.util.*;

public class Anagram {
	static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter The String 1:");
		String s1=sc.nextLine();
		System.out.print("Enter The String 2:");
		String s2=sc.nextLine();
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String res="Anagram";
		if(ch1.length==ch2.length)
		{
			for(int i=0;i<ch2.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					res="Not Anagram";
				}
			}
		}
		System.out.println(res);
		
		
		
	}

}
