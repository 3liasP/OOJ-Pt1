package fi.utu.tech.ooj.exercise1;

public class Tehtava3 {
    class Student {

    }

    /**
     * @.pre s != null && s.length() > 0 && times >= 0
     * @.post EI MÄÄRITETTY
     */
    String repeatString(String s, int times) {
        return s.repeat(times);
    }

    /**
     * @.pre allStudents != null && FORALL(s : allStudents; s != null)
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
     */
    String generatePalindrome(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * @.pre students != null &&
     *       studentNumber != null &&
     *       studentNumber.length() > 0 &&
     *       FORALL(i : 0 <= i < studentNumber.length(); Character.isDigit(studentNumber.charAt(i)))
     * @.post EI MÄÄRITETTY
     */
    Student findStudent(Student[] students, String studentNumber) {
        return null; // ei toteutettu
    }

    /**
     * @.pre (EXISTS(s : students;
     *          s.getStudentNumber ().equals(studentNumber)) ==> (RESULT != null)) &&
 *           (RESULT.getStudentNumber().equals(studentNumber) &&
     *          (!EXISTS(s : students; s.getStudentNumber().equals(studentNumber))) ==> (RESULT == null))`
     */
    Student findStudent2(Student[] students, String studentNumber) {
        return null; // ei toteutettu
    }
}
