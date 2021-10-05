package view;

import javax.swing.*;
import java.awt.*;

/**
 * Erstellt einen Dialog um die Ersteller des Programmes anzugeben
 *
 * @author Devin Kutbay
 * @since 05.10.2021
 * @version 1.0
 */
public class Credits {
    /**
     * Konstruktor der einen Dialog erstellt,
     * mit einem Textfeld um die Namen der Ersteller des Memorys auszugeben
     */
    public Credits(){
        JDialog dialog = new JDialog();
        JTextArea text = new JTextArea("Made by:\n" +
                "Yannis Lee \n" +
                "Nils Iseli \n" +
                "Ivan Gotovcevic\n" +
                "Devin Kutbay \n");

        //Einstellungen am Dialogfenster
        dialog.setTitle("Made by");
        dialog.setSize(300,200);
        dialog.setModal(true);
        dialog.setLocationRelativeTo(null);

        text.setFont(new Font("Impact", Font.PLAIN, 20));

        dialog.add(text);

        dialog.setVisible(true);
    }
}
