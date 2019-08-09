package main.com.latam.fpoblete;

import java.util.TreeMap;

class RomanKeyValues {

    private static final String ONE_THOUSAND = "M";
    private static final String FIVE_HUNDRED = "D";
    private static final String ONE_HUNDRED = "C";
    private static final String FIFTY = "L";
    private static final String TEN = "X";
    private static final String FIVE = "V";
    private static final String ONE = "I";
    private static TreeMap<Integer, String> instance;

    private RomanKeyValues() {
    }

    static TreeMap<Integer, String> getInstance() {

        if (instance == null) {
            instance = new TreeMap<>();
            instance.put(1, RomanKeyValues.ONE);
            instance.put(5, RomanKeyValues.FIVE);
            instance.put(10, RomanKeyValues.TEN);
            instance.put(50, RomanKeyValues.FIFTY);
            instance.put(100, RomanKeyValues.ONE_HUNDRED);
            instance.put(500, RomanKeyValues.FIVE_HUNDRED);
            instance.put(1000, RomanKeyValues.ONE_THOUSAND);
        }

        return instance;

    }

}