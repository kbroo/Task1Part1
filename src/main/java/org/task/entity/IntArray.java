package org.task.entity;

import org.task.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntArray {
    private static final Logger logger = LogManager.getLogger(IntArray.class);

    private final int[] array;
    private final int size;

    public IntArray(int[] array) throws ArrayException {
        logger.info("Попытка создать массив.");
        if(array == null) {
            logger.error("Error: Передан несуществующий массив.");
            throw new ArrayException("Массив не существует (null).");
        }

        this.array = array.clone();
        size = array.length;
        logger.info("Создан новый массив длиной: {}", size);
    }

    public int[] getArray() {
        return array.clone();
    }

    public int getLength() {
        return size;
    }

    public int getElement(int index) throws ArrayException {
        logger.info("Попытка получить элемент массива с индексом {}", index);
        if(index < 0 || index >= array.length) {
            logger.error("Передан индекс выходящий за пределы массива.");
            throw new ArrayException("Передан индекс выходящий за пределы массива.");
        }
        logger.info("Получен элемент массива с индексом {}", index);
        return array[index];
    }

    public void setElement(int index, int element) throws ArrayException {
        logger.info("Попытка передать значение элементу массива с индексом {}", index);
        if(index < 0 || index >= array.length) {
            logger.error("Передан индекс выходящий за пределы массива.");
            throw new ArrayException("Передан индекс выходящий за пределы массива.");
        }
        logger.info("Передано значение элементу массива с индексом {}", index);
        array[index] = element;
    }

}
