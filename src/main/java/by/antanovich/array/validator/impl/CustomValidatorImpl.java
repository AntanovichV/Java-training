package by.antanovich.array.validator.impl;

import by.antanovich.array.validator.CustomValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomValidatorImpl implements CustomValidator {
    private static CustomValidatorImpl instance;
    public final String REGEX = "(^[+-]?\\d+\\s+)*([+-]?\\d+)?$";

    private CustomValidatorImpl(){}

    public static CustomValidatorImpl getInstance(){
        if(instance == null){
            instance = new CustomValidatorImpl();
        }
        return instance;
    }

    public boolean validate(String parameter) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(parameter);
        return m.matches();
    }
}
