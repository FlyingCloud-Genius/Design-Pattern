package basic.responsibility_chain;

/**
 * @fileName: FileLogger
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {

    }
}
