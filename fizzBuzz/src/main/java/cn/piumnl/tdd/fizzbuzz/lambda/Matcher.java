package cn.piumnl.tdd.fizzbuzz.lambda;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
@FunctionalInterface
public interface Matcher {

    boolean match(int value);

    static Matcher multiple(int n) {
        return x -> x % n == 0;
    }

    static Matcher always(boolean n) {
        return x -> n;
    }
}
