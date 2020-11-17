package kseidl.Cipher.Modell;

/**
 * setzt Schluessel durch Wort
 * @author kseidl
 * @version 17-11-20
 */
public class KeywordCipher extends  MonoAlphabeticCipher{
    public KeywordCipher(String keyword){
        this.setKeyword(keyword);
    }

    /**
     * Wort wird genommen, kein Buchstabe darf 2 Mal enthalten sein,
     * an den anfang gesetzt und
     * alle buchstaben, die im Wort vorkommen, von ihrem ursprünglichen Platz entfernt
     *
     * @param keyword
     */
    public void setKeyword(String keyword){
        String standard = "abcdefghijklmnopqrstuvwxyzäöüß";
        keyword = keyword.toLowerCase();

        if(keyword.length()> 30){
            return;
        }
        String neu = keyword;
        for (int i = keyword.length(); i < 30; i++){
            if(keyword.indexOf(standard.charAt(i)) == -1){
                if(neu.indexOf(standard.charAt(i)) == -1){
                    neu+= standard.charAt(i);
                }
                else{
                    return;
                }
            }

        }
        super.setSecretAlphabet(neu);

    }
}
