package net.speevy.katas.roman_numerals;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class RomanNumberFormat extends NumberFormat {
    @Override
    public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
        return formatDecade((int)number, toAppendTo);
    }

    private static StringBuffer formatDecade(int number, StringBuffer toAppendTo) {
        switch (number) {
            case 4 -> toAppendTo.append("IV");
            case 9 -> toAppendTo.append("IX");
            case 0,1,2,3 -> toAppendTo.repeat("I", number);
            case 5,6,7,8 -> toAppendTo.append('V').repeat("I", number - 5);
            default -> throw new IllegalArgumentException
                    ("Decade numbers must be between 0 and 9 included. Received " + number);
        }
        return toAppendTo;
    }

    @Override
    public Number parse(String source, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }
}
