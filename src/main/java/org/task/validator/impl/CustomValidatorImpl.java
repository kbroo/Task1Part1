package org.task.validator.impl;

import org.task.validator.CustomValidator;

public class CustomValidatorImpl implements CustomValidator {
    private static final String RUSSIAN_SYMBOLS = ".*[a-zA-Z].*";
    private static final String ENGLISH_SYMBOLS = ".*[а-яА-ЯёЁ].*";

    @Override
    public boolean dataOfIntsIsValid(String data) {
        if(!data.matches(RUSSIAN_SYMBOLS) && !data.matches(ENGLISH_SYMBOLS)) {
            return true;
        }
        return false;
    }
}