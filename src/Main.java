import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator hoi = new Translator(numeric, alphabetic);

        System.out.println(hoi);

        System.out.println(hoi.translate(7));

    }

}
