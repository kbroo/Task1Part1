package org.task.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.task.entity.IntArray;
import org.task.service.impl.SortServiceImpl;
import org.task.exception.ArrayException;

public class SortServiceTest {

    private final int[] DATA = {1, 8, 9, 67, 24};
    private final int[] VALID_DATA = {1, 8, 9, 24, 67};
    private final SortServiceImpl sortedArray = new SortServiceImpl();
    private IntArray unsortedArray;

    @BeforeEach
    void setUp() throws ArrayException {
        unsortedArray = new IntArray(DATA);
    }

    @Test
    void souldSortBubbleTest() throws ArrayException {
        unsortedArray = sortedArray.bubbleSort(unsortedArray);
        Assertions.assertArrayEquals(VALID_DATA, unsortedArray.getArray());
    }

    @Test
    void souldSortSelectionTest() throws ArrayException {
        unsortedArray = sortedArray.selectionSort(unsortedArray);
        Assertions.assertArrayEquals(VALID_DATA, unsortedArray.getArray());
    }

}
