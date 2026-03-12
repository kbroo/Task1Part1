package org.task.service;

import org.task.entity.IntArray;
import org.task.exception.ArrayException;

public interface SortService {

    IntArray bubbleSort(IntArray array) throws ArrayException;
    IntArray selectionSort(IntArray array) throws ArrayException;

}
