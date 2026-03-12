package org.task.entity;

import org.task.exception.ArrayException;

public class IntArray {

    private final int[] array;
    private final String name;

    public IntArray(int[] array, String name) throws ArrayException {
        if(array == null) {
            throw new ArrayException("Массив не существует (null).");
        }
        if(name.isBlank()) {
            throw new ArrayException("Название массива не может быть пустым.");
        }

        this.array = array.clone();
        this.name = name;
    }

    public int[] getArray() {
        return array.clone();
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return array.length;
    }

    public int getElement(int index) throws ArrayException {
        if(index < 0 || index >= array.length) {
            throw new ArrayException("Передан индекс выходящий за пределы массива.");
        }
        return array[index];
    }

    public void setElement(int index, int element) throws ArrayException {
        if(index < 0 || index >= array.length) {
            throw new ArrayException("Передан индекс выходящий за пределы массива.");
        }
        array[index] = element;
    }

}
