package com.day1;

public class FlashCardsData implements CardSearchable {
	FlashCard a[] = new FlashCard[2];

	@Override
	public Card searchCard(String sub) throws CardNotFoundException {
		boolean flag = false;
		Card myCard=null;
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].getSubject().equals(sub)) {
				flag = true;
				temp = i;
				myCard=a[i];
			}
		}

		if (flag) {
			System.out.println("subject found at " + temp);
			System.out.println(a[temp]);
			
		}
		else {
			throw new CardNotFoundException("The card you are looking for is not available");
		}
		return myCard;
	}

}
