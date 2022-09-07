package fi.utu.tech.ooj.exercise1;

public class Main {
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // TODO: Tehtävä 7: käsittele seuraavat tapaukset oikein
        // Tehtava7.processKeyValuePairsFromStringTaskB("pituus=paljon leveys=vähän massa=eiole");
        // Tehtava7.processKeyValuePairsFromStringTaskC("eiTässäOleMitäänPareja");

        Numeroija num1 = new Numeroija();
        Numeroija num2 = new Numeroija();
        num1.numeroi(new String[]{"moi", "hei", "päivää"});
        num2.numeroi(new String[]{"kyllä", "ei","ehkä"});

        System.out.println(Tehtava6.capitalize("foo bar"));
        System.out.println(Tehtava6.capitalize2("foo bar"));
    }


}
 class Numeroija {
    static int laskuri = 1;

    void numeroi(String[] rivit) {
        for (var rivi : rivit) System.out.println(laskuri++ + " " + rivi);
    }
}