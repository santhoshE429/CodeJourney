package encapsulation;

public class Product {
	
	private String pname;
	private long Qty;
	private double price;
	public Product(String pname,long Qty,double price ) {
		this.pname=pname;
		this.Qty=Qty;
		this.price=price;
	}
	

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}


	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}


	/**
	 * @return the qnt
	 */
	public long getQty() {
		return Qty;
	}


	/**
	 * @param qnt the qnt to set
	 */
	public void setQty(long Qty) {
		Qty = Qty;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	
}
