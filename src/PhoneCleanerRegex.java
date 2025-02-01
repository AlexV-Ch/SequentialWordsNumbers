public class PhoneCleanerRegex {
    public static String checkingNumber(String number) {
        String regex = "[^0-9]";
        number = number.replaceAll(regex, "");
        int firstNumber = Integer.parseInt(number.substring(0, 1));

        if(number.length() == 11 && (firstNumber == 7 || firstNumber == 8)) {
            number = "7" + number.substring(1) + "- Номер верный";
        } else if (number.length() == 10) {
            number = "7" + number + "- Номер верный";
        } else if (number.length() > 11 || number.length() < 10) {
            number = " Неверный формат номера ";
        } else if (number.length() == 11 && (firstNumber != 7 || firstNumber != 8)) {
            number = " Неверный формат номера ";
        } else {
            number = " Что то не так";
        }
        return number;
    }
}
