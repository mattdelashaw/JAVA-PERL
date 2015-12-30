package hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.io.IOException;

public class Hangman {
	
	private static String inFile;
	private static JButton choice;
	private static List<String> separateWords;
	private static List<String> mystery;
	private static JTextArea unknownWord;
	private static int locationOfLetter;
	
	static class ButtonsDoThings implements ActionListener {
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == choice){
				if(separateWords.indexOf(choice.getText())= true){
					locationOfLetter = separateWords.indexOf(choice.getText());
					mystery.add(locationOfLetter,choice.getText());
					unknownWord.setText(mystery.toString());
				}
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
		try {
			separateWords = read.loadFile();
			List<String> mystery = new ArrayList<String>();
			for (int a = 0; a <= separateWords.size();a++){
				mystery.add("*");
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
		JLabel displayLives = new JLabel();
		right.add(displayLives, BorderLayout.CENTER);
		JTextArea unknownWord = new JTextArea();
		unknownWord.setText(mystery.toString());
		right.add(unknownWord, BorderLayout.NORTH);
			
		for(char c = 'a';c <= 'z'; c++){
			JButton choice = new JButton(Character.toString(c));
			choice.addActionListener(new ButtonsDoThings());
			left.add(choice);
		}
		frame.setVisible(true);
	}

}
