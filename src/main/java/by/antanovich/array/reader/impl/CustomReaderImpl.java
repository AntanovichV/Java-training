package by.antanovich.array.reader.impl;

import by.antanovich.array.exception.CustomException;
import by.antanovich.array.reader.CustomReader;
import by.antanovich.array.validator.CustomValidator;
import by.antanovich.array.validator.impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class CustomReaderImpl implements CustomReader {
    static Logger logger = LogManager.getLogger();

    @Override
    public String readOneFromFile(String path) throws CustomException {
        File file = new File(path);
        if (file.exists() && file.length() == 0) {
            return "";
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            CustomValidator validator = CustomValidatorImpl.getInstance();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (validator.validate(line)) {
                    return line;
                }
            }
        } catch (FileNotFoundException e) {
            logger.error("File " + path + " not found");
            throw new CustomException(e);
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new CustomException(e);
        }
        logger.error("File " + path + " can not be read");
        throw new CustomException("File " + path + " can not be read");
    }

    @Override
    public String[] readAllFromFile(String path) throws CustomException {
        File file = new File(path);
        if (file.exists() && file.length() == 0) {
            return new String[]{};
        }
        String[] result = new String[]{};
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            CustomValidator validator = CustomValidatorImpl.getInstance();
            result = bufferedReader.lines().filter(validator::validate).toArray(String[]::new);
        } catch (FileNotFoundException e) {
            logger.error("File " + path + " not found");
            throw new CustomException(e);
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new CustomException(e);
        }
        logger.error("File " + path + " can not be read");
        throw new CustomException("File " + path + " can not be read");
    }
}
