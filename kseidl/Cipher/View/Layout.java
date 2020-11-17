package kseidl.Cipher.View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class Layout extends JPanel {
    private JTextField textfeld;
    private ButtonGroup check;
    private JRadioButton schluessel, shift;

    public Layout(ActionListener ah){
        this.setLayout(new BorderLayout());

        this.textfeld = new JTextField();
        this.add(this.textfeld, BorderLayout.PAGE_START);

        this.check = new ButtonGroup();

        this.schluessel = new JRadioButton("eigener Schluessel", true);
        this.shift = new JRadioButton("ShiftCipher");

        this.check.add(this.schluessel);
        this.check.add(this.shift);


        JPanel grid = new JPanel(new GridLayout(2,4, 10, 4));

        grid.add(this.schluessel);
        grid.add(this.shift);

        this.add(grid, BorderLayout.PAGE_END);

        this.textfeld.addActionListener(ah);
        this.textfeld.setActionCommand("text");
        this.schluessel.addActionListener(ah);
        this.schluessel.setActionCommand("schluessel");
        this.shift.addActionListener(ah);
        this.shift.setActionCommand("shift");



    }
    public String getText() {
        return textfeld.getText();
    }

    public boolean shiftSelected(){
        return shift.isSelected();
    }
    public boolean selectSelected(){
        return schluessel.isSelected();
    }
}
