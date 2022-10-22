package javaapplication5;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;

public class remove extends JFrame{
    Choice empname;
   remove() {
    getContentPane().setBackground(Color.WHITE);
      setSize(900,700);
      setLocation(300,50); //Opening on laptop screen
      setVisible(true);   
      setLayout(null);
       
       JLabel search = new JLabel("Search by Name");
       search.setBounds(30,50,150,30);
       search.setFont(new Font("serif",Font.PLAIN,20));
       add(search);
       
       empname = new Choice();
       empname.setBounds(200,50,200,30);
       add(empname);
       
       try{
          conn c = new conn();
          String query= "select * from employee";
          ResultSet rs= c.s.executeQuery(query);
          
          while(rs.next())
          {
              empname.add(rs.getString("name"));
          }
       }
       catch (Exception e){
           e.printStackTrace();
       }

   
   JLabel name = new JLabel("Name");
       name.setBounds(50,100,100,30);
       name.setFont(new Font("serif",Font.PLAIN,20));
       add(name);
       JLabel tfname = new JLabel();
       tfname.setBounds(200,100,100,30);
       add(tfname);
         
       JLabel role = new JLabel("Role");
       role.setBounds(50,150,100,30);
       role.setFont(new Font("serif",Font.PLAIN,20));
       add(role);
       JLabel prole = new JLabel();
       prole.setBounds(200,150,200,30);
       add(prole);
       
       JLabel dob = new JLabel("Date of Birth");
       dob.setBounds(50,200,150,30);
       dob.setFont(new Font("serif",Font.PLAIN,20));
       add(dob);
       JLabel birth = new JLabel();
       birth.setBounds(200,200,200,30);
       add(birth);
       
       
       JLabel salary = new JLabel("Package");
       salary.setBounds(50,250,150,30);
       salary.setFont(new Font("serif",Font.PLAIN,20));
       add(salary);
        JLabel sal = new JLabel();
       sal.setBounds(200,250,250,30);
       add(sal);
       
       JLabel email = new JLabel("Email");
       email.setBounds(450,250,150,30);
       email.setFont(new Font("serif",Font.PLAIN,20));
       add(email);
       JLabel eemail = new JLabel();
       eemail.setBounds(550,250,250,30);
       add(eemail);
       
       
       JLabel phone = new JLabel("Phone");
       phone.setBounds(50,250,150,30);
       phone.setFont(new Font("serif",Font.PLAIN,20));
       add(phone);
       JLabel ephone = new JLabel();
       ephone.setBounds(170,250,200,30);
       add(ephone);
       
       
       JLabel aad = new JLabel("Aadhar");
       aad.setBounds(50,300,150,30);
       aad.setFont(new Font("serif",Font.PLAIN,20));
       add(aad);
       JLabel eaad = new JLabel();
       eaad.setBounds(170,300,200,30);
       add(eaad);
       
       
       JLabel edu = new JLabel("Education");
       edu.setBounds(450,300,150,30);
       edu.setFont(new Font("serif",Font.PLAIN,20));
       add(edu);
       
       JLabel eedu = new JLabel();
       eedu.setBounds(550,300,250,30);
       add(eedu); 
           
      
   }
       
    public static void main(String args[])
    {
        new remove();
    }
}
