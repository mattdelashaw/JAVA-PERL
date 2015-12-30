package hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.io.IOException;

public class GUI {
	
	private static int lives = 6;
	private static String inFile;
	private JButton choice;
	private static List<String> separateWords;
	private static List<String> mysterySymbols;
	private static JTextArea unknownWord;
	private static String targetWord;
	
	static class ButtonsDoThings implements ActionListener {
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == choice)&&(targetWord.contains(choice.getText()))){
				mysterySymbols.add(separateWords.indexOf(event),String.valueOf(event));
				unknownWord.setText(mysterySymbols.toString());
				choice.setEnabled(false);
			}else if(targetWord.contains(choice.getText()) == false){
				lives --;
				choice.setEnabled(false);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		
		inFile = JOptionPane.showInputDialog("file name");
		
		JFrame frame = new JFrame("Hangman...ish");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setResizable(false);
		
		Input read = new Input(inFile);
		List<String> separateWords = new ArrayList<String>();
		Random rand = new Random();
		try {
			separateWords = read.loadFile();
			targetWord = separateWords.get(rand.nextInt());
			List<String> mysterySymbols = new ArrayList<String>();
			for (int a = 0; a <= separateWords.size();a++){
				mysterySymbols.add("*");
			}
		}catch (IOException ioe){
			System.out.println(ioe.getMessage());
		}
		
		JPanel base = new JPanel(new GridLayout(1,2));
		frame.setContentPane(base);
		
		JPanel left = new JPanel(new GridLayout(9,3));
		base.add(left);
		
		JPanel right = new JPanel(new BorderLayout());
		base.add(right);
		JLabel displayLives = new JLabel("Guesses left: "+ lives);
		right.add(displayLives, BorderLayout.CENTER);
		JTextArea unknownWord = new JTextArea();
		unknownWord.setText(mysterySymbols.toString());
		right.add(unknownWord, BorderLayout.NORTH);
			
		for(char c = 'a';c <= 'z'; c++){
			JButton choice = new JButton(Character.toString(c));
			choice.addActionListener(new ButtonsDoThings());
			left.add(choice);
		}
		frame.setVisible(true);
	}

}
