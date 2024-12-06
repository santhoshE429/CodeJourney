package string;

public class CountDup {

	public static void main(String[] args) {
		String s="aaabbbaac";
		String dup="";
		char []ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					dup+=ch[j];
//					ch[j]=' ';
				}
				
			}
			if(ch[i]!=' ')
			{
				System.out.println(ch[i]+":"+count+"Times");
			}
		}
		System.out.println("duplicate element is "+dup);

	}

}
