package gui_project;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {  
    private TextField tfInput;      // Input TextField  
    private TextField tfOutput;     // Output TextField  
    private int sum = 0;            // Accumulated sum, initialized to 0  

    // Constructor to setup the GUI components and event handlers
    public AWTAccumulator() {  
        setLayout(new GridLayout(2, 2));   // Set layout for the Frame  
        
        // Input label and text field  
        add(new Label("Enter an Integer: "));  
        tfInput = new TextField(10);  
        add(tfInput);  
        
        // Add action listener to the input text field  
        tfInput.addActionListener(new TFInputListener());  
        
        // Output label and text field  
        add(new Label("The Accumulated Sum is: "));  
        tfOutput = new TextField(10);  
        tfOutput.setEditable(false);  // Make output field read-only  
        add(tfOutput);  
        
        // Set frame properties  
        setTitle("AWT Accumulator");  
        setSize(350, 120);  
        setVisible(true);  
    }  
    
    // The main method  
    public static void main(String[] args) {  
        new AWTAccumulator();   // Launch the GUI application  
    }  
    
    // Inner class to handle action events  
    private class TFInputListener implements ActionListener {  
        @Override  
        public void actionPerformed(ActionEvent evt) {  
            int numberIn5791 = Integer.parseInt(tfInput.getText());  // Parse input  
            sum += numberIn5791;                                    // Update sum  
            tfInput.setText("");                                // Clear input  
            tfOutput.setText(sum + "");                         // Display result  
        }  
    }  
}

