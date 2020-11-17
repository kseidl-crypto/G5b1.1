package kseidl.Cipher.Modell;

import javax.swing.*;

/**
 * testet SubstitutionCipher
 * @author kseidl
 * @version 15-11-20
 */
public class Main {
    public static void main(String[] args) {


        KeywordCipher s3;
        String t2 = JOptionPane.showInputDialog("Text eingeben");

        String t = JOptionPane.showInputDialog("Wort, dass keine doppelten Buchstaben hat eingeben");
        s3= new KeywordCipher(t);

         String vt = s3.encrypt(t2);
        JOptionPane.showMessageDialog(null, vt+"");
        JOptionPane.showMessageDialog(null, s3.decrypt(vt));

    }
}
