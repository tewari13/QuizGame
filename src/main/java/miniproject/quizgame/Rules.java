/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.quizgame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(255, 204, 204));
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome to the Innovative Minds, " +name);
        heading.setBounds(0, 50, 900, 30);
        heading.setFont(new Font("Sitka Text", 1, 28));
        heading.setForeground(new Color(204, 0, 51));
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(150, 100, 700, 400);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 15));
        rules.setHorizontalAlignment(SwingConstants.LEADING);
        rules.setText(
            "<html>"+
                "1. You can attempt this quiz only once. Only single participation is allowed." + "<br><br>" +
                "2. There are a total of 10 MCQs based on Java programming." + "<br><br>" +
                "3. Each question carries 10 marks." + "<br><br>" +
                "4. There will be no negative marking for wrong answers." + "<br><br>" +        
                "5. The participant will be given 15 seconds to answer each of the question." + "<br><br>" +        
                "6. Click on Next button to jump on the next question." + "<br><br>" +        
                "7. By clicking 50-50 lifeline button, it will eliminate two wrong options." + "<br><br>" +        
                "8. You can use 50-50 lifeline only once throughout the entire quiz" + "<br><br>" +
                "9. The timer will start the moment you click the Start button." + "<br><br>" + 
                "10. Click on Submit button on completion of the quiz. Wish you Good luck." + "<br><br>" + 
            "<html>"            
        ); 
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(300, 550, 100, 30);
        back.setFont(new Font("Comic Sans MS", 1, 14));
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setHorizontalTextPosition(SwingConstants.CENTER);
        back.setBackground(new Color(51,0,102));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        start = new JButton("Start");
        start.setBounds(500, 550, 100, 30);
        start.setFont(new Font("Comic Sans MS", 1, 14));
        start.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        start.setHorizontalTextPosition(SwingConstants.CENTER);
        start.setBackground(new Color(51,0,102));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        setSize(900, 650);
        setLocation(200, 20);
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    
    public static void main(String[] args){
        new Rules("User");
    }
    
}
