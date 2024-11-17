package net.speevy.katas.roman_numerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    })
    void formatTest(int value, String roman) {
        // Given
        var formatter = new RomanNumberFormat();

        // When
        String result = formatter.format(value);

        // Then
        assertEquals(roman, result, "Roman number for %d should be %s".formatted(value, roman));
    }
}
