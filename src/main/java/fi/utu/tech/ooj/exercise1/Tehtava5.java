package fi.utu.tech.ooj.exercise1;

public class Tehtava5 {
    /**
     * @.pre EI MÄÄRITETTY
     * @.post OSA-A && OSA-B && OSA-C && OSA-D (osat listattu tehtävänannossa)
     */
    
    /**
     *  Rutiinin tarkoitus on muodostaa annetun taulukon pohjalta uusi taulukko, joka sisältää
        kaikki alkuperäisen taulukan sisältämät arvot ilman duplikaatteja.

     *  A. FORALL(i : 0 <= i < RESULT.length; !EXISTS(j : 0 <= j < RESULT.length; RESULT[i] == RESULT[j]))
        B. FORALL(i : 0 <= i < RESULT.length; !EXISTS(j : 0 <= j < RESULT.length; i != j && RESULT[i] == RESULT[j]))
        C. FORALL(x : arr; EXISTS(y : RESULT; x == y))
        D. FORALL(x : RESULT; EXISTS(y : arr; x == y))

    VASTAUS:


       I J K L M
    A  x   
    B  x   x x 
    C      x x x
    D   x  x   x

     */
    public int[] withoutDuplicates(int[] arr) {
        return null; // ei toteutettu
    }
}


