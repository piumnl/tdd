package cn.piumnl.tdd.fizzbuzz.lambda;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
@FunctionalInterface
public interface Action {

    String act(int value);

    static Action transform(String out) {
        return value -> out;
    }

    static Action keep() {
        return String::valueOf;
    }
}
