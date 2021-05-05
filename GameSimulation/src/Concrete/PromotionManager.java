package Concrete;

import Abstract.GamersService;
import Entities.Gamers;
import Entities.GamersSales;
import Entities.Promotion;
import Entities.Sales;

public class PromotionManager extends GamersSales implements GamersService
{

	void promotionDetails(Promotion promotion) 
	{
		promotion.promotionName = " Incredible Sales ";
		promotion.quantityPromotion = 1/2;
	
	}
	
	@Override
	public void savePromotion(Gamers gamer) 
	{
		Promotion promotion = new Promotion();
		promotionDetails(promotion);
		System.out.print("Added promotion which is " + promotion.promotionName);
		System.out.println(" to " + gamer.getName());
		
	}

	@Override
	public void deletePromotion(Gamers gamer) 
	{
		Promotion promotion = new Promotion();
		promotionDetails(promotion);
		System.out.print("Deleted promotion which is " + promotion.promotionName);
		System.out.println(" to " + gamer.getName());
				
	}

	@Override
	public void updatePromotion(Gamers gamer) {
		Promotion promotion = new Promotion();
		promotionDetails(promotion);
		System.out.print("Updated promotion which is " + promotion.promotionName);
		System.out.println(" to " + gamer.getName());
		
	}
	
	public void entegred() {
		Sales sale = new Sales();
		Promotion promotion = new Promotion();
		if(sale.getQuantitySale() > 100) {
			promotion.quantityPromotion = 1/5;
		}
		else {
			System.out.println("There is no promotion for this sales!");
		}
	}
	

}
