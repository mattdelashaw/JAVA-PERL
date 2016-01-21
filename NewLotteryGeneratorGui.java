/*
author: matt delashaw
date: 1-20-16
bored. lottery number generator. success not guaranteed with use.
*/
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class NewLotteryGeneratorGui {
	public static void main (String []args) {
		int duplicate = Integer.parseInt(JOptionPane.showInputDialog("How many tickets do you want to make?"));
		int digits = Integer.parseInt(JOptionPane.showInputDialog("Input how many numbers (NOT INCLUDING BONUS)."));
		int range = Integer.parseInt(JOptionPane.showInputDialog("Input highest number range, INCLUSIVE."));
		
		Random randGen = new Random();		
		for(int i = 0; i < duplicate; i++) {
			
			int[] randInt = new int[digits];
			int instance = randGen.nextInt(range + 1);
			
			for(int ii = 0; ii < randInt.length; ii++) {
				int found = search(randInt, instance);
			
				switch(found){
				
					case 1 : randInt[ii] = instance;
								break;
				
					case 0 : instance = randGen.nextInt(range);
								ii = ii - 1;
								break;
				}
				
			}
			JOptionPane.showMessageDialog(null, "" + Arrays.toString(randInt) + "");		
		}
		
		int yn = JOptionPane.showConfirmDialog(null, "Is there a bonus number?", "Choose One", JOptionPane.YES_NO_OPTION);
		if(yn == 0){
			int bRange = Integer.parseInt(JOptionPane.showInputDialog("Input bonus number range, INCLUSIVE."));
			for(int d = 0; d < duplicate; d++){
				int bonus = randGen.nextInt(bRange) + 1;
				JOptionPane.showMessageDialog(null, "" + bonus + "");
			}
		}
	}

	public static int search (int[] array, int find) {
	
		for(int ii = 0; ii < array.length; ii++){
			if(array[ii] == find){
				return 0;
			}
		}return 1;
	
	}
}
