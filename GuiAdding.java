import javax.swing.JOptionPane;

class GuiAdding {

        public static void main(String[] args) {

                int firstNumber,secondNumber;
                String firstNumberAsString;

                firstNumberAsString = JOptionPane.showInputDialog("What is the first number?");

                firstNumber = Integer.parseInt(firstNumberAsString);

                secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"What is the second number?", "2nd Number", JOptionPane.PLAIN_MESSAGE));

                add(firstNumber, secondNumber);
        }

        public static void add(int num1, int num2) {

                int result = num1+num2;

                JOptionPane.showMessageDialog(null, result);

                JOptionPane.showMessageDialog(null, ""+num1+" + "+num2+" = "+result, "Addition", JOptionPane.PLAIN_MESSAGE);
        }
}
