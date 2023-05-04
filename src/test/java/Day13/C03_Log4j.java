package Day13;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class C03_Log4j {
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        Logger logger = Logger.getLogger(C03_Log4j.class);

        logger.trace("Trace message");
        logger.debug("This is a debug message"); // debug
        logger.info("This is an info message"); // info
        logger.warn("This is a warning message"); // warn
        logger.error("error mesage");
    }
}
