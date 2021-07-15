package basic.responsibility_chain;

/**
 * @fileName: CHainPatternDemo
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 * 1. Reduce coupling. This design pattern decouple the receiver and the sender.
 * 2. Simplify the object and mek the class easier to use.
 * 3. It gives object much higher reflexivity and changes the structure inside.
 * 4. (TO BE CONFIRMED) The content may not be received properly.
 * 5. Hard to debug, some influences to the system and lower performances a little bit.
 **/
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
