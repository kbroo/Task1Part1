package org.task.parser.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.task.exception.ArrayException;
import org.task.parser.CustomParser;
import org.task.validator.impl.CustomValidatorImpl;

public class CustomParserImpl implements CustomParser {
    private static final Logger logger = LogManager.getLogger(CustomParserImpl.class);
    private final CustomValidatorImpl fileValidator = new CustomValidatorImpl();
    private static final String SPACE_SYMBOL = " ";
    private static final String VALID_SYMBOLS = "[.,!?;:()]";


    @Override
    public int[] parseStringToInt(String line) throws ArrayException {
        logger.info("Attempting to parse string to int");
        if(line != null) {
            if(fileValidator.dataOfIntsIsValid(line)) {
                int sizeArray = 1;
                line = line.replaceAll(VALID_SYMBOLS, SPACE_SYMBOL);
                String[] strNumbers = line.split(SPACE_SYMBOL);
                for(int i = 0; i < strNumbers.length-1; i++) {
                    if(strNumbers[i] != "" && strNumbers[i] != " ") {
                        sizeArray++;
                    }
                }
                int[] array = new int[sizeArray];
                int writeIndex = 0;
                for(int i = 0; i < strNumbers.length; i++) {
                    if(strNumbers[i] != "" && strNumbers[i] != " ") {
                        if(strNumbers[i].matches("\\d+")) {
                            array[writeIndex] = Integer.parseInt(strNumbers[i]);
                            writeIndex++;
                        } else {
                            logger.error("Error: get a uncorrect value.");
                            throw new ArrayException("Error: get a uncorrect value.");
                        }
                    }
                }
                logger.info("String was successfull parsed to int.");
                return array;
            } else {
                logger.error("Error: string is not valid");
                throw new ArrayException("Error: string is not valid");
            }
        } else {
            logger.error("Error: get a null line");
            throw new ArrayException("Error: get a null line");
        }
    }
}