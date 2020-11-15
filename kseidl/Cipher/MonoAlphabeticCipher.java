package kseidl.Cipher;

/**
 * Implements Cipher um Text zu entschluesseln un verschluesseln
 * @author kseidl
 * @version 14-11-20
 */
public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet;

    /**
     * Konstruktor für Monoalphabetic
     */
    public MonoAlphabeticCipher(){
        this.secretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
    }

    /**
     * getter-Methode für Secretalphabet
     * @return das secret Alphabet
     */
    public String getSecretAlphabet(){
        return this.secretAlphabet;
    }

    /**
     * setter für SecretALphabet
     * @param secretAlphabet übernimmt den Schluessel
     */
    protected void setSecretAlphabet(String secretAlphabet){
            this.secretAlphabet = secretAlphabet;

    }

    /**
     * verschlüsselt Text
     * @param text übernimmt text z7um verschluesseln
     * @return den verschluesselten Text
     */
    public String encrypt(String text){
        String standard = "abcdefghijklmnopqrstuvwxyzäöüß";
        String ergebnis ="";
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++){
            if(standard.indexOf(text.charAt(i)) != -1){
                ergebnis += this.secretAlphabet.charAt(standard.indexOf(text.charAt(i)));
            }
            else{
                ergebnis += text.charAt(i);
            }

        }
        return ergebnis;
    }

    /**
     * entschluesselt Text
     * @param text übernimmt Text
     * @return den fertigen Text
     */
    public String decrypt(String text){
        String standard = "abcdefghijklmnopqrstuvwxyzäöüß";
        String ergebnis ="";
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++){
            if(secretAlphabet.indexOf(text.charAt(i)) != -1) {
                ergebnis += standard.charAt(this.secretAlphabet.indexOf(text.charAt(i)));
            }
            else{
                ergebnis += text.charAt(i);
            }
        }
        return ergebnis;
    }
}
