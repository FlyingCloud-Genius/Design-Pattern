package basic.business_delegate;

/**
 * @FileName: Client
 * @Auther: Cloud
 * @Create: 2020 - 07 - 17
 * @Description:
 **/

public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
