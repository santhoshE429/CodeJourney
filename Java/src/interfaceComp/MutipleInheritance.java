package interfaceComp;
interface Romeo{
	void singer();
}
interface Juliet{
	void dancer();
}

public class MutipleInheritance implements Romeo,Juliet {
	@Override
	public void singer() {
		System.out.println("Hip Hop");
	}
	@Override
	public void dancer() {
		System.out.println("Aadingada enasuthi");
	}
	public static void main(String[] args) {
		MutipleInheritance ref=new MutipleInheritance();
		ref.singer();
		ref.dancer();
		
	}

}
