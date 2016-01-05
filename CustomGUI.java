import javax.swing.*;
import java.awt.*;

class CustomGui {

        public static void main(String[] args) {

                JFrame frame = new JFrame("TopLevelDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300,300);

                JPanel panel = new JPanel(new BorderLayout());

                JLabel label = new JLabel("I am a Label");

                JButton button = new JButton("I am a Button");

                String[] comboOptions = {"Combo Option 1","Combo Option 2","Combo Option 3"};

                JComboBox combo = new JComboBox(comboOptions);

                String[] listOptions = {"List Item 1","List Item 2","List Item 3"};
                JList list = new JList(listOptions);

                JTextField textField = new JTextField(25);

                panel.add(textField, BorderLayout.NORTH);
                panel.add(label, BorderLayout.WEST);
                panel.add(button, BorderLayout.CENTER);
                panel.add(list, BorderLayout.EAST);
                panel.add(combo, BorderLayout.SOUTH);

                frame.setContentPane(panel);

                frame.setVisible(true);
        }
}
