package com.day1;

import java.util.Scanner;

public class FlashCardTest {
	public static void main(String[] args) {

		FlashCardsData fcd = new FlashCardsData();
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String sub, question, ans;
			System.out.println("Enter Subject :");
			sub = in.nextLine();
			System.out.println("Enter Question :");
			question = in.nextLine();
			System.out.println("Enter Answer :");
			ans = in.nextLine();

			fcd.a[i] = new FlashCard(sub, question, ans);

		}
		in.nextLine();
		System.out.println("Enter Subject to search :");
		try {
			fcd.searchCard(in.next());
		} catch (CardNotFoundException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * ArrayList<FlashCard > arr= new ArrayList<FlashCard>(); Scanner in =
		 * new Scanner(System.in); for (int i = 0; i < 2; i++) {
		 * System.out.println("Enter Subject, question & answer :");
		 * 
		 * FlashCard fc= new FlashCard(in.next(), in.next(), in.next());
		 * arr.add(fc);
		 * 
		 * }
		 * 
		 * Collections.sort(arr);
		 * 
		 * 
		 * System.out.println(arr);
		 */

	}
}
