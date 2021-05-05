package Concrete;

import Entities.Sales;

public class GamersSalesManager extends GamersManager 
{
	Sales sale = new Sales();
	
	public void salesQuantity() {
		sale.setQuantitySale(100);
	}
	

}
