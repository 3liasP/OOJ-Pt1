package fi.utu.tech.ooj.exercise1;

class Numeroija {
    static int laskuri = 1;
    /**
     Tehtävä 4 B)
     Numeroija-luokka ja sen sisältämä funktio "numeroi" toimii oikein ja sen määrittelyn sen mukaisesti.
     Jokainen funktion instanssi jatkaa numerointia edellistä kirjanpidon rivinumerosta.
     */
    void numeroi(String[] rivit) {
        int uusiLaskuri = laskuri; // tämä puuttui alunperin tästä tiedostosta, mutta tämä rivi näkyy tehtävänannossa
        for (var rivi : rivit) {
            System.out.println(uusiLaskuri++ + " " + rivi); // alunperin tässä oli muuttujan "uusiLaskuri" tilanna muuttuja "Laskuri"
        }
        laskuri = uusiLaskuri; // tämä puuttui alunperin tästä tiedostosta, mutta tämä rivi näkyy tehtävänannossa
    }
}
public class Tehtava4 {
    /**
     Tehtävä 4 A)
     Funktio muokkaa parametrinä saatua taulukkoa eikä tee kopioo taulukosta, jota käyttäisi
     edellä olevien alkioiden summien tallentamiseen. Tämä on tyyppillin sivuvaiktus, koska
     funktion cumulativeSums jälkeen funktiolle parametriksi annettu taulukko mutatoituu
     pysyvästi. Funktio siis muokkaa samassa muistipaikassa olevaa taulukkoa, joka sille
     parametriksi annetaan.

     Tämän voisi mahdollisesti korjata tekemällä kopion parametrinä saatavasta taulukosta heti
     funktion alkuun ennen for-silmukkaa ja tallentaamaan sen uuteen muuttujaan. Tällöin jos
     funktiota käytetään uudestaan, kopio korvaantuu uudella parametriksi annetun taulukon
     kopiolla, eikä sivuvaiktuksia ilmene.
     */
    /**
     * Palauttaa taulukon, jonka kukin alkio sisältää ko. alkion ja kaikkien
     * sitä syötetaulukossa edeltävien alkioiden summan.
     *
     * Toisin sanoen tulostaulukon arvot ovat
     * [arr[0], arr[0] + arr[1], arr[0] + arr[1] + arr[2], ...]
     */
    public static int[] cumulativeSums(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}

