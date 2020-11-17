package kseidl.Cipher.Controller;

import kseidl.Cipher.Modell.ShiftCipher;
import kseidl.Cipher.Modell.SubstitutionCipher;
import kseidl.Cipher.View.Frame;
import kseidl.Cipher.View.Layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Layout layout;
    private Frame frame;

    public static void main(String[]args) {
        new Controller();
    }

    public Controller() {
        this.layout = new Layout(new ActionHandler());
        this.frame = new Frame(this.layout);
    }
    private class ActionHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();

            if(s.equals("text")){
                String text = layout.getText();
                if(layout.shiftSelected()){
                    SubstitutionCipher s1 ;
                    String schluessel= JOptionPane.showInputDialog("Bitte Zahl eingeben");
                    s1 = new SubstitutionCipher(schluessel);

                    String vtext = s1.encrypt(text);

                    JOptionPane.showMessageDialog(null, vtext+"");
                    JOptionPane.showMessageDialog(null, s1.decrypt(vtext));
                }
                else if(layout.selectSelected()){
                    ShiftCipher s2;
                    int i = Integer.parseInt(JOptionPane.showInputDialog("bitte Schluessel eingeben"));
                    s2 = new ShiftCipher(i);

                    String vtext2 = s2.encrypt(text);

                    JOptionPane.showMessageDialog(null, vtext2+"");
                    JOptionPane.showMessageDialog(null, s2.decrypt(vtext2));
                }


            }
        }

    }
}
