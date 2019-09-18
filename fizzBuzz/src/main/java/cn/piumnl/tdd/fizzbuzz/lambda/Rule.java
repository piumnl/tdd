package cn.piumnl.tdd.fizzbuzz.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
@FunctionalInterface
public interface Rule {

    String apply(int value);

    static Rule with(Matcher matcher, Action action) {
        return value -> matcher.match(value) ? action.act(value) : "";
    }

    static Rule allWith(Rule... rules) {
        return value -> Arrays.stream(rules)
                              .map(rule -> rule.apply(value))
                              .collect(Collectors.joining());
    }

    static Rule anyWith(Rule... rules) {
        return value -> Arrays.stream(rules)
                              .map(rule -> rule.apply(value))
                              .filter(s -> !s.isEmpty())
                              .findFirst()
                              .orElse("");
    }
}
