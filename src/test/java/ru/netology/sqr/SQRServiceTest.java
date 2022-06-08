package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Sqr.csv")
    public void testCalculateSQR(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calculate(min, max);
        Assertions.assertEquals(expected, actual);
    }
}

