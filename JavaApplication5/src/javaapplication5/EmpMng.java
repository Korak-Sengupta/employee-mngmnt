
package javaapplication5;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class EmpMng extends JFrame implements ActionListener {

    EmpMng()
    { 
       setLayout(null) ;
       
       JLabel heading = new JLabel("Wells-Fargo Management System");
       heading.setBounds(50,30,1200,60);
      // heading.setForeground(Color.YELLOW);
       heading.setFont(new Font("serif",Font.PLAIN,80));
       add(heading);
       
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(50,100,1050,500);
       add(image);
      
    
    JButton clickhere = new JButton("Click Here to Continue");
    clickhere.setBounds(400, 300, 300, 70);
    clickhere.setBackground(Color.YELLOW);
    clickhere.setForeground(Color.BLACK);
    clickhere.setFont(new Font("serif",Font.PLAIN,20));
    clickhere.addActionListener(this);
    add(clickhere);
    
       
      getContentPane().setBackground(Color.red);
      setSize(1170,650);
      setLocation(220,50); //Opening on laptop screen
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
      setVisible(false) ;
      new login();
    }
    
     public static void main(String[] args) {
        new EmpMng();
    }
}

