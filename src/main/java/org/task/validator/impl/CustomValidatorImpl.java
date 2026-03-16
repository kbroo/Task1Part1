package org.task.validator.impl;

import org.task.validator.CustomValidator;

public abstract class CustomValidatorImpl implements CustomValidator {
    private static final String SYMBOLS = "[\\p{L}\\p{M}]+";

    @Override
    public boolean dataOfIntsIsValid(String data) {
        return !data.contains(SYMBOLS);
    }
}