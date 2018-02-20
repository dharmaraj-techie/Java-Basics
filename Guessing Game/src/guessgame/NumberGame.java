package guessgame;

import java.util.Scanner;

public class NumberGame {


	public static void main(String[] args) {
		boolean hasWon = false;
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random()*100)+1;
		System.out.println("I have chosen a number between 1 and 100 \ntry to guess it");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=10; i>0; i--){
			System.out.println("You have "+i+" guess remaining, chose again");
			int guess = scanner.nextInt();
			
			if(randomNumber<guess){
				System.out.println("your guess "+guess+" is greater that the chosen number");
			}else if(randomNumber>guess){
				System.out.println("your guess "+guess+" is lesser that the chosen number");
			}else if(randomNumber==guess){
				hasWon = true;
				break;
				}
			}
		if(hasWon){
			System.out.println("!!! your guess is correct !!!\n"+randomNumber+"- is the wright answer");
		}else{
			System.out.println("xxxx incorrect xxx\nThe correct answer is "+randomNumber);
		}
	}
}
