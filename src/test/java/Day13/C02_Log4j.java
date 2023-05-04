package Day13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C02_Log4j {
    public static void main(String[] args) {
        // Logger with default log4j configuration
        // default log level is error


        Logger logger = LogManager.getLogger(C02_Log4j.class.getName());

        logger.trace("Trace message");
        logger.debug("This is a debug message"); // debug
        logger.info("This is an info message"); // info
        logger.warn("This is a warning message"); // warn
        logger.error("error mesage");
    }
}
