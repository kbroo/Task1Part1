package org.task.service.lmpl;

import org.task.entity.IntArray;
import org.task.service.MathOperationsService;
import org.task.exception.ArrayException;

public class MathOperationsServicelmpl implements MathOperationsService {

    @Override
    public int findMaxElement(IntArray array) throws ArrayException {

        if(array == null) {
            throw new ArrayException("Массив не может быть null.");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            throw new ArrayException("Нельзя найти максимальное значение в пустом массиве.");
        }

        int maxElelement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] > maxElelement) {
                maxElelement = intArray[i];
            }
        }

        return maxElelement;
    }

    @Override
    public int findMinElement(IntArray array) throws ArrayException {

        if(array == null) {
            throw new ArrayException("Массив не может быть null.");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            throw new ArrayException("Нельзя найти минимальное значение в пустом массиве.");
        }

        int minElement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] < minElement) {
                minElement = intArray[i];
            }
        }

        return minElement;
    }

    @Override
    public int findSumOfElements(IntArray array) throws ArrayException {

        if(array == null) {
            throw new ArrayException("Массив не может быть null.");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            throw new ArrayException("Нельзя найти сумму элементов в пустом массиве.");
        }

        int sumOfElements = 0;

        for(int i = 0; i < intArray.length; i++) {
            sumOfElements += intArray[i];
        }

        return sumOfElements;

    }

}
