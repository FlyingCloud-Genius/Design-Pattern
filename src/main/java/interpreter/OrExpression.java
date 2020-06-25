package interpreter;

/**
 * @FileName: OrExpression
 * @Auther: Cloud
 * @Create: 2020 - 06 - 23
 * @Description:
 **/

public class OrExpression implements Expression {

    private Expression expression1 = null;

    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
