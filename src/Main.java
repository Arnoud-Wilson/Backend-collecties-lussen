import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare variables //
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        boolean play = true;
        String invalid = "ongeldige invoer";

        // Declare objects //
        Translator translateNumToAlpha = new Translator(numeric, alphabetic);
        Scanner inputScanner = new Scanner(System.in);

        // Decision structure number translator //
        while (play) {
            System.out.println("Type 'x' om te stoppen / Type 'v' om te vertalen.");
            String input = inputScanner.nextLine();
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9.");
                int number = inputScanner.nextInt(); // Als je nu een letter invoert crashed hij. Hoe kun je dit oplossen?
                inputScanner.nextLine(); // Waarom deze extra nextLine?? Bij niet toevoegen crashed hij....
                if (number < 10) {
                    String result = translateNumToAlpha.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else System.out.println(invalid);
            }else System.out.println(invalid);
        }

        //TODO: Zie regel 24 en 25

    }
}
