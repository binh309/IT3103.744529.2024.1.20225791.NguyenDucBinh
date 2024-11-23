package ooplab01;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args){
        String strNum1_5791,strNum2_5791;
        String strNotification_5791 = "You 've just entered: " ;
        strNum1_5791=JOptionPane.showInputDialog(null,"Please input the first number: "
        ,"Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNotification_5791+=strNum1_5791+ " and ";
        strNum2_5791=JOptionPane.showInputDialog(null,"Please input the second number: ",
        "Input the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotification_5791+=strNum2_5791;
        JOptionPane.showMessageDialog(null, strNotification_5791,
        "Show two number ",JOptionPane.INFORMATION_MESSAGE);
         System.exit(0);
    }
}
