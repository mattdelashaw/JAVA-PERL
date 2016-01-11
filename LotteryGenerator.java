/*
author: matt delashaw
date: 1-4-16
bored. lottery number generator, 5 num 1-75 and 1 num 1-15. success not guaranteed with use.
*/
import java.util.Random;

public class LotteryGenerator {

	public static void main (String []args) {
		Random randGen = new Random();
		for (int i = 1; i <= 5; ++i){
			int randInt = randGen.nextInt(75) + 1;
			System.out.println(randInt);
		}
		
		int bonus = randGen.nextInt(15) + 1;
		System.out.println(bonus);
	}	
}
