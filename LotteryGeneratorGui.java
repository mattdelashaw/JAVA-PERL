/*
author: matt delashaw
date: 1-11-16
bored. lottery number generator. success not guaranteed with use.
*/
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class LotteryGeneratorGui {
	public static void main (String []args) {
		int duplicate = Integer.parseInt(JOptionPane.showInputDialog("How many tickets do you want to make?"));
		int digits = Integer.parseInt(JOptionPane.showInputDialog("Input how many numbers, not including bonus."));
		int range = Integer.parseInt(JOptionPane.showInputDialog("Input highest number range, inclusive."));
		
		Random randGen = new Random();		
		for(int d = 0; d < duplicate; d++) {
		int[] randInt = new int[digits];
		for(int i = 0; i < digits; i++) {
			randInt[i] = randGen.nextInt(range) + 1;
		}
		JOptionPane.showMessageDialog(null, "" + Arrays.toString(randInt) + "");
		}
		
		int yn = JOptionPane.showConfirmDialog(null, "Is there a bonus number?", "Choose One", JOptionPane.YES_NO_OPTION);
		if(yn == 0){
			int bRange = Integer.parseInt(JOptionPane.showInputDialog("Input bonus number range, inclusive."));
			for(int d = 0; d < duplicate; d++){
				int bonus = randGen.nextInt(bRange) + 1;
				JOptionPane.showMessageDialog(null, "" + bonus + "");
		}
		}
	}
}
