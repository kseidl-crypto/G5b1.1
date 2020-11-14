package kseidl;

/**
 * Implements Cipher um Text zu entschluesseln un verschluesseln
 * @author kseidl
 * @version 14-11-20
 */
public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet;

    public MonoAlphabeticCipher(){
        this.secretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
    }

    public String getSecretAlphabet(){
        return this.secretAlphabet;
    }

    protected void setSecretAlphabet(String secretAlphabet){
            this.secretAlphabet = secretAlphabet;

    }

    public String encrypt(String text){
        String standard = "abcdefghijklmnopqrstuvwxyzäöüß";
        String ergebnis ="";
        for(int i = 0; i < text.length(); i++){
            ergebnis += this.secretAlphabet.charAt(standard.indexOf(text.charAt(i)));
        }
        return ergebnis;
    }

    public String decrypt(String text){
        String standard = "abcdefghijklmnopqrstuvwxyzäöüß";
        String ergebnis ="";
        for(int i = 0; i < text.length(); i++){
            ergebnis += standard.charAt(this.secretAlphabet.indexOf(text.charAt(i)));
        }
        return ergebnis;
    }
}
