import java.util.HashMap;

public class Translator {
    // Declare object //
    HashMap<Integer, String> numericAlpha = new HashMap<>();

    // Declare Translator object constructor //
    public Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    // Method for translating number to alpha //
    public String translate(Integer number) {
        return numericAlpha.get(number);
    }
}
