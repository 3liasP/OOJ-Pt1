package fi.utu.tech.ooj.exercise1;

public class Tehtava4 {
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