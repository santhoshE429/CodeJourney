package encapsulation;

public class UserProd {

	public static void main(String[] args) {
	
		Product p1=new Product("Brush", 23, 200);
		Product p2=new Product("pen", 12, 200);
		Product p3=new Product("note", 2, 200);
		Product p4=new Product("dress", 1, 00);
		
		Product[]products= {p1,p2,p3,p4};
		
		for(int i=0;i<products.length;i++)
		{
			if(products[i].getPrice()*products[i].getQty()>=500)
			{
				System.out.println("Product Name is:"+products[i].getPname());
			}
			
		}
		

	}

}
