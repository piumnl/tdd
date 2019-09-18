package cn.piumnl.tdd.fizzbuzz.cor;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public class NopRule extends Rule {
    @Override
    protected boolean verify(int num) {
        return true;
    }

    @Override
    protected String execute(int num) {
        return String.valueOf(num);
    }
}
