package com.boopathi.baseclass;

import java.util.ArrayList;
import java.util.List;

public class Dict {

	public List<MstCard> cards;

			
	public List<MstCard> getCards() {
		return cards;
	}

	public void setCards(List<MstCard> cards) {
		this.cards = cards;
	}

	
	public boolean getNextBiggest(String type, float value)
	{
		for (MstCard mstCard : cards) 
		{
			if(mstCard.getKey().equals(type))
			{
				float cardValue = Float.parseFloat(mstCard.getValue());
				if(cardValue > value)
					return true;
			}
		}
		return false;
	}
	
	public boolean isTrumpCard()
	{
		List<MstCard> trumpCards = new ArrayList<>();
		for (MstCard mstCard : cards)
		{
			if(mstCard.getKey().equals("card_type") && mstCard.getValue().equals("trump"))
			{
				return true;
			}
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "Dict [cards=" + cards + "]";
	}
}
