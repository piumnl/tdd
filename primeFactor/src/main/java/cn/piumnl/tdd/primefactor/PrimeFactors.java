package cn.piumnl.tdd.primefactor;

import java.util.ArrayList;
import java.util.List;

/**
 * TDD：素因数分解（Prime Factorization）
 * 【数论】算术基本定理： 每个大于1的自然数可以写为质数的积
 *
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-23.
 */
public class PrimeFactors {

    /**
     * 最小的质数
     */
    private static final int MIN_PRIME = 2;

    public static List<Integer> generate(int num) {
        List<Integer> list = new ArrayList<>();

        for (int i = MIN_PRIME; i <= num; i++) {
            while (num % i == 0) {
                list.add(i);
                num = num / i;
            }
        }

        return list;
    }
}
