package kseidl.Cipher;

public class SubstitutionCipher extends  MonoAlphabeticCipher{

    public SubstitutionCipher(String secretAlphabet){
        setSecretAlphabet(secretAlphabet);
    }

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
