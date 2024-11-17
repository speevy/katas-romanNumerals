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
        return toAppendTo;
    }

    @Override
    public Number parse(String source, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }
}
