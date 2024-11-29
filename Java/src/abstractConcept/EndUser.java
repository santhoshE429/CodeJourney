package abstractConcept;

//service specifier

abstract class Qspider
{
	abstract public void developmentSub();
	abstract public void testingSub();
}
//service provider
class Trainer extends Qspider //Concrete class
{
	public void developmentSub() //concrete method
	{
		System.out.println("j2EE,sql,web tech,j2SE");
	}
	public void testingSub() {
		System.out.println("sql,manual,java,selninum");
	}
}

public class EndUser
{

	public static void main(String[] args)
	{
		Qspider Q1=new Trainer();
		Q1.developmentSub();
		Q1.testingSub();
	}

}
