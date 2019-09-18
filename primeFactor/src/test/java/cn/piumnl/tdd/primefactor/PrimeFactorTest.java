package cn.piumnl.tdd.primefactor;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-23.
 */
public class PrimeFactorTest {

    private List<Integer> list(int... num) {
        List<Integer> list = new ArrayList<>();

        for (int n : num) {
            if (n > 1) {
                list.add(n);
            }
        }
        return list;
    }

    /**
     * 测试 oneReturnOne() 方法
     * @since 2018/8/23
     */
    @Test
    void oneReturnOne(){
        assertEquals(list(1), PrimeFactors.generate(1));
    }

    /**
     * 测试 twoReturnTwo() 方法
     * @since 2018/8/23
     */
    @Test
    void twoReturnTwo(){
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    /**
     * 测试 threeReturnThree() 方法
     * @since 2018/8/23
     */
    @Test
    void threeReturnThree(){
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    /**
     * 测试 fourReturnTwo() 方法
     * @since 2018/8/23
     */
    @Test
    void fourReturnTwo(){
        assertEquals(list(2, 2), PrimeFactors.generate(4));
    }

    /**
     * 测试 fiveReturnFive() 方法
     * @since 2018/8/23
     */
    @Test
    void fiveReturnFive(){
        assertEquals(list(5), PrimeFactors.generate(5));
    }

    /**
     * 测试 sixReturnTwoAndThree() 方法
     * @since 2018/8/23
     */
    @Test
    void sixReturnTwoAndThree(){
        assertEquals(list(2, 3), PrimeFactors.generate(6));
    }

    /**
     * 测试 sevenReturnSeven() 方法
     * @since 2018/8/23
     */
    @Test
    void sevenReturnSeven(){
        assertEquals(list(7), PrimeFactors.generate(7));
    }

    /**
     * 测试 eightReturnTwoAndTwoAndTwo() 方法
     * @since 2018/8/23
     */
    @Test
    void eightReturnTwoAndTwoAndTwo(){
        assertEquals(list(2, 2, 2), PrimeFactors.generate(8));
    }

    /**
     * 测试 nineReturnThreeAndThree() 方法
     * @since 2018/8/23
     */
    @Test
    void nineReturnThreeAndThree(){
        assertEquals(list(3, 3), PrimeFactors.generate(9));
    }

    /**
     * 测试 11Return11() 方法
     * @since 2018/8/23
     */
    @Test
    void _11Return11(){
        assertEquals(list(11), PrimeFactors.generate(11));
    }

    /**
     * 测试 13Return13() 方法
     * @since 2018/8/23
     */
    @Test
    void _13Return13(){
        assertEquals(list(13), PrimeFactors.generate(13));
    }

    /**
     * 测试 13Return13() 方法
     * @since 2018/8/23
     */
    @Test
    void _15Return3And5(){
        assertEquals(list(3, 5), PrimeFactors.generate(15));
    }
}
