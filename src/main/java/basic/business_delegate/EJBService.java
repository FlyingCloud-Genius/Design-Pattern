package basic.business_delegate;

/**
 * @FileName: EJBService
 * @Auther: Cloud
 * @Create: 2020 - 07 - 17
 * @Description:
 **/

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
