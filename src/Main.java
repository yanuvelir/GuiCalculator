import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String greeting = "Welcome to the Calculator!";
        JOptionPane.showMessageDialog(null, greeting, "Greening", JOptionPane.PLAIN_MESSAGE);

        double num1, num2, result = 0;
        String action;

        do {
            //JOptionPane.showInputDialog("Please
            // enter first number...");
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first number..."));

            //System.out.println("Please enter second number...");
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second number..."));

            //System.out.println("Please enter an action +-/* or 'e' for exit");
            action = JOptionPane.showInputDialog("Please enter an action +-/* or 'e' for exit");

            if (action.equals("/")&& num2==0) {
                System.out.println("it is impossible to divide by zero");
                return;
            }

            result = switch (action) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "/" -> num1 / num2;
                case "*" -> num1 * num2;
                default -> result;
            };
            System.out.println("Result is: " +result);// Changed the condition to an infinite loop
            String resultDone = "Result is: " + result;
            JOptionPane.showMessageDialog(null, resultDone, "Result!", JOptionPane.PLAIN_MESSAGE);

        }while (!action.equals("e"));
    }
}