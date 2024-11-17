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
        if (number == 4) {
            toAppendTo.append("IV");
            return toAppendTo;
        }
        if (number == 9) {
            toAppendTo.append("IX");
            return toAppendTo;
        }
        long iteration;
        if (number >= 5) {
            iteration = number - 5;
            toAppendTo.append('V');
        } else {
            iteration = number;
        }
        for (long l=0; l < iteration; l++) {
            toAppendTo.append('I');
        }
        return toAppendTo;
    }

    @Override
    public Number parse(String source, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }
}
