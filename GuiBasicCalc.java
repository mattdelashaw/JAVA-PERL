import javax.swing.JOptionPane;

class GuiBasicCalc {

        public static void add(int num1, int num2) {

                int result = num1+num2;
                JOptionPane.showMessageDialog(null, ""+num1+" + "+num2+" = "+result,"Addition Wizard", JOptionPane.PLAIN_MESSAGE);
        }

        public static void sub(int num1, int num2) {

                int result = num1-num2;
                JOptionPane.showMessageDialog(null, ""+num1+" - "+num2+" = "+result,"Subtraction Guru",JOptionPane.INFORMATION_MESSAGE);
        }

        public static void mult(int num1, int num2) {

                int result = num1*num2;
                JOptionPane.showMessageDialog(null, ""+num1+" * "+num2+" = "+result,"Multiplicationarianism",JOptionPane.WARNING_MESSAGE);
        }

        public static void div(double num1, double num2) {

                double result = num1/num2;
                JOptionPane.showMessageDialog(null, ""+num1+" / "+num2+" = "+result,"Divided The Ranks",JOptionPane.ERROR_MESSAGE);
        }


        public static void main(String[] args) {

                int firstNumber,secondNumber;
                String[] operations = {"+","-","*","/"};
                String selection;
                int repeat;

                do{
                firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Input a number: ","First Number",JOptionPane.QUESTION_MESSAGE));
                secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Input another number: ","Second Number",JOptionPane.QUESTION_MESSAGE));
                selection = (String)JOptionPane.showInputDialog(null,"Operation?","Math is FUN",JOptionPane.QUESTION_MESSAGE, null, operations,null);

                if (selection.equals("+")) {
                        add(firstNumber,secondNumber);
                }else if (selection.equals("-")) {
                        sub(firstNumber,secondNumber);
                }else if (selection.equals("*")) {
                        mult(firstNumber,secondNumber);
                }else if (selection.equals("/")) {
                        div(firstNumber,secondNumber);
                }

                repeat = JOptionPane.showConfirmDialog(null,"Try another one?","Repeat?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                }while (repeat==JOptionPane.YES_OPTION);
        }
}
