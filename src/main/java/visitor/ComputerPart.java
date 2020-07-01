package visitor;

/**
 * @FileName: ComputerPart
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
