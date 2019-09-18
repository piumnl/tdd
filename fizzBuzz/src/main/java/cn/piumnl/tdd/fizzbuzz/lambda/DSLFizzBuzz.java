package cn.piumnl.tdd.fizzbuzz.lambda;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public class DSLFizzBuzz {

    private final Rule rule;

    public DSLFizzBuzz() {
        Rule fizz = Rule.with(Matcher.multiple(3), Action.transform("Fizz"));
        Rule buzz = Rule.with(Matcher.multiple(5), Action.transform("Buzz"));
        Rule other = Rule.with(Matcher.always(true), Action.keep());

        Rule fizzBuzz = Rule.allWith(fizz, buzz);

        rule = Rule.anyWith(fizzBuzz, fizz, buzz, other);
    }

    public String evaluate(int num) {
        return rule.apply(num);
    }
}
