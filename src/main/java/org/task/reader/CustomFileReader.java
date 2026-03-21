package org.task.reader;

import org.task.exception.ArrayException;

import java.nio.file.Path;
import java.util.List;

public interface CustomFileReader {

    List<String> readAllFile(Path path) throws ArrayException;

    String readCertainStringFromFile(Path path, int number) throws ArrayException;

}
