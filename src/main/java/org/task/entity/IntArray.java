package org.task.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.task.exception.ArrayException;

public class IntArray {
    private static final Logger logger = LogManager.getLogger(IntArray.class);

    private final int[] array;
    private final int size;

    public IntArray(int[] array) throws ArrayException {
        logger.info("Attemp to create array.");
        if (array == null) {
            logger.error("Error: Was passed a non-existent array.");
            throw new ArrayException("Array is not exist (null).");
        }
        this.array = array.clone();
        size = array.length;
        logger.info("Create a new array with length: {}", size);
    }

    public int[] getArray() {
        return array.clone();
    }

    public int getLength() {
        return size;
    }

    public int getElement(int index) throws ArrayException {
        logger.info("Attemp to get an array element with an index {}", index);
        if (index < 0 || index >= array.length) {
            logger.error("An index passed that is outside the array bounds. (getElement)");
            throw new ArrayException("An index passed that is outside the array bounds.");
        }
        logger.info("Received array element with index {}", index);
        return array[index];
    }

    public void setElement(int index, int element) throws ArrayException {
        logger.info("Attemp to set an array element with an index {}", index);
        if (index < 0 || index >= array.length) {
            logger.error("An index passed that is outside the array bounds. (setElement)");
            throw new ArrayException("An index passed that is outside the array bounds.");
        }
        logger.info("The value was passed to the array element with index {}", index);
        array[index] = element;
    }
}