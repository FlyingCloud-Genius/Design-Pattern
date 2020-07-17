package business_delegate;

/**
 * @FileName: BusinessDelegatePatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 07 - 17
 * @Description:
 * This design pattern decouples the front page and the business layer.
 **/

public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
