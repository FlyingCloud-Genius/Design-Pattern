package basic.strategy;

/**
 * @FileName: StrategyPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 * 1. The basic.strategy can be changed with freedom.
 * 2. This pattern always used for actual business, while the basic.interpreter is used
 * for programmers' self-defined language decoding.
 * 3. All the basic.strategy will be exposd to the outside environment.
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
