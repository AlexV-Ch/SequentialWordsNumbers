import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneCleanerRegex {
    public static String checkingNumber(String number) {
        number = number.replaceAll("[^0-9]", "");

        if (number.length() == 11) {
            if (number.charAt(0) == '8') {
                number = "7" + number.substring(1);
            } else if (number.charAt(0) != '7') {
                return "Неверный формат номера";
            }
        } else if (number.length() == 10) {
            number = "7" + number;
        } else {
            return "Неверный формат номера";
        }
        Pattern pattern = Pattern.compile("^7\\d{10}$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return number;
        } else {
            return "Неверный формат номера";
        }



//        if(number.length() == 11 && (firstNumber == 7 || firstNumber == 8)) {
//            number = "7" + number.substring(1) + "- Номер верный";
//        } else if (number.length() == 10) {
//            number = "7" + number + "- Номер верный";
//        } else if (number.length() > 11 || number.length() < 10) {
//            number = " Неверный формат номера ";
//        } else if (number.length() == 11 && (firstNumber != 7 || firstNumber != 8)) {
//            number = " Неверный формат номера ";
//        } else {
//            number = " Что то не так";
//        }
//        return number;
    }
}
