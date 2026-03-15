package org.task.reader.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.task.exception.ArrayException;
import org.task.reader.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderImpl implements FileReader {
    private static final Logger logger = LogManager.getLogger(FileReaderImpl.class);

    @Override
    public List<String> readAllFile(Path path) throws ArrayException {
        logger.info("Попытка считать данные из файла.");
        List<String> lines;
        try {
            lines = Files.readAllLines(Path.of("data\\arrays.txt"));
        } catch (IOException e) {
            logger.error("Error: ошибка при чтении файла.");
            throw new ArrayException("Error: ошибка при чтении файла. ");
        }
        logger.info("Данные успешно считаны из файла.");
        return lines;
    }

}
