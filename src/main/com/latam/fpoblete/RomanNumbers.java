package main.com.latam.fpoblete;

import java.util.TreeMap;

public class RomanNumbers {

    private RomanNumbers() {
    }

    public static int convert(String number) {

        final TreeMap<Integer, String> romanKeyValues = RomanKeyValues.getInstance();
        final Object[] decimalValues = romanKeyValues.keySet().toArray();

        for (int i = decimalValues.length - 1; i >= 0; i--) {
            final int decimalValue = (int) decimalValues[i];
            final String romanKey = romanKeyValues.get(decimalValue);

            if (number.contains(romanKey)) {
                return calculateResult(number, romanKey, decimalValue);
            }
        }

        throw new NumberFormatException();
    }

    private static int calculateResult(String number, String romanSymbol, int decimalKeyValue) {
        if (decimalKeyValue == 1) {
            return number.length();
        } else {
            String preffix = getPreffixFor(number, romanSymbol);
            int numberToSubstract = convertOrZero(preffix);

            String suffix = getSuffixFor(number, romanSymbol);
            int numberToAdd = convertOrZero(suffix);

            return decimalKeyValue - numberToSubstract + numberToAdd;
        }
    }

    private static int convertOrZero(String toConvert) {
        return "".equals(toConvert) ? 0 : convert(toConvert);
    }

    private static String getSuffixFor(String number, String romanSymbol) {
        return number.substring(number.indexOf(romanSymbol) + 1, number.length());
    }

    private static String getPreffixFor(String number, String romanSymbol) {
        return number.substring(0, number.indexOf(romanSymbol));
    }

}
