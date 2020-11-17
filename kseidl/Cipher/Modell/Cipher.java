package kseidl.Cipher.Modell;

/**
 * Interface um zu codieren
 * @author kseidl
 * @version 14-11-20
 */
public interface Cipher {

    /**
     * um zu veschluesseln
     * @param text übernimmt text
     * @return den verschluesselten text
     */
    public String encrypt(String text);

    /**
     * um entschluesseln
     * @param text übernimmt text
     * @return gibt entschluesselten text zurueck
     */
    public String decrypt(String text);
}
