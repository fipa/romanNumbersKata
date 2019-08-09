package test;

import main.com.latam.fpoblete.RomanNumbers;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RomanNumbersTest {

    private static HashMap<String, Integer> numbers;

    @BeforeClass
    public static void setup() {
        numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("II", 2);
        numbers.put("IV", 4);
        numbers.put("V", 5);
        numbers.put("VI", 6);
        numbers.put("IX", 9);
        numbers.put("X", 10);
        numbers.put("XI", 11);
        numbers.put("XIV", 14);
        numbers.put("XX", 20);
        numbers.put("XXIV", 24);
        numbers.put("XXVIII", 28);
        numbers.put("XXIX", 29);
        numbers.put("XL", 40);
        numbers.put("LXXXVIII", 88);
        numbers.put("XC", 90);
        numbers.put("XCIX", 99);
        numbers.put("C", 100);
        numbers.put("CX", 110);
        numbers.put("CLXXXVIII", 188);
        numbers.put("CXCIX", 199);
        numbers.put("CC", 200);
        numbers.put("MMDCCCXCVIII", 2898);

    }

    @Test
    public void runTests() {
        int decimal;
        for (Map.Entry<String, Integer> entry: numbers.entrySet()) {
            decimal = entry.getValue();
            String key = entry.getKey();
            assertEquals(key + "ShouldBe_" + decimal, decimal, RomanNumbers.convert(key));
        }

    }

    @Test(expected = NumberFormatException.class)
    public void shouldThowExceptionForAnEmptyNumber() throws Exception {
        RomanNumbers.convert("");
    }
}