package fi.utu.tech.ooj.exercise1;

public class Tehtava3 {
    class Student {

    }

    /**
     * @.pre s != null && s.length() > 0 && times >= 0 
     * 
     * Rutiinin alkuehto määrittelee, että rutiinille annettava merkkijonotyyppinen
     * parametri "s" ei saa olla tyhjä ja sen pituus tulee olla suurempi kuin 0 ja 
     * rutiinille annettava kokonaislukutyyppinen muuttuja times tulee olla suurempi kuin 0
     * 
     * @.post EI MÄÄRITETTY
     */
    String repeatString(String s, int times) {
        return s.repeat(times);
    }

    /**
     * @.pre allStudents != null && FORALL(s : allStudents; s != null)
     * 
     * Rutiinin alkuehto määrittelee, että rutiinille parametrinä
     * annettava Student -tyyppinen taulukko ei saa olla tyhjä ja
     * mikään taulukon sisältämistä alkioista ei saa olla tyhjä 
     * 
     * @.post EI MÄÄRITETTY
     */
    public Student[] getActiveStudents(Student[] allStudents) {
        return null; // ei toteutettu
    }

    /**
     * @.pre EI MÄÄRITETTY
     * @.post s.length() <= RESULT.length() &&
     *        RESULT.length() <= 2*s.length() &&
     *        RESULT.substring(0, s.length()).equals(s) &&
     *        new StringBuilder(RESULT).reverse().toString().equals(RESULT)
     * 
     * Rutiinin loppuehto määrittelee, että rutiinille parametrina annettavan 
     * merkkijonon s pituus tulee olla lyhyempi tai yhtä pitkä kun rutiinin
     * palauttaman merkkijonon pituus. Lisäksi rutiinin palauttaman merkkijonon
     * pituus tulee olla lyhyempi tai yhtä suuri, kuin parametrinä saadun merkkijonon
     * s pituus kerrottuna kahdella. Lisäksi palautettavasta merkkijonosta muodostettava
     * "alimerkkijono", joka muodostuu palautettavan merkkijonon ensimmäisestä merkistä palautettavan
     * merkkijonon merkkiin jonka indeksinumero on sama kuin alkuperäisen pituus, tulee olla vastaava
     * kuin alkuperäinen parametrinä saatava merkkijono. Täten tarkistetaan, että alimerkkijono ja
     * parametrinä saatava merkkijono ovat samoja. Viimeisenä loppuehtona luodaan uusi Stringbuilder-olio,
     * jonka avulla tarkisteaan, että palautettava merkkijono on peilikuva palautettavasta merkkijonosta.
     */
    String generatePalindrome(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * @.pre students != null &&
     *       studentNumber != null &&
     *       studentNumber.length() > 0 &&
     *       FORALL(i : 0 <= i < studentNumber.length(); Character.isDigit(studentNumber.charAt(i)))
     * 
     * Rutiinin alkuehto määrittelee, että rutiinille parametrinä annettava Student -tyyppinen taulukko ei saa olla tyhjä.
     * Lisäksi toisena rutiinin parametrinä annettava studentNumber ei saa olla myöskään tyhjä.
     * Viimeisenä ehtona tarkistetaan, että parametrinä annettu merkkijonotyyppinen studentNumber koostuu vain numeroista,
     * eli sen jokainen merkki on numero.
     * 
     * @.post EI MÄÄRITETTY
     */
    Student findStudent(Student[] students, String studentNumber) {
        return null; // ei toteutettu
    }

    /**
     * @.pre (EXISTS(s : students;
     *          s.getStudentNumber ().equals(studentNumber)) ==> (RESULT != null)) &&
 *           (RESULT.getStudentNumber().equals(studentNumber) &&
     *          (!EXISTS(s : students; s.getStudentNumber().equals(studentNumber))) ==> (RESULT == null))
     * 
     * Rutiinin alkuehto määrittelee sille parametrinä annettua Student-tyyppistä taulukkoa, ja tarkastaa,
     * että yksittäinen Student-olion opiskelijanumero (studentNumber) siinä, vastaa rutiinille parametrinä
     * annettua opiskelijanumeroa,  lisäksi tällöin rutiinin palauttama arvo ei saa olla tyhjä.
     * 
     */
    Student findStudent2(Student[] students, String studentNumber) {
        return null; // ei toteutettu
    }
}
