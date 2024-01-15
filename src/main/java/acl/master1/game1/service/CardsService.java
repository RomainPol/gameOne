package acl.master1.game1.service;

import acl.master1.game1.dto.CardDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class CardsService {
	
	public List<CardDTO> shuffle(List<CardDTO> cards) {

		Collections.shuffle(cards);

		return cards ;
	}
	
	public List<CardDTO> pullCards(Integer numberOfCard, List<CardDTO> cards){
		if(numberOfCard < 0)
			throw new IllegalArgumentException("Your number of card is null");

		List<CardDTO> res = new ArrayList<CardDTO>();

		for(int i = 0; i < numberOfCard; i++){
			CardDTO aux = this.pullOneCard(cards);
			res.add(aux);
		}
		return res;
	}

	private CardDTO pullOneCard(List<CardDTO> cards){
		Integer LOWER_RANGE = 0; //assign lower range value
		Integer UPPER_RANGE = cards.size() - 1; //assign upper range value
		Random random = new Random();
		Integer  randomValue =
				(Integer)(random.nextInt(UPPER_RANGE - LOWER_RANGE));
		CardDTO myCard = cards.get(randomValue);
		cards.remove(myCard);
		return myCard;
	}
}
