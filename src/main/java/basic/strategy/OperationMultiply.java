package basic.strategy;

/**
 * @FileName: OperationMultiply
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
