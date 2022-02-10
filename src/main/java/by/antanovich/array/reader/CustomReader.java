package by.antanovich.array.reader;

import by.antanovich.array.exception.CustomException;

public interface CustomReader {
    String readOneFromFile(String path) throws CustomException;

    String[] readAllFromFile(String path) throws CustomException;
}
