package ooplab01;

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args){
        String result_5791;
        result_5791=JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null,"Hi " + result_5791 +"!");
        System.exit(0);
    }
}
