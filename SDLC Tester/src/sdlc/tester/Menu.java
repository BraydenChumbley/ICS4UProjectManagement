/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdlc.tester;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JPanel titlePanel, choicePanel, testQuestionPanel;
    JLabel titleName;
    JButton btnLearn, btnTest, btnScore;
    JTextArea questionTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90); //Custom font
    Font normalFont = new Font("Times new Roman", Font.PLAIN, 50);

    public void displayMenu() {

        //Window
        window = new JFrame();
        window.setSize(800, 600); //Set the size of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.gray); //Set the color of the background
        window.setLayout(null); //Disable the default layout of the window
        con = window.getContentPane();

        //Title and stuff
        titlePanel = new JPanel(); //Creat a new panel
        titlePanel.setBounds(100, 50, 600, 150); //Set the size of the panel
        titlePanel.setBackground(null); //Set the color of the panel
        titleName = new JLabel("SDLC Thing"); //Write what the text for title is
        titleName.setForeground(Color.white); //Set the tile name color to white
        titleName.setFont(titleFont);
        titlePanel.add(titleName); //Add the tileName onto the title Panel
        con.add(titlePanel); //Add the title to panel

        //Pannel for buttons
        choicePanel = new JPanel();
        choicePanel.setBounds(200, 180, 400, 300);
        choicePanel.setBackground(null);
        choicePanel.setLayout(new GridLayout(3, 1));
        con.add(choicePanel);

        //Learn button //btnLearn.setBorder(null);
        btnLearn = new JButton("Learn About It");
        btnLearn.setBackground(Color.black);
        btnLearn.setForeground(Color.white);
        btnLearn.setFont(normalFont);
        choicePanel.add(btnLearn);
        btnLearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnMore(evt);
            }
        });
        //Test button
        btnTest = new JButton("Take The Test");
        btnTest.setBackground(Color.black);
        btnTest.setForeground(Color.white);
        btnTest.setFont(normalFont);
        choicePanel.add(btnTest);
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTest(evt);
            }
        });
        //Score button
        btnScore = new JButton("Check Score");
        btnScore.setBackground(Color.black);
        btnScore.setForeground(Color.white);
        btnScore.setFont(normalFont);
        choicePanel.add(btnScore);
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeScore(evt);
            }
        });
        window.setVisible(true); //By making it ture it will display the window

        if (btnScore.isSelected() == true) {
            System.out.println("works");
        }
    }

    public void btnTestActionPerformed() {
        if (btnTest.isSelected()) {
            System.out.println("This works");
        }
    }

    public void startTest(java.awt.event.ActionEvent evt) {
        titlePanel.setVisible(false);
        choicePanel.setVisible(false);

        testQuestionPanel = new JPanel();
        testQuestionPanel.setBounds(100, 100, 600, 250);
        testQuestionPanel.setBackground(null);
        con.add(testQuestionPanel);

        questionTextArea = new JTextArea("Question stuff");
        questionTextArea.setBounds(100, 100, 600, 250);
        questionTextArea.setBackground(Color.black);
        questionTextArea.setForeground(Color.white);
        questionTextArea.setFont(normalFont);
        questionTextArea.setLineWrap(true); //This will make the if the text is too long it will go to the next line
        testQuestionPanel.add(questionTextArea);
    }

    public void seeScore(java.awt.event.ActionEvent evt) {
        titlePanel.setVisible(false);
        choicePanel.setVisible(false);

        System.out.println("Nothing here");
    }

    public void learnMore(java.awt.event.ActionEvent evt) {
        titlePanel.setVisible(false);
        choicePanel.setVisible(false);
        System.out.println("Knowledge");
    }

}
