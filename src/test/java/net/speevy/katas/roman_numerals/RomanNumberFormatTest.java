package net.speevy.katas.roman_numerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumberFormatTest {

    @ParameterizedTest
    @CsvSource({
            "1,'I'",
            "2,'II'",
            "3,'III'",
            "4,'IV'",
            "5,'V'",
            "6,'VI'",
            "7,'VII'",
            "8,'VIII'",
            "9,'IX'",
            "10,'X'",
            "11,'XI'",
            "14,'XIV'",
            "15,'XV'",
            "19,'XIX'",
            "20,'XX'",
            "30,'XXX'",
            "40,'XL'",
            "50,'L'",
            "60,'LX'",
            "70,'LXX'",
            "80,'LXXX'",
            "90,'XC'",
            "99,'XCIX'",
            "100,'C'",
            "101,'CI'",
            "104,'CIV'",
            "105,'CV'",
            "109,'CIX'",
            "110,'CX'",
            "111,'CXI'",
            "114,'CXIV'",
            "115,'CXV'",
            "119,'CXIX'",
            "140,'CXL'",
            "150,'CL'",
            "190,'CXC'",
            "199,'CXCIX'",
            "200,'CC'",
            "400,'CD'",
            "500,'D'",
            "600,'DC'",
            "900,'CM'",
            "990,'CMXC'",
            "999,'CMXCIX'",
            "1000,'M'",
            "1001,'MI'",
            "1009,'MIX'",
            "1010,'MX'",
            "1011,'MXI'",
            "1099,'MXCIX'",
            "1100,'MC'",
            "1999,'MCMXCIX'",
            "2000,'MM'",
            "3000,'MMM'",
            "3999,'MMMCMXCIX'",
    })
    void formatTest(int value, String roman) {
        // Given
        var formatter = new RomanNumberFormat();

        // When
        String result = formatter.format(value);

        // Then
        assertEquals(roman, result, "Roman number for %d should be %s".formatted(value, roman));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,-1, -10, -1000, 4000, 5000})
    void unexistingNumbersInRomanNotationShouldFail(int value) {
        // Given
        var formatter = new RomanNumberFormat();

        // When + Then
        assertThrows(IllegalArgumentException.class,
                () -> formatter.format(value));
    }
}
