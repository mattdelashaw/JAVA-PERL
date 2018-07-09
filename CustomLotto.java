import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CustomLotto{
	
	static int[][] tickets;
	static int[] numbers;
	static int[] bonuses;
	
	public static void allThingsGui(){
		JFrame frame = new JFrame("Lotto Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPane = new JPanel(new SpringLayout());
		JLabel ticketNumLabel = new JLabel("Number of tickets: ", JLabel.TRAILING);
		JLabel pickNumLabel = new JLabel("How many numbers to pick: ", JLabel.TRAILING);
		JLabel bonusBoolLabel = new JLabel("Bonus number? ", JLabel.TRAILING);
		JLabel mainMaxNumLabel = new JLabel("Maximum number value: ", JLabel.TRAILING);
		JLabel bonusMaxNumLabel = new JLabel("Maximum bonus number value: ", JLabel.TRAILING);
		JTextField numOfTickets = new JTextField(4);
		JTextField numOfNums = new JTextField(4);
		JTextField maxOfNums = new JTextField(4);
		JTextField maxOfBonus = new JTextField(4);
		JCheckBox bonusBool = new JCheckBox();
		JPanel buttonPanel = new JPanel();
		JButton submitButton = new JButton("Generate");
		
		submitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				boolean a = numOfTickets.getText().isEmpty();
				boolean b = numOfNums.getText().isEmpty();
				boolean c = maxOfNums.getText().isEmpty();
				boolean d = bonusBool.isSelected();
				boolean f = maxOfBonus.getText().isEmpty();
				
				if((a && b && c) == false){
					int one = Integer.parseInt(numOfTickets.getText());
					int two = Integer.parseInt(numOfNums.getText());
					int three = Integer.parseInt(maxOfNums.getText());
					 
					if(d == true){
						if(f == false){
							int four = Integer.parseInt(maxOfBonus.getText());
							generateTickets(one, two, three, four);
						}else{
							JOptionPane.showMessageDialog(frame, "If you select the bonus number checkbox, bonus max value cannot be blank", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}else{
						generateTickets(one, two, three, 0);
					}
				}else{
					JOptionPane.showMessageDialog(frame, "Number of tickets, how many numbers, and max value cannot be blank.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		maxOfBonus.setEditable(false);
		bonusBool.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {
		            maxOfBonus.setEditable(true);
		        }else if(e.getStateChange() == ItemEvent.DESELECTED){
		        	maxOfBonus.setEditable(false);
		        }else{
		        	maxOfBonus.setEditable(false);
		        } 
			}
		});
		
		mainPane.add(ticketNumLabel);
		ticketNumLabel.setLabelFor(numOfTickets);
		mainPane.add(numOfTickets);
		mainPane.add(pickNumLabel);
		pickNumLabel.setLabelFor(numOfNums);
		mainPane.add(numOfNums);
		mainPane.add(bonusBoolLabel);
		bonusBoolLabel.setLabelFor(bonusBool);
		mainPane.add(bonusBool);
		mainPane.add(mainMaxNumLabel);
		mainMaxNumLabel.setLabelFor(maxOfNums);
		mainPane.add(maxOfNums);
		mainPane.add(bonusMaxNumLabel);
		bonusMaxNumLabel.setLabelFor(maxOfBonus);
		mainPane.add(maxOfBonus);
		buttonPanel.add(submitButton);
		
		SpringUtilities.makeCompactGrid(mainPane, 5, 2, 6, 6, 6, 6);
		
		frame.setLayout(new GridLayout(2,1));
		frame.add(mainPane);
		frame.add(buttonPanel);
		frame.pack();
		frame.setVisible(true);
	}
	
	private static void generateTickets(int tick, int nums, int numMax, int bonMax){
		tickets = new int[tick][nums];
		bonuses = new int[tick];
		
		for(int i = 0; i < tickets.length; i++){
			numbers = new int[nums];
			
			for(int j = 0; j < numbers.length; j++){
				int randNum = getRandomNumber(numMax);
				boolean picked = IntStream.of(numbers).anyMatch(x -> x == randNum);
				
				if(picked && (numbers[j] == 0)){
					j--;
				}else{
					numbers[j] = randNum;
				}
			}
			if(bonMax != 0){
				int bonNum = getRandomNumber(bonMax);
				bonuses[i] = bonNum;
			}
			tickets[i] = numbers;
			Arrays.sort(tickets[i]);
			JOptionPane.showMessageDialog(null, Arrays.toString(tickets[i]) + " " + bonuses[i]);
		}
	}
	
	private static int getRandomNumber(int maxNum){
		Random rand = new Random();
		int randNum = rand.nextInt(maxNum) + 1;
		return randNum;
	}
	
	public static void main(String[] args){
		allThingsGui();
	}
	
}
