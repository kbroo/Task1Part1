package org.task.parser;

import org.task.exception.ArrayException;

public interface CustomParser {
    int[] parseStringToInt(String line) throws ArrayException;
}
