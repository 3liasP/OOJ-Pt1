package fi.utu.tech.ooj.exercise1;

import net.jqwik.api.*;

public class Tehtava6ATests {
    // provide small integers
    @Provide
    Arbitrary<Integer> smallIntegers() {
        return Arbitraries.integers().between(-9999,9999);
    }

    // provide arrays of small integers
    @Provide
    Arbitrary<int[]> smallIntegerArrays() {
        return Arbitraries.integers().between(-9999,9999).array(int[].class);
    }

    @Property
    boolean smallIntegersAreSmall(@ForAll("smallIntegers") int i) {
        return Math.abs(i) < 10000;
    }

    @Property
    boolean smallIntegersAreSmall(@ForAll("smallIntegerArrays") int[] is) {
        for(int i: is)
            if (Math.abs(i) >= 10000) return false;

        return true;
    }

    @Property
    boolean lengthIsSame(@ForAll int[] t) {
        return t.length == Tehtava6.sqr(t).length;
    }

    /*
    @Property // hmmmm tän toiminnallisuus, ominaisuustesti???
    boolean areBiggerThanZero(@ForAll int[] t) {
        int[] RESULT = Tehtava6.sqr(t);
        for(int x : RESULT)
            if (x == 0){
                return true;
            } else if (x < 0) {
                return false;
            }
        return true;
    }
    */


    // TODO: Tehtävä 6a: Kirjoita tähän pyydetyt ominaisuustestit

    // TODO: Tehtävä 6a: Vaihtoehtoisesti, kirjoita tähän 5 kpl ominaisuutta testaavaa yksikkötestiä
}
