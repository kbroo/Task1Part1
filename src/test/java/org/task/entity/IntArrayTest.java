package org.task.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.task.exception.ArrayException;

import static org.junit.jupiter.api.Assertions.*;

public class IntArrayTest {

    @Test
    void shouldCreateArrayWithValidDataTest() throws ArrayException {
        int[] DATA = {1, 5, 7, 8};
        int SIZE = 4;
        IntArray array = new IntArray(DATA);
        int actualSize = array.getLength();
        Assertions.assertAll("Проверка массива: ",
                () -> assertArrayEquals(DATA, array.getArray()),
                () -> assertEquals(SIZE, actualSize));
    }

    @Test
    void shouldReturnExceptionDataTest() throws ArrayException {
        int[] DATA = null;
        Assertions.assertThrows(ArrayException.class, () -> new IntArray(DATA));
    }

    @Test
    void shouldGetElementTest() throws ArrayException {
        int[] DATA = {1, 5, 7, 8};
        IntArray array = new IntArray(DATA);
        int el = array.getElement(2);
        assertEquals(7, el);
    }

    @Test
    void shouldReturnGetElementExceptionDataTest() throws ArrayException {
        int[] DATA = {1, 5, 7, 8};
        IntArray array = new IntArray(DATA);
        Assertions.assertThrows(ArrayException.class, () -> array.getElement(10));
    }

    @Test
    void shouldSetElementTest() throws ArrayException {
        int[] DATA = {1, 5, 7, 8};
        IntArray array = new IntArray(DATA);
        array.setElement(2, 99);
        assertEquals(99, array.getElement(2));
    }

    @Test
    void shouldReturnSetElementExceptionDataTest() throws ArrayException {
        int[] DATA = {1, 5, 7, 8};
        IntArray array = new IntArray(DATA);
        Assertions.assertThrows(ArrayException.class, () -> array.setElement(10, 44));
    }

}
