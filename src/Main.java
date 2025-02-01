import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    while (true) {
        System.out.println("Введите текст: ");
        String text =new Scanner(System.in).nextLine();
        //System.out.println(sequentialWordsNumbers(text));
        //System.out.println(SplitText.bigText(text).trim());
        System.out.println(PhoneCleanerRegex.checkingNumber(text));
    }
    }
    public static String sequentialWordsNumbers(String text) {
        text = text.trim();
        int i = 0;
        int begin = 0;
        int end = 0;
        //String newtext = "";
        StringBuilder newtext = new StringBuilder();
        if (text.length() != 0) {
            while ((end = text.indexOf(' ', begin)) != -1) {
              //  end = text.indexOf(' ', begin);
              //  newtext.append("(" + ++i + ") " + text.substring(begin, end) + " ");
                newtext.append("(").append(++i).append(") ")
                        .append(text.substring(begin, end)).append(" ");

                begin = end + 1;
            }
            newtext.append("(").append(++i).append(") ")
                    .append(text.substring(begin)).append(" ");
        }
            return newtext.toString();
        }
}
