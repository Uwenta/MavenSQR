package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Sqr.csv")
    public void testCalculateSQR(int expected, int a, int b) {
        SQRService service = new SQRService();
        int actual = service.calculate(a, b);
        Assertions.assertEquals(expected, actual);
    }
}

