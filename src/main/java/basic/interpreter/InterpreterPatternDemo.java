package basic.interpreter;

/**
 * @FileName: InterpreterPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 23
 * @Description:
 *  1. It is a pretty bad sample. The logic in the sample is in chaos.
 *  2. This pattern is easy to extend but not frequently used under occasions.
 *  3. It used for abstracted grammar tree. It will be complecated for complicated grammar.
 **/

public class InterpreterPatternDemo {

    //Rule：Robert and John are men
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julia is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
