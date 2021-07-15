package basic.business_delegate;

/**
 * @FileName: JMSService
 * @Auther: Cloud
 * @Create: 2020 - 07 - 17
 * @Description:
 **/

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
