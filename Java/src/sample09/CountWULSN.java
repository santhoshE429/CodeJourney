package sample09;

public class CountWULSN {

	public static void main(String[] args) {
		String str ="I love  My India!!!";
		int count_w=0,count_u=0,count_l=0,count_s=0,count_n=0;
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count_w++;
			}
			else if(ch[i]>='A'&& ch[i]<='Z')
			{
				count_u++;
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				count_l++;
			}
			else if(ch[i]>='0'&&ch[i]<='9')
			{
				count_n++;
			}
			else {
				count_s++;
				}
			}
		System.out.println("Word : "+count_w);
		System.out.println("UpperCase : " +count_u);
		System.out.println("LowerCase: "+count_l);
		System.out.println("Numbers: "+count_n);
		System.out.println("SpecialCharacter: "+count_s);
		}

	}

