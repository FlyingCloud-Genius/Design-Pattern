package responsibility_chain;

/**
 * @fileName: ConsoleLogger
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console : Logger :" + message);
    }
}
