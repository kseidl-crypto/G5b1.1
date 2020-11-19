package kseidl.Cipher.Modell;

/**
 *
 */
public class TranspositionCipher implements Cipher{
    private int transpositionLevel;

    public TranspositionCipher(int transpositionLevel){
        if(transpositionLevel <=0){
            return;
        }
        this.transpositionLevel = transpositionLevel;
    }
    public void setTranspositionLevel(int transpositionLevel){
        if(transpositionLevel <= 0){
            return;
        }
        this.transpositionLevel = transpositionLevel;
    }
    public String encrypt(String text) {
        String[] s = new String[transpositionLevel];

        for(int i = 0; i < transpositionLevel; i++){
            s[i]= "";
        }
        s[0] = ""+text.charAt(0);
        for(int i = 1; i<text.length(); i++){
                s[(int)i%transpositionLevel] +=""+text.charAt(i);
        }
        String neu = "";
        for(int i = 0; i < s.length; i++){
            neu += s[i]+"\n";
        }
        return neu;

    }


    public String decrypt(String text) {
        String[] s = text.split("\n");
        String neu = "";
        for( int i = 0; i < s[0].length(); i++){
            for(int j =0; j < s.length; j++ ){
                if(i < s[j].length()){
                    neu += s[j].charAt(i);
                }

            }
        }

        return neu;
    }
}
