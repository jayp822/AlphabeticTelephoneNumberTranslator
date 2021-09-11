import java.util.Scanner;

public class AlphabeticTelephoneNumberTranslator {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a 10 character phone number in XXX-XXX-XXXX format");
        String number = kb.nextLine();
        char[] chars = number.toCharArray();
        if (number.length() == 12) {
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i])) {
                    if (chars[i] == 'A' || chars[i] == 'B' || chars[i] == 'C') {
                        chars[i] = '2';
                    } else if (chars[i] == 'D' || chars[i] == 'E' || chars[i] == 'F') {
                        chars[i] = '3';
                    } else if (chars[i] == 'G' || chars[i] == 'H' || chars[i] == 'I') {
                        chars[i] = '4';
                    } else if (chars[i] == 'J' || chars[i] == 'K' || chars[i] == 'L') {
                        chars[i] = '5';
                    } else if (chars[i] == 'M' || chars[i] == 'N' || chars[i] == 'O') {
                        chars[i] = '6';
                    } else if (chars[i] == 'P' || chars[i] == 'Q' || chars[i] == 'R' || chars[i] == 'S') {
                        chars[i] = '7';
                    } else if (chars[i] == 'T' || chars[i] == 'U' || chars[i] == 'V') {
                        chars[i] = '8';
                    } else if (chars[i] == 'W' || chars[i] == 'X' || chars[i] == 'Y' || chars[i] == 'Z') {
                        chars[i] = '9';
                    }
                }
            }
            System.out.println(chars);
        } else {
            System.out.println("Please input your number in XXX-XXX-XXXX format");
        }

        kb.close();

    }

}