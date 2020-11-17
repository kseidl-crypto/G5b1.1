package kseidl.Cipher.View;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(Layout p) {
        this.setTitle("Katja Seidl 3BHIT");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(p);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }
}
