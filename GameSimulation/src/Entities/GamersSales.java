package Entities;

public class GamersSales extends Gamers 
{
	private String productName;
	private int productWorth;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductWorth() {
		return productWorth;
	}

	public void setProductWorth(int productWorth) {
		this.productWorth = productWorth;
	}
	
}
