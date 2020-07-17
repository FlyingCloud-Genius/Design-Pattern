package business_delegate;

/**
 * @FileName: BusinessLookUp
 * @Auther: Cloud
 * @Create: 2020 - 07 - 17
 * @Description:
 **/

public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
