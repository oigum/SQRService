package ru.netology.sqr;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTestWithFewMatches1() {
        SQRService service = new SQRService();

        int actual = service.calc(0, 100); //классы эквивалентности для метода+классы эквивалентности для самих границ
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestWithFewMathes2() {
        SQRService service = new SQRService();

        int actual = service.calc(9, 98);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestWithFewMathes3() {
        SQRService service = new SQRService();

        int actual = service.calc(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void calcTestWithFewMathes4() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 200);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestWithMathes4() {
        SQRService service = new SQRService();

        int actual = service.calc(300, 8000);
        int expected = 72;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestWithMathes5() {
        SQRService service = new SQRService();

        int actual = service.calc(9_500, 10_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
    

}