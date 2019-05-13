/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdlc.tester;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author tonyy
 */
public class Menu {

    JFrame window;
    Container con;
    JPanel titlePanel, startPanel, DialogPanel, choicePanel, statusPanel;
    JLabel titleName, hpLabel, hpNumLabel, weaponLabel, weaponNumLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90); //Custom font
    Font normalFont = new Font("Times new Roman", Font.PLAIN, 20);

    public void displayMenu() {

        //Window
        window = new JFrame();
        window.setSize(800, 600); //Set the size of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.pink); //Set the color of the background
        window.setLayout(null); //Disable the default layout of the window
        
         //Button
        startPanel = new JPanel();
        startPanel.setBounds(300, 400, 200, 100);
        startPanel.setBackground(Color.black);
        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startPanel.add(startButton);
        window.add(titlePanel);
        window.add(startPanel);
        
        window.setVisible(true); //By making it ture it will display the window
    }
}
