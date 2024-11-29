package forloop;

public class CharValue {

	public static void main(String[] args) {
		int a=25;
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+"-" +a--);
		}
	}

}
