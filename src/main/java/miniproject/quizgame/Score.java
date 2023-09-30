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
public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){    
        
        setBounds(300, 80, 750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);  
        
        JLabel jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/score.jpg")));
        jLabel1.setBounds(50, 150, 400, 300);
        add(jLabel1);
        
        JLabel heading = new JLabel("Thank you " + name +" for your participation.");
        heading.setBounds(0, 50, 750, 30);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setForeground(new Color(0, 153, 153));
        heading.setFont(new Font("Colonna MT", Font.BOLD, 28));
        add(heading);
        
        JLabel sc = new JLabel("Your score is " + score);
        sc.setBounds(400, 200, 350, 30);
        sc.setHorizontalAlignment(SwingConstants.CENTER);
        sc.setForeground(new Color(255, 0, 0));
        sc.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(sc);
        
        
        JButton submit = new JButton("Exit");
        submit.setBounds(500, 300, 150, 32);
        submit.setFont(new Font("Comic Sans MS", 1, 14));
        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit.setHorizontalTextPosition(SwingConstants.CENTER);
        submit.setBackground(new Color(51,0,102));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        //new Login();
    }
    
    public static void main(String[] args){
        new Score("User", 0);
    }   
}
