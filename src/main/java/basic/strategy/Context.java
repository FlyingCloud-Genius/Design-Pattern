package basic.strategy;

/**
 * @FileName: Context
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
