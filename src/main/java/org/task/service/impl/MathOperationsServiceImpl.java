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
        logger.info("Attempt to find the maximum element of an array.");
        if(array == null) {
            logger.error("Error: Array cannot be null. (findMaxElement)");
            throw new ArrayException("Array cannot be null. (findMaxElement)");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            logger.error("Error: Empty array passed. (findMaxElement)");
            throw new ArrayException("Cannot find maximum value in empty array. (findMaxElement)");
        }

        int maxElelement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] > maxElelement) {
                maxElelement = intArray[i];
            }
        }

        logger.info("Successfully finding the maximum element of an array.");
        return maxElelement;
    }

    @Override
    public int findMinElement(IntArray array) throws ArrayException {
        logger.info("Attempt to find the minimum element of an array.");
        if(array == null) {
            logger.error("Error: Array cannot be null. (findMinElement)");
            throw new ArrayException("Array cannot be null. (findMinElement)");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            logger.error("Error: Empty array passed. (findMinElement)");
            throw new ArrayException("Cannot find minimum value in empty array. (findMinElement)");
        }

        int minElement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] < minElement) {
                minElement = intArray[i];
            }
        }

        logger.info("Successfully finding the minimum element of an array.");
        return minElement;
    }

    @Override
    public int findSumOfElements(IntArray array) throws ArrayException {
        logger.info("Attempt to find the sum of element of an array.");
        if(array == null) {
            logger.error("Error: Array cannot be null. (findSunOfElements)");
            throw new ArrayException("Error: Array cannot be null. (findSunOfElements)");
        }
        int[] intArray = array.getArray();
        if(intArray.length == 0) {
            logger.error("\"Error: Empty array passed. (findSumOFElements)");
            throw new ArrayException("Cannot find sum of elements in empty array. (findSumOfElements)");
        }

        int sumOfElements = 0;

        for(int i = 0; i < intArray.length; i++) {
            sumOfElements += intArray[i];
        }

        logger.info("Successfully finding the sum of elements in array.");
        return sumOfElements;

    }

}
