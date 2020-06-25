package null_object;

/**
 * @FileName: NullCustomer
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer Database";
    }
}
