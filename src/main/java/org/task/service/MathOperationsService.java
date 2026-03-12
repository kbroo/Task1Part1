package org.task.service;

import org.task.entity.IntArray;
import org.task.exception.ArrayException;

public interface MathOperationsService {

    int findMaxElement(IntArray array) throws ArrayException;
    int findMinElement(IntArray array) throws ArrayException;
    int findSumOfElements(IntArray array) throws ArrayException;

}
