import java.util.regex.Pattern;

public class SplitText {
    public static String bigText(String text) {
        StringBuilder outString = new StringBuilder();

        String[] words = text.split("[^a-zA-Z]+");

        for (String word : words) {
            if (!word.isEmpty()) {
                outString.append(word).append("\n");
            }
        }



//        String regex = "[a-zA-Z]+";
//        String regexpunctuation = "[^a-zA-Z0-9]";
//        text = text.replaceAll(regexpunctuation, " ");
    //  String[] words = text.split("\\s+");
//        for(int i = 0; i < words.length; i++) {
//            if (words[i].matches(regex)) {
//                outString.append(words[i]).append(System.lineSeparator());
//            }
//        }
        return outString.toString();
    }
}
