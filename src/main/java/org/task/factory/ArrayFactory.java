package org.task.factory;

import org.task.entity.IntArray;
import org.task.exception.ArrayException;

public interface ArrayFactory {

    IntArray createIntArray(int[] array, String name) throws ArrayException;

}