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
        logger.info("Попытка создать массив.");

        if(array == null) {
            logger.error("Ошибка: Передан массив null.");
            throw new ArrayException("Передан массив null.");
        }

        logger.info("Массив успешно создан.");
        return new IntArray(array);

    }

}