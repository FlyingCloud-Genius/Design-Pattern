package basic.null_object;

/**
 * @FileName: RealCustomer
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
