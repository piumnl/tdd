package cn.piumnl.tdd.fizzbuzz.cor;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public class CorFizzBuzz {

    private Rule rule;

    public CorFizzBuzz() {
        rule = new FizzBuzzRule();

        FizzRule fizzRule = new FizzRule();
        rule.setSuccessor(fizzRule);

        BuzzRule buzzRule = new BuzzRule();
        fizzRule.setSuccessor(buzzRule);

        NopRule nopRule = new NopRule();
        buzzRule.setSuccessor(nopRule);
    }

    public String evaluate(int num) {
        return rule.out(num);
    }
}
