package encapsulation;

import java.util.Scanner;

public class UserMob {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Sim s=new Sim("Airtel", "2.4g", 400);
		Mobile m=new Mobile("Mi", "6gb", "128gb", 250000 );
		
		boolean my_features=true;
		do {
			System.out.println("Select The Feature:");			
			System.out.println("1.DetailOfMObile\n2.DetailOfSim\n3.InsertSim\n4.RemoveSim\n5.Exit");
			int input=sc.nextInt();
			switch (input)
			{
			case 1:
				m.detailOfMobile();
				break;
			case 2:
				s.detailOfSim();
				break;
			case 3:
				m.insertedSim(s);
				break;
			case 4:
				m.removeSim();
				break;
			case 5:
				my_features=false;
				break;
			
			default:
				break;
			}
		} while (my_features);
		System.out.println("\t\t\t**** Thank You For Visiting ****");
	}
	

}
