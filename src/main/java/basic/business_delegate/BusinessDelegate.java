package basic.business_delegate;

/**
 * @FileName: BusinessDelegate
 * @Auther: Cloud
 * @Create: 2020 - 07 - 17
 * @Description:
 **/

public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();

    private BusinessService businessService;

    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
