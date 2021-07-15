package basic.visitor;

/**
 * @FileName: Keyboard
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
