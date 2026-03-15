package org.task.validator.impl;

import org.task.validator.CustomValidator;

public abstract class JavaValidatorImpl implements CustomValidator {
    private static final String SYMBOLS = "[\\p{L}\\p{M}]+";
    public static final String CORRECT_NUMBER = "^[+-]?[1-9]\\d*$";

    @Override
    public boolean dataOfIntsIsValid(String data) {
        return !data.contains(SYMBOLS);
    }

}
