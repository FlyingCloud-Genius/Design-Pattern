package basic.strategy;

/**
 * @FileName: OperationAdd
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
