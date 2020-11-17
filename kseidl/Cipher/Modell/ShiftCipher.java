package kseidl.Cipher.Modell;

/**
 * Verschluesselung durch Caesercodierung
 * @author  kseidl
 * @version 16-11-20
 */
public class ShiftCipher extends  MonoAlphabeticCipher{

    public ShiftCipher(int value){
        setShiftValue(value);
    }

    public  void setShiftValue(int value){
        String standard = "abcdefghijklmnopqrstuvwxyzäöüß";
        String neu = "";
        String teil1 = "";
        if(value > 30){
            return;
        }
        int index =standard.indexOf(standard.charAt(value));
        neu += standard.split(""+standard.charAt(index))[1]+ standard.split(""+standard.charAt(index+1))[0];
        super.setSecretAlphabet(neu);
    }
}
