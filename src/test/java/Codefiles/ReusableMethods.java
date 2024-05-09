package Codefiles;

import org.apache.commons.lang3.RandomStringUtils;

public class ReusableMethods {

    public static String randonString() {

        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }
}
