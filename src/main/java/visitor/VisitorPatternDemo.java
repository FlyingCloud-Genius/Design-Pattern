package visitor;

/**
 * @FileName: VisitorPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
