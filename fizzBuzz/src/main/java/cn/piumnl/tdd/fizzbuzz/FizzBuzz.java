package cn.piumnl.tdd.fizzbuzz;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public class FizzBuzz {

    public String evaluate(int num) {
        if (isMultipleOf3(num) && isMultipleOf5(num)) {
            return "FizzBuzz";
        } else if (isMultipleOf3(num)) {
            return "Fizz";
        } else if (isMultipleOf5(num)) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

    private boolean isMultipleOf5(int num) {
        return num % 5 == 0;
    }

    private boolean isMultipleOf3(int num) {
        return num % 3 == 0;
    }
}
