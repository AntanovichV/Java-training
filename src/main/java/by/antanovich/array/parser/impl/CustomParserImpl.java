package by.antanovich.array.parser.impl;

import by.antanovich.array.parser.CustomParser;

public class CustomParserImpl implements CustomParser {
    @Override
    public int[] parserStringToCustomArray(String inputStr) {
        if (inputStr.isBlank()) {
            return new int[0];
        }
        StringBuilder tempString = new StringBuilder();
        String[] arrayString = tempString.toString().split("\\s");
        int[] result = new int[arrayString.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(arrayString[i]);
        }
        return result;
    }
}
