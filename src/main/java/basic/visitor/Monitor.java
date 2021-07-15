package basic.visitor;

/**
 * @FileName: Monitor
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
