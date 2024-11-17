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
        int actualNumber = (int) number;
        formatDecade(actualNumber/100, toAppendTo, new Decade('C', 'D', 'M'));
        actualNumber %= 100;
        formatDecade(actualNumber/10, toAppendTo, new Decade('X', 'L', 'C'));
        actualNumber %= 10;
        formatDecade(actualNumber, toAppendTo, new Decade('I', 'V', 'X'));
        return toAppendTo;
    }

    private static StringBuffer formatDecade(int number, StringBuffer toAppendTo, Decade units) {
        switch (number) {
            case 4 -> toAppendTo.append(units.one()).append(units.five());
            case 9 -> toAppendTo.append(units.one()).append(units.ten());
            case 0,1,2,3 -> toAppendTo.repeat(String.valueOf(units.one()), number);
            case 5,6,7,8 -> toAppendTo.append(units.five())
                    .repeat(String.valueOf(units.one()), number - 5);
            default -> throw new IllegalArgumentException
                    ("Decade numbers must be between 0 and 9 included. Received " + number);
        }
        return toAppendTo;
    }

    @Override
    public Number parse(String source, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    record Decade(char one, char five, char ten) {}
}
