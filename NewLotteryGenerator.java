import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class NewLotteryGenerator {
	public static void main (String []args) {
		Scanner scanny = new Scanner(System.in);
		Random randGen = new Random();
		
		System.out.print("highest integer, exclusive: ");
		int x = scanny.nextInt();
		
		System.out.print("how many: ");
		int y = scanny.nextInt();
		int[] picks = new int[y];
		int instance = randGen.nextInt(x + 1);
		
		for(int i = 0; i < picks.length; i++) {

			int found = search(picks, instance);
			
			switch(found){
				
				case 1 : picks[i] = instance;
				break;
				
				case 0 : instance = randGen.nextInt(x);
				i = i - 1;
				break;
			}
		}
		
		System.out.println(Arrays.toString(picks));
	}

	public static int search (int[] array, int find) {
	
		for(int ii = 0; ii < array.length; ii++){
			if(array[ii] == find){
				return 0;
			}
		}return 1;
	
	}
}
