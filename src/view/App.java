package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author Devin Kutbay
 * @since 05.10.2021
 * @version 1.0
 */

public class App extends JFrame {

    private JLabel titel;
    private JButton start;
    private JButton klassenspiegel;
    private JButton credits;
    private JButton leave;
    private JPanel buttons;
    private JPanel buttonPanel;
    private JPanel title;

    public App(){
        setTitle("Namen-Lernsystem");
        getContentPane().setBackground(new Color(40,45,88));
        setSize(800,800);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        titel = new JLabel("Namen- Lernsystem", SwingConstants.CENTER);
        titel.setForeground(new Color(25,25,25));

        //Buttons
        start = new JButton("Lernen");
        credits = new JButton("Ersteller");
        klassenspiegel = new JButton("Klassenspiegel");
        leave = new JButton("Beenden");

        //Border
        EmptyBorder emptyBorder = new EmptyBorder(75,0,75,0);
        titel.setBorder(emptyBorder);

        //Setzen der Schriftart und Grösse der Buttons und des Titels
        Font buttonFont = new Font("Arial", Font.PLAIN, 40);
        titel.setFont(new Font("Arial", Font.BOLD, 70));
        start.setFont(buttonFont);
        klassenspiegel.setFont(buttonFont);
        credits.setFont(buttonFont);
        leave.setFont(buttonFont);

        //Setzten der Farbe der Buttons

        Color buttonFontColor = new Color(255,255,255);

        titel.setBackground(new Color(23, 27 ,64));
        titel.setForeground(buttonFontColor);
        start.setBackground(new Color(50,205,50));
        start.setForeground(buttonFontColor);
        klassenspiegel.setBackground(new Color(153, 50, 204));
        klassenspiegel.setForeground(buttonFontColor);
        credits.setBackground(new Color(237,243,37));
        credits.setForeground(buttonFontColor);
        leave.setBackground(new Color(246, 50,50));
        leave.setForeground(buttonFontColor);

        //Aligment für die Buttons
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        klassenspiegel.setAlignmentX(Component.CENTER_ALIGNMENT);
        credits.setAlignmentX(Component.CENTER_ALIGNMENT);
        leave.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Füllen des Buttonpanels mit den Buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
        buttonPanel.add(start);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 45)));
        buttonPanel.add(klassenspiegel);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 45)));
        buttonPanel.add(credits);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 45)));
        buttonPanel.add(leave);
        buttons = new JPanel();
        buttons.add(buttonPanel);

        buttonPanel.setBackground(new Color(25, 25, 75));
        buttons.setBackground(new Color(25, 25, 75));

        //Setzen des Layouts und hinzufügen der Komponenten
        getContentPane().setLayout(new BorderLayout(1, 1));
        getContentPane().add(buttons, BorderLayout.CENTER);
        getContentPane().add(titel, BorderLayout.NORTH);

        //ActionListener für das start Button
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                try {
                    NameLearning nameLearning = new NameLearning();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        //ActionListener für das klassenspiegel Button
        klassenspiegel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        credits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Credits credits = new Credits();
            }
        });

        leave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }



    public static void main(String[] args) {
        App main = new App();
    }
}
