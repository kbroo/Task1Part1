package org.task.service.impl;

import org.task.entity.IntArray;
import org.task.service.MathOperationsService;
import org.task.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MathOperationsServiceImpl implements MathOperationsService {

    public static final Logger logger = LogManager.getLogger(MathOperationsServiceImpl.class);

    @Override
    public int findMaxElement(IntArray array) throws ArrayException {
        logger.info("Попытка нахождения максимального элемента массива.");
        if(array == null) {
            logger.error("Ошибка: Массив не может быть null.");
            throw new ArrayException("Массив не может быть null.");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            logger.error("Ошибка: Передан пустой массив.");
            throw new ArrayException("Нельзя найти максимальное значение в пустом массиве.");
        }

        int maxElelement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] > maxElelement) {
                maxElelement = intArray[i];
            }
        }

        logger.info("Успешное нахождение максимального элемента массива.");
        return maxElelement;
    }

    @Override
    public int findMinElement(IntArray array) throws ArrayException {
        logger.info("Попытка нахождения минимального элемента массива.");
        if(array == null) {
            logger.error("Ошибка: Массив не может быть null.");
            throw new ArrayException("Массив не может быть null.");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            logger.error("Ошибка: Передан пустой массив.");
            throw new ArrayException("Нельзя найти минимальное значение в пустом массиве.");
        }

        int minElement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] < minElement) {
                minElement = intArray[i];
            }
        }

        logger.info("Успешное нахождение минимального элемента массива.");
        return minElement;
    }

    @Override
    public int findSumOfElements(IntArray array) throws ArrayException {
        logger.info("Попытка нахождения суммы элементов массива.");
        if(array == null) {
            logger.error("Ошибка: Массив не может быть null.");
            throw new ArrayException("Массив не может быть null.");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            logger.error("Ошибка: Передан пустой массив.");
            throw new ArrayException("Нельзя найти сумму элементов в пустом массиве.");
        }

        int sumOfElements = 0;

        for(int i = 0; i < intArray.length; i++) {
            sumOfElements += intArray[i];
        }

        logger.info("Успешное нахождение суммы элементов массива.");
        return sumOfElements;

    }

}
