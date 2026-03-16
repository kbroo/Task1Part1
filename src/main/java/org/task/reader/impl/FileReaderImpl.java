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
        logger.info("Attempting to read data from file.");
        List<String> lines;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            logger.error("Error: Error reading file.");
            throw new ArrayException("Error: Error reading file.");
        }
        logger.info("Data was successfully read from the file.");
        return lines;
    }

    @Override
    public String readCertainStringFromFile(Path path, int number) throws ArrayException {
        logger.info("Attempting to read certain string from file.");
        List<String> lines;
        String line = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            logger.error("Error: Error reading string from file.");
            throw new ArrayException("Error: Error reading string from file.");
        }
        int i = 1;
        for(String el:lines) {
            if(i == number){
                line = el;
                break;
            }
            i++;
        }
        if (line != null) {
            logger.info("String was successfully read from the file.");
            return line;
        } else {
            logger.error("Error: number out of range.");
            throw new ArrayException("Error: number out of range.");
        }
    }

}
