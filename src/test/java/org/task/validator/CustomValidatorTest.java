package org.task.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.task.validator.impl.CustomValidatorImpl;

public class CustomValidatorTest {
    private static final CustomValidatorImpl customValidator = new CustomValidatorImpl();

    @Test
    void shouldReturnTrueFromValidString() {
        String CORRECT_STRING = "1; 6; 8; 9; 3; 63";
        boolean actualValue = customValidator.dataOfIntsIsValid(CORRECT_STRING);
        Assertions.assertTrue(actualValue);
    }

    @Test
    void shouldReturnFalseFromInvalidString() {
        String UNCORRECT_STRING = "1a; 5; 3; fdg";
        boolean actualValues = customValidator.dataOfIntsIsValid(UNCORRECT_STRING);
        Assertions.assertFalse(actualValues);
    }

    @Test
    void shouldReturnTrueFromValidElement() {
        String element = "23";
        boolean actualValue = customValidator.elementOfStingIsValid(element);
        Assertions.assertTrue(actualValue);
    }

    @Test
    void shouldReturnFalseFromInvalidElement() {
        String element = "2asd";
        boolean actualValue = customValidator.elementOfStingIsValid(element);
        Assertions.assertFalse(actualValue);
    }
}
