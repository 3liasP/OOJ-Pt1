package fi.utu.tech.ooj.exercise1;

public class Tehtava2 {
    // TODO: Tehtävä 2: määrittele tämä
    /**
     * Rutiini tarkistaa, onko ajanhetket 1 ja 2 päällekkäisiä
     * @.pre (t1Start >= 0 && t2Start >= 0 && t1End >= 0 && t2End >= 0) && (t1Start != null && t2Start != null && t1End != null && t2End != null)
     * @.post (RESULT == true || RESULT == false)
     */
    public static boolean areOverlapping(int t1Start, int t1End, int t2Start, int t2End) {
        if (t1Start <= t2Start && t2Start <= t1End) return true;
        if (t1Start <= t2End && t2End <= t1End) return true;
        if (t2Start <= t1Start && t1Start <= t2End) return true;
        if (t2Start <= t1End && t1End <= t2End) return true;
        return false;
    }
}