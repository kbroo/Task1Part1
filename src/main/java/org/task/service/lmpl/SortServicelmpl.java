package org.task.service.lmpl;

import org.task.entity.IntArray;
import org.task.service.SortService;
import org.task.exception.ArrayException;

public class SortServicelmpl implements SortService {

    @Override
    public IntArray bubbleSort(IntArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Массив не может быть null.");
        }

        int buffer;
        for (int j = 0; j < array.getLength()-1; j++) {
            for(int i = array.getLength()-1; i >= 0; i++) {
                if(array.getElement(i) > array.getElement(i-1)) {
                    buffer = array.getElement(i);
                    array.setElement(i, array.getElement(i-1));
                    array.setElement(i-1, array.getElement(buffer));
                }
            }
        }

        return array;
    }

    @Override
    public IntArray selectionSort(IntArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Массив не может быть null.");
        }

        int buffer;
        for (int i = 0; i < array.getLength()-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.getLength(); j++) {
                if (array.getElement(j) < array.getElement(minIndex)) {
                    minIndex = j;
                }
            }
            buffer = array.getElement(minIndex);
            array.setElement(minIndex, array.getElement(i));
            array.setElement(i, array.getElement(buffer));
        }

        return array;
    }

}
