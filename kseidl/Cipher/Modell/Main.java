package kseidl.Cipher.Modell;

import javax.swing.*;

/**
 * testet SubstitutionCipher
 * @author kseidl
 * @version 15-11-20
 */
public class Main {
    public static void main(String[] args) {
        SubstitutionCipher s ;
        String text = JOptionPane.showInputDialog("Text eingeben");
        String schluessel= "";
        do{
            schluessel = JOptionPane.showInputDialog("Schlüssel");
            s = new SubstitutionCipher(schluessel);

        }while (!schluessel.equals(s.getSecretAlphabet()));

        String vtext = s.encrypt(text);

        JOptionPane.showMessageDialog(null, vtext+"");
        JOptionPane.showMessageDialog(null, s.decrypt(vtext));

        ShiftCipher s2;
        String text2 = JOptionPane.showInputDialog("Text");
        int i = Integer.parseInt(JOptionPane.showInputDialog("Zahl"));
        s2 = new ShiftCipher(i);

        String vtext2 = s2.encrypt(text2);

        JOptionPane.showMessageDialog(null, vtext2+"");
        JOptionPane.showMessageDialog(null, s2.decrypt(vtext2));

    }
}
