package org.task.parser;

import org.apache.logging.log4j.core.config.AwaitUnconditionallyReliabilityStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.task.entity.IntArray;
import org.task.exception.ArrayException;
import org.task.parser.impl.CustomParserImpl;

public class CustomParserTest {
    private String CORRECT_STRING = "1; 6; 8; 9; 3; 63";
    private String UNCORRECT_STRING = "1a; 5; 3; fdg";
    private final int[] CORRECT_ARRAY = {1, 6, 8, 9, 3, 63};
    private final CustomParserImpl parserToInt = new CustomParserImpl();
    private IntArray array;

    @BeforeEach
    void setUp() throws ArrayException {
        array = new IntArray(CORRECT_ARRAY);
    }

    @Test
    void shouldParseStringToIntWithoutErrors() throws ArrayException {
        int[] parsedStringToInt = parserToInt.parseStringToInt(CORRECT_STRING);
        Assertions.assertArrayEquals(array.getArray(), parsedStringToInt);
    }

    @Test
    void shouldParseStringToIntWithError() throws ArrayException {
        Assertions.assertThrows(ArrayException.class, () -> parserToInt.parseStringToInt(UNCORRECT_STRING));
    }
}
