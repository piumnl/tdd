package cn.piumnl.tdd.fizzbuzz.cor;

/**
 * @author piumnl
 * @version 1.0.0
 * @since on 2018-08-21.
 */
public abstract class Rule {

    private Rule successor;

    public String out(int num) {
        return verify(num) ? execute(num) : successor.out(num);
    }

    protected abstract boolean verify(int num);

    protected abstract String execute(int num);

    public void setSuccessor(Rule successor) {
        this.successor = successor;
    }
}
