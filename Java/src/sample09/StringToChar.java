package sample09;

 class StringToChar1 {

	public static void main(String[] args) {
		String str ="java";
		char ch[]=new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			
		}
		System.out.println(ch);

	}

}
 public  class StringToChar
 {
	 public static void main(String[] args) {
		String string="jdbc";
		char []ch=string.toCharArray();
		System.out.println(ch);
	}
	 
 }
