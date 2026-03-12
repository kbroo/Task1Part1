package org.task.factory.lmpl;

import org.task.entity.IntArray;
import org.task.factory.ArrayFactory;
import org.task.exception.ArrayException;

public class ArrayFactorylmpl implements ArrayFactory {

    @Override
    public IntArray createIntArray(int[] array, String name) throws ArrayException {

        return new IntArray(array, name);

    }

}