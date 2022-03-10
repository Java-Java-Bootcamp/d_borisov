package ru.playjim;

import java.util.regex.Pattern;

public class Main {

    private static Pattern createRegexPattern(String blackListNumbers) {
        String regexString = blackListNumbers.replace(',', '|');
        return Pattern.compile(regexString);
    }

    private static boolean isMsisdnValid(String msisdn) {
        if (msisdn == null) return false;
        return Pattern.compile("(70|77|55|99)[0-9]{7}").matcher(msisdn).matches();
    }

    public static void main(String[] args) {
        String[] msisdns = {"706688866", "706688811", "997689333", "778566213","89605352211","665554411"};
        Pattern blacklistPatterns = createRegexPattern("7066888,7790,7785");
        Pattern whitelistPatterns = createRegexPattern("705533,705540,997680809,997689333,706688866");
        for (String number : msisdns) {
            if (!isMsisdnValid(number)) {
                System.out.println("Номер " + number + " не валидный");
                continue;
            }
            if (blacklistPatterns.matcher(number).lookingAt()) {
                System.out.println("Номер " + number + " нельзя продовать.");
                continue;
            }
            if (whitelistPatterns.matcher(number).lookingAt()) {
                System.out.println("Номер " + number + " можно продовать.");
            }
            else System.out.println("Номер " + number + " можно продовать.");
        }
    }
}
