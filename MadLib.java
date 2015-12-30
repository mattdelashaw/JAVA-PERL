/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author matthewdelashaw
 */
class MadLib implements ActionListener {

        public String[] words = new String[10];
        int num = words.length;
	JTextField input;
        
        @Override
        public void actionPerformed(ActionEvent ae) {
                for(int x=0;x<num;x++){
                words[x] = input.getText();
                input.setEditable(false);
		}
        }

        public static void main(String[] args) {

                String[] labels = {"noun: ","noun: ","noun: ","adj.: ","adj.: ","adj.: ","adj.: ","verb: ","verb: ","verb: ","verb: "};
                int num = labels.length;

                JFrame frame = new JFrame("Mad Lib");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400,400);
                frame.setLocation(600,400);

                JPanel panel = new JPanel();
		panel.setBackground(new Color(53,56,64));
                Box box1 = Box.createVerticalBox();
                Box box2 = Box.createVerticalBox();
		Box box3 = Box.createVerticalBox();

                for (int i=0;i<num;i++) {
                        JLabel label = new JLabel(labels[i], JLabel.TRAILING);
                        label.setForeground(Color.white);
			box1.add(label);
                        JTextField input = new JTextField(10);
                        input.addActionListener(new MadLib());
                        label.setLabelFor(input);
                        box2.add(input);
                }

		JTextArea output = new JTextArea();
		box3.add(output);

                panel.add(box1, BorderLayout.WEST);
                panel.add(box2, BorderLayout.CENTER);
		panel.add(box3, BorderLayout.EAST);
                frame.setContentPane(panel);
                frame.setVisible(true);
        }
}
