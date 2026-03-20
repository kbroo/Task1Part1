package org.task.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.task.entity.IntArray;
import org.task.exception.ArrayException;
import org.task.service.impl.MathOperationsServiceImpl;

public class MathOperationsServiceTest {

    private final int[] DATA = {1, 7, 8, 9, 3, 6};
    private final MathOperationsService mathOperation = new MathOperationsServiceImpl();
    private IntArray array;

    @BeforeEach
    void setUp() throws ArrayException {
        array = new IntArray(DATA);
    }

    @Test
    void shouldReturnMaxElementTest() throws ArrayException {
        int maxElement = mathOperation.findMaxElement(array);
        int MAX_ELEMENT = 9;
        Assertions.assertEquals(MAX_ELEMENT, maxElement);
    }

    @Test
    void shouldReturnMinElementTest() throws ArrayException {
        int minElement = mathOperation.findMinElement(array);
        int MIN_ELEMENT = 1;
        Assertions.assertEquals(MIN_ELEMENT, minElement);
    }

    @Test
    void shouldReturnSumOfElementsTest() throws ArrayException {
        int sumOfElements = mathOperation.findSumOfElements(array);
        int SUM_OF_ELEMENTS = 34;
        Assertions.assertEquals(SUM_OF_ELEMENTS, sumOfElements);
    }

}
