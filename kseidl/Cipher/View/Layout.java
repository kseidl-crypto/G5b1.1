package kseidl.Cipher.View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * zeigt Layout an
 * @author kseidl
 * @version 17-11-20
 */
public class Layout extends JPanel {
    private JTextField textfeld;
    private ButtonGroup check;
    private JRadioButton schluessel, shift, keyword, tc;

    public Layout(ActionListener ah){
        this.setLayout(new BorderLayout());

        this.textfeld = new JTextField();
        this.add(this.textfeld, BorderLayout.PAGE_START);

        this.check = new ButtonGroup();

        this.keyword = new JRadioButton("Schluesselwort");
        this.schluessel = new JRadioButton("eigener Schluessel", true);
        this.shift = new JRadioButton("ShiftCipher");
        this.tc = new JRadioButton("Transposition Cipher");

        this.check.add(this.schluessel);
        this.check.add(this.shift);
        this.check.add(this.keyword);
        this.check.add(this.tc);


        JPanel grid = new JPanel(new GridLayout(2,4, 10, 4));

        grid.add(this.schluessel);
        grid.add(this.shift);
        grid.add(this.keyword);
        grid.add(this.tc);

        this.add(grid, BorderLayout.PAGE_END);

        this.textfeld.addActionListener(ah);
        this.textfeld.setActionCommand("text");
        this.schluessel.addActionListener(ah);
        this.schluessel.setActionCommand("schluessel");
        this.shift.addActionListener(ah);
        this.shift.setActionCommand("shift");
        this.keyword.addActionListener(ah);
        this.keyword.setActionCommand("key");
        this.tc.addActionListener(ah);
        this.tc.setActionCommand("tc");



    }

    /**
     *
     * @return den Text aus Textfeld
     */
    public String getText() {
        return textfeld.getText();
    }

    /**
     *
     * @return ob shiftbutton selected ist
     */
    public boolean shiftSelected(){
        return shift.isSelected();
    }

    /**
     *
     * @return ob schluesselbutton selected ist
     */
    public boolean selectSelected(){
        return schluessel.isSelected();
    }

    /**
     *
     * @return ob Keyword selected ist
     */
    public boolean keySelected(){ return keyword.isSelected();}

    /**
     *
     * @return ob TranspositionCipher gedrückt ist
     */
    public boolean tcSelected(){ return tc.isSelected();}
}
