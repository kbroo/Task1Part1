package org.task.reader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.task.exception.ArrayException;
import org.task.reader.impl.CustomFileReaderImpl;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class FileReaderTest {
    private final Path DATA = Path.of("data\\arrays.txt");
    private final CustomFileReaderImpl customFileReader = new CustomFileReaderImpl();
    private List<String> file;
    private String certainString;

    @BeforeEach
    void setUp() {
        file = Arrays.asList(
                "1; 2; 3",
                "1; 2; x3; 6..5; 77",
                "{empty string}",
                "",
                "11; 2"
        );
        certainString = "1; 2; x3; 6..5; 77";
    }

    @Test
    void shouldReturnAllLinesFromFile() throws ArrayException {
        List<String> lines = customFileReader.readAllFile(DATA);
        Assertions.assertEquals(file, lines);
    }

    @Test
    void shouldReturnCertainLineFromFile() throws ArrayException {
        String line = customFileReader.readCertainStringFromFile(DATA, 2);
        Assertions.assertEquals(certainString, line);
    }
}
