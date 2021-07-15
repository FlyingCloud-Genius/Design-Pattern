package basic.visitor;

/**
 * @FileName: Mouse
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
