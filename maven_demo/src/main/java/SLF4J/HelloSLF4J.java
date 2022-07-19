package SLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloSLF4J {
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(HelloSLF4J.class);

        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.info("hello {} {}","123","456");
    }
}
