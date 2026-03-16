package org.task.service.impl;

import org.task.entity.IntArray;
import org.task.service.SortService;
import org.task.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortServiceImpl implements SortService {

    public static final Logger logger = LogManager.getLogger(SortServiceImpl.class);

    @Override
    public IntArray bubbleSort(IntArray array) throws ArrayException {
        logger.info("Trying to bubble sort an array");
        if (array == null) {
            logger.error("Error: Array cannot be null. (bubbleSort)");
            throw new ArrayException("Error: Array cannot be null. (bubbleSort)");
        }

        int buffer;
        for (int j = 0; j < array.getLength()-1; j++) {
            for(int i = array.getLength()-1; i > 0; i--) {
                if(array.getElement(i) < array.getElement(i-1)) {
                    buffer = array.getElement(i);
                    array.setElement(i, array.getElement(i-1));
                    array.setElement(i-1, buffer);
                }
            }
        }
        logger.info("The array was successfully bubble sorted.");

        return array;
    }

    @Override
    public IntArray selectionSort(IntArray array) throws ArrayException {
        logger.info("Trying to sort an array using selection sort");
        if (array == null) {
            logger.error("Error: Array cannot be null. (selectionSort)");
            throw new ArrayException("Error: Array cannot be null. (selectionSort)");
        }

        int buffer;
        for (int i = 0; i < array.getLength()-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.getLength(); j++) {
                if (array.getElement(j) < array.getElement(minIndex)) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                buffer = array.getElement(minIndex);
                array.setElement(minIndex, array.getElement(i));
                array.setElement(i, buffer);
            }
        }
        logger.info("The array was successfully sorted by selection.");

        return array;
    }

}
