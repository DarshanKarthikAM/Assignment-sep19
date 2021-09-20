package com.Number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberTest {

    private Number num;

    @BeforeEach
    void init() {
        num = new Number();
    }

    @Test
    void checkPolindrome() {
        boolean value = num.CheckPolindrome(121);
        Assertions.assertEquals(true, value);
    }

    @Test
    void checkPrime() {
        boolean value = num.checkPrime(4);
        Assertions.assertEquals(false, value);
        boolean value1 = num.checkPrime(3);
        Assertions.assertEquals(true, value1);
    }

    @Test
    void checkAmstrong() {
        boolean value = num.checkAmstrong(5);
        Assertions.assertEquals(false, value);
    }
}