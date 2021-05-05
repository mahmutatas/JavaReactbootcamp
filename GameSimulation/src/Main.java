import Concrete.GamersManager;
import Concrete.PromotionManager;
import Entities.Gamers;

public class Main {

	public static void main(String[] args) {
		Gamers gamer = new Gamers();

		GamersManager gamerManager = new GamersManager();
		
		gamerManager.addGamer(gamer);
		gamerManager.showGamerDetails(gamer);
		
		PromotionManager promotionManager = new PromotionManager();
		promotionManager.savePromotion(gamer);
		promotionManager.updatePromotion(gamer);
		promotionManager.deletePromotion(gamer);
		
		
	}

}
