package ru.netology.sqr;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "'count SQRT in range'; 100; 200; 5",
                    "'count SQRT under range'; 0; 99; 0",
                    "'count SQRT out range'; 10001; 10100; 0",
                    "'count SQRT all range'; 100; 10000; 90",
            },
            delimiter = ';'
    )

    void shouldCalculateForRegisteredAndUnderLimit(String test, int from, int to, int expected) {
        SQRService service = new SQRService();
        long actual = service.getCountSQR(from, to);
        System.out.println(test);
        System.out.println(expected);
        System.out.println(actual);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
}
