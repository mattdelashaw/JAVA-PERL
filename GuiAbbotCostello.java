import javax.swing.JOptionPane;

class GuiAbbotCostello {

        public static void main(String[] args) {

                String[] bases = new String[3];
                Object[] playerNames = {"Who", "What", "I Don\'t Know"};
                Object inputObject = new Object();

                inputObject = JOptionPane.showInputDialog(null,"1st baseman?","1st Baseman",JOptionPane.PLAIN_MESSAGE, null, playerNames, playerNames[0]);
                bases[0] = inputObject.toString();

                bases[1] = (String)JOptionPane.showInputDialog(null, "2nd baseman?","2nd Baseman", JOptionPane.PLAIN_MESSAGE, null, playerNames, playerNames[1]);

                bases[2] = (String)JOptionPane.showInputDialog(null,"3rd baseman?", "3rd Baseman", JOptionPane.PLAIN_MESSAGE, null, playerNames, playerNames[2]);

                JOptionPane.showMessageDialog(null,""+bases[0]+" is on first.\n" +bases[1]+" is on second.\n"+bases[2]+" is on third.","Basemen",JOptionPane.PLAIN_MESSAGE);
        }
}
