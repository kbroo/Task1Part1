package org.task.reader;

import org.task.exception.ArrayException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface FileReader {

    List<String> readAllFile(Path path) throws ArrayException;

}
