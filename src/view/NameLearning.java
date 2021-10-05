package view;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Container;


public class NameLearning {


    Play play = new Play();

    public NameLearning() throws IOException {
    }


    class Play extends JFrame implements ActionListener {


        private JFrame frame = new JFrame();
        private JTextField textField = new JTextField();
        private JTextArea textArea = new JTextArea();
        private JButton buttonA = new JButton();
        private JButton buttonB = new JButton();
        private JButton buttonC = new JButton();
        private JButton buttonD = new JButton();
        private JButton buttonE = new JButton();
        private JLabel answer_LableA = new JLabel();
        private JLabel answer_LableB = new JLabel();
        private JLabel answer_LableC = new JLabel();
        private JLabel answer_LableD = new JLabel();
        private JLabel picLabel = new JLabel();
        private JTextField number_right = new JTextField();
        private JTextField percentage = new JTextField();
        private JPanel buttons;
        private JPanel buttonPanel;


        public Play() throws IOException {

            File folder = new File("img/IM21a");
            File[] listOfFiles = folder.listFiles();
            String[] namen = new String[listOfFiles.length];

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {

                    //System.out.println("File " + listOfFiles[i].getName());
                } else if (listOfFiles[i].isDirectory()) {
                    String noLowerCase = listOfFiles[i].getName();
                    noLowerCase = noLowerCase.replaceAll("_", " ").toLowerCase();
                    String words[] = noLowerCase.split(" ", 3);
                    String name = words[0].substring(0, 1).toUpperCase() + words[0].substring(1) + " " + words[1].substring(0, 1).toUpperCase() + words[1].substring(1);
                    namen[i] = name;
                }
            }

            getContentPane().setBackground(new Color(40, 45, 88));
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(1000, 1000);
            getContentPane().setBackground(new Color(50, 50, 50));
            setLayout(null);
            setResizable(false);
            setTitle("Namen-Lernsystem");

            Font buttonFont = new Font("Arial", Font.BOLD, 30);
            textField.setBounds(0, 0, 1000, 50);
            textField.setBackground(new Color(25, 25, 25));
            textField.setForeground(new Color(50, 80, 50));
            textField.setFont(new Font("Arial", Font.BOLD, 30));
            textField.setBorder(BorderFactory.createBevelBorder(1));
            textField.setHorizontalAlignment(JTextField.CENTER);
            textField.setEditable(false);

            textArea.setBounds(0, 50, 1000, 50);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setBackground(new Color(25, 25, 25));
            textArea.setForeground(new Color(25, 255, 0));
            textArea.setFont(new Font("Arial", Font.BOLD, 25));
            textArea.setBorder(BorderFactory.createBevelBorder(1));
            textArea.setEditable(false);
            textArea.setText("Lernen");

            buttonA.setBounds(300, 425, 300, 100);
            buttonA.setFont(buttonFont);
            buttonA.setFocusable(false);
            //buttonA.addActionListener(this);
            buttonA.setText(namen[0]); //Placeholder

            buttonB.setBounds(300, 525, 300, 100);
            buttonB.setFont(buttonFont);
            buttonB.setFocusable(false);
            //buttonB.addActionListener(this);
            buttonB.setText(namen[1]); //Placeholder

            buttonC.setBounds(300, 625, 300, 100);
            buttonC.setFont(buttonFont);
            buttonC.setFocusable(false);
            //buttonC.addActionListener(this);
            buttonC.setText(namen[2]); //Placeholder

            buttonD.setBounds(300, 725, 300, 100);
            buttonD.setFont(buttonFont);
            buttonD.setFocusable(false);
            //buttonD.addActionListener(this);
            buttonD.setText(namen[3]); //Placeholder

            buttonE.setBounds(700, 800, 300, 100);
            buttonE.setFont(buttonFont);
            buttonE.setFocusable(false);
            //buttonE.addActionListener(this);
            buttonE.setText("Abbrechen");


            Font lableFont = new Font("Arial", Font.PLAIN, 35);
            answer_LableA.setBounds(125, 100, 500, 100);
            answer_LableA.setBackground(new Color(50, 50, 50));
            answer_LableA.setForeground(new Color(25, 255, 0));
            answer_LableA.setFont(lableFont);

            answer_LableB.setBounds(125, 200, 500, 100);
            answer_LableB.setBackground(new Color(50, 50, 50));
            answer_LableB.setForeground(new Color(25, 255, 0));
            answer_LableB.setFont(lableFont);

            answer_LableC.setBounds(125, 300, 500, 100);
            answer_LableC.setBackground(new Color(50, 50, 50));
            answer_LableC.setForeground(new Color(25, 255, 0));
            answer_LableC.setFont(lableFont);

            answer_LableD.setBounds(125, 400, 500, 100);
            answer_LableD.setBackground(new Color(50, 50, 50));
            answer_LableD.setForeground(new Color(25, 255, 0));
            answer_LableD.setFont(lableFont);


            Font correctFont = new Font("Arial", Font.BOLD, 50);
            number_right.setBounds(225, 225, 200, 100);
            number_right.setBackground(new Color(25, 25, 25));
            number_right.setForeground(new Color(25, 255, 0));
            number_right.setFont(correctFont);
            number_right.setBorder(BorderFactory.createBevelBorder(1));
            number_right.setHorizontalAlignment(JTextField.CENTER);
            number_right.setEditable(false);

            percentage.setBounds(225, 325, 200, 100);
            percentage.setBackground(new Color(25, 25, 25));
            percentage.setForeground(new Color(25, 255, 0));
            percentage.setFont(correctFont);
            percentage.setBorder(BorderFactory.createBevelBorder(1));
            percentage.setHorizontalAlignment(JTextField.CENTER);
            percentage.setEditable(false);

            BufferedImage studentImg = ImageIO.read(new File("img/IM21a/" +
                    "Jayden Eggenschwiler_77650_assignsubmission_file_/Jayden_Eggenschwiler.jfif")); //Placeholder
            picLabel.setBounds(300, 75, 350, 350);

            Image dimg = studentImg.getScaledInstance(picLabel.getWidth(), picLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            picLabel.setIcon(imageIcon);


            add(answer_LableA);
            add(answer_LableB);
            add(answer_LableC);
            add(answer_LableD);
            add(buttonA);
            add(buttonB);
            add(buttonC);
            add(buttonD);
            add(buttonE);
            add(textArea);
            add(textField);
            add(picLabel);
            setVisible(true);


        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String[] args) {


    }
}
