package proxy;

/**
 * @fileName: ProxyPatternDemo
 * @author: Cloud
 * @create: 2020-05-29
 * @description:
 * 1. Giving the class and object higher extendability. Also giving the class much clearer responsibility.
 * 2. Proxy make the requesting speed lower than normal case due to an extra layer.
 * 3. Implementing the proxy mode takes some more time.
 * 4. According to different using circumstances, proxy mode shows different ways to implement.
 * 5. There are following circumstances for usage:
 *      a. remote proxy
 *      b. virtual proxy
 *      c. copy-on-write
 *      d. protect or access
 *      e. cache
 *      f. firewall
 *      g. synchronization
 *      h. smart reference
 **/
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
