package basic.strategy;

/**
 * @FileName: OperationSubtract
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
