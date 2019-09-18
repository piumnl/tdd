package cn.piumnl.tdd.fizzbuzz.lambda;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public class DSLFizzBuzzTest {
    private DSLFizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new DSLFizzBuzz();
    }

    @Test
    public void evaluatedOneReturnOne(){
        assertEquals("1", fb.evaluate(1));
    }

    @Test
    public void evaluatedTwoReturnTwo() {
        assertEquals("2", fb.evaluate(2));
    }

    @Test
    public void evaluatedThreeReturnFizz() {
        assertEquals("Fizz", fb.evaluate(3));
    }

    @Test
    public void evaluatedFiveReturnBuzz() {
        assertEquals("Buzz", fb.evaluate(5));
    }

    @Test
    public void evaluatedSixReturnFizz() {
        assertEquals("Fizz", fb.evaluate(6));
    }

    @Test
    public void evaluatedTenReturnBuzz() {
        assertEquals("Buzz", fb.evaluate(10));
    }

    @Test
    public void evaluatedFifthReturnFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(15));
    }

    @Test
    public void evaluatedThirthReturnFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(30));
    }

}