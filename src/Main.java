import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    while (true) {
        System.out.println("Введите текст: ");
        String text =new Scanner(System.in).nextLine();
        System.out.println(newLine(text));
    }
    }
    public static String newLine(String text) {
        text = text.trim();
        int i = 0;
        int begin = 0;
        int end = 0;
        String newtext = "";
        if (text.length() != 0) {
            while (text.indexOf(' ', begin) > -1) {
                end = text.indexOf(' ', begin);
                newtext += "(" + ++i + ") " + text.substring(begin, end) + " ";
                begin = end + 1;
            }
            newtext += "(" + ++i + ") " + text.substring(begin) + " ";
        }
            return newtext;
        }
}
