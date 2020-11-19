package kseidl.Cipher.Modell;

import javax.swing.*;

/**
 * testet SubstitutionCipher
 * @author kseidl
 * @version 15-11-20
 */
public class Main {
    public static void main(String[] args) {
       TranspositionCipher t;
        String text = JOptionPane.showInputDialog("Text eingeben");
        int i = Integer.parseInt(JOptionPane.showInputDialog("Zahl"));
        t = new TranspositionCipher(i);
        System.out.println(t.encrypt(text));
        System.out.println(t.decrypt(text));

    }
}
