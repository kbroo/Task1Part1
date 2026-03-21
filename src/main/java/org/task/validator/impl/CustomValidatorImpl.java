package org.task.validator.impl;

import org.task.validator.CustomValidator;

public class CustomValidatorImpl implements CustomValidator {
    private static final String RUSSIAN_SYMBOLS = ".*[a-zA-Z].*";
    private static final String ENGLISH_SYMBOLS = ".*[а-яА-ЯёЁ].*";
    public static final String NUMBER_SYMBOLS = "\\d+";

    @Override
    public boolean dataOfIntsIsValid(String data) {
        return !data.matches(RUSSIAN_SYMBOLS) && !data.matches(ENGLISH_SYMBOLS);
    }

    @Override
    public boolean elementOfStingIsValid(String data) {
        return data.matches(NUMBER_SYMBOLS) && !data.matches(RUSSIAN_SYMBOLS) && !data.matches(ENGLISH_SYMBOLS);
    }
}