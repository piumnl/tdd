package cn.piumnl.tdd.fizzbuzz.cor;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public class BuzzRule extends Rule {

    @Override
    protected boolean verify(int num) {
        return num % 5 == 0;
    }

    @Override
    protected String execute(int num) {
        return "Buzz";
    }
}
