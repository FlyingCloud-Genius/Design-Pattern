package basic.responsibility_chain;

/**
 * @fileName: ErrorLogger
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console : Logger : " + message);
    }
}
