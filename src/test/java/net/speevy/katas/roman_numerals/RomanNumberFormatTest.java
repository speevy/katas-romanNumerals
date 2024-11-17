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
