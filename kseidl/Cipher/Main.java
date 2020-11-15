package kseidl.Cipher;

import javax.swing.*;

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
    }
}
