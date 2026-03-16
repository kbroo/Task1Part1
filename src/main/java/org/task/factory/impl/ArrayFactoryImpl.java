package org.task.factory.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.task.entity.IntArray;
import org.task.factory.ArrayFactory;
import org.task.exception.ArrayException;

public class ArrayFactoryImpl implements ArrayFactory {
    private static final Logger logger = LogManager.getLogger(ArrayFactoryImpl.class);

    @Override
    public IntArray createIntArray(int[] array) throws ArrayException {
        logger.info("Attemp to create an array.");
        if (array == null) {
            logger.error("Error: Null array passed.");
            throw new ArrayException("Null array passed.");
        }
        logger.info("The array was created successfully.");
        return new IntArray(array);
    }
}