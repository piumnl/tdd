package cn.piumnl.tdd.fizzbuzz.cor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public class CorFizzBuzzTest {

    private CorFizzBuzz fb;

    @BeforeEach
    void setUp() throws Exception {
        fb = new CorFizzBuzz();
    }

    @Test
    void evaluatedOneReturnOne(){
        assertEquals("1", fb.evaluate(1));
    }

    @Test
    void evaluatedTwoReturnTwo() {
        assertEquals("2", fb.evaluate(2));
    }

    @Test
    void evaluatedThreeReturnFizz() {
        assertEquals("Fizz", fb.evaluate(3));
    }

    @Test
    void evaluatedFiveReturnBuzz() {
        assertEquals("Buzz", fb.evaluate(5));
    }

    @Test
    void evaluatedSixReturnFizz() {
        assertEquals("Fizz", fb.evaluate(6));
    }

    @Test
    void evaluatedTenReturnBuzz() {
        assertEquals("Buzz", fb.evaluate(10));
    }

    @Test
    void evaluatedFifthReturnFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(15));
    }

    @Test
    void evaluatedThirthReturnFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(30));
    }

}