package kseidl.Cipher;

/**
 * erbt von MonoAlphabeticCipher
 * @author kseidl
 * @version 15-11-20
 */
public class SubstitutionCipher extends  MonoAlphabeticCipher{

    /**
     * setzt secretAlphabet
     * @param secretAlphabet übernimmt den Schluessel
     */
    public SubstitutionCipher(String secretAlphabet){
        setSecretAlphabet(secretAlphabet);
    }

    /**
     * ueberprueft den Schluessel, obs groß genug ist und kein Buchstabe doppelt vor kommt
     * setzt Schluessel in Supermethode
     * @param secretAlphabet übernimmt den Schluessel
     */
    public void setSecretAlphabet(String secretAlphabet){
        String standard = "abcdefghijklmnopqrstuvwxyzäöüß";
        String buchstaben ="";
        if(secretAlphabet.length() ==30){
            for(int i = 0; i < secretAlphabet.length(); i++){
                if(standard.indexOf(secretAlphabet.charAt(i)) != -1){
                    if(buchstaben.indexOf(secretAlphabet.charAt(i)) == -1){
                        buchstaben += secretAlphabet.charAt(i);
                    }
                    else{
                        return;
                    }
                }
                else{
                    return;
                }

            }

        }
        else{
            return;
        }
        super.setSecretAlphabet(secretAlphabet);
    }
}
