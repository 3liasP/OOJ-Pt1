package fi.utu.tech.ooj.exercise1;

import java.util.*;

public class Tehtava7 {

    // TODO: Toteuta tehtävän 7b poikkeuskäsittely tähän metodiin
    public static Map<String, Integer> processKeyValuePairsFromStringTaskB(String input) {
        Scanner scanner = new Scanner(input).useDelimiter("\\s+|=");
        Map<String, Integer> output = new HashMap<>();

        while (scanner.hasNext()) {
            String key = scanner.next();
            String tempValue = scanner.next();
            Integer value = Integer.valueOf(tempValue);
            output.put(key, value);
        }

        scanner.close();
        return output;
    }

    // TODO: Toteuta tehtävän 7c poikkeuskäsittely tämän metodin yhteyteen
    public static Map<String, Integer> processKeyValuePairsFromStringTaskC(String input) {
        Scanner scanner = new Scanner(input).useDelimiter("\\s+|=");
        Map<String, Integer> output = new HashMap<>();

        while (scanner.hasNext()) {
            String key = scanner.next();
            String tempValue = scanner.next();
            Integer value = Integer.valueOf(tempValue);
            output.put(key, value);
        }

        scanner.close();
        return output;
    }
}
