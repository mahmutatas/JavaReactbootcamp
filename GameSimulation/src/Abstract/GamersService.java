package Abstract;

import Entities.Gamers;

public interface GamersService 
{
	void savePromotion(Gamers gamer);
	void deletePromotion(Gamers gamer);
	void updatePromotion(Gamers gamer);

}
