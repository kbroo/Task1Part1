package org.task.entity;

import org.task.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntArray {
    private static final Logger logger = LogManager.getLogger(IntArray.class);

    private final int[] array;

    public IntArray(int[] array, String name) throws ArrayException {
        if(array == null) {
            logger.error("Error: Передан несуществующий массив.");
            throw new ArrayException("Массив не существует (null).");
        }

        this.array = array.clone();
        logger.info("Создан новый массив длиной: {}", array.length);
    }

    public int[] getArray() {
        return array.clone();
    }

    public int getLength() {
        return array.length;
    }

    public int getElement(int index) throws ArrayException {
        if(index < 0 || index >= array.length) {
            logger.error("Передан индекс выходящий за пределы массива.");
            throw new ArrayException("Передан индекс выходящий за пределы массива.");
        }
        return array[index];
    }

    public void setElement(int index, int element) throws ArrayException {
        if(index < 0 || index >= array.length) {
            logger.error("Передан индекс выходящий за пределы массива.");
            throw new ArrayException("Передан индекс выходящий за пределы массива.");
        }
        array[index] = element;
    }

}
