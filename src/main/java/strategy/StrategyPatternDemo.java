package strategy;

/**
 * @FileName: StrategyPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 * 1. The strategy can be changed with freedom.
 * 2. This pattern always used for actual business, while the interpreter is used
 * for programmers' self-defined language decoding.
 * 3.
 **/

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
