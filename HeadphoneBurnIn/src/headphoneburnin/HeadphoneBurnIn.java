package headphoneburnin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HeadphoneBurnIn extends JFrame implements ActionListener {
    
    JButton button = new JButton();
    JFrame mainPanel = new JFrame("Burn em");
    
    public HeadphoneBurnIn(){
        mainPanel.setSize(500,500);
        mainPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel.pack();
        mainPanel.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public static void main(String[] args) {
        HeadphoneBurnIn h = new HeadphoneBurnIn();
    }
    
}
