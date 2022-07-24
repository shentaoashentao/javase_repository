package SLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4JTest01 {
    //在代码中获取日志的对象
    //好处：以后更换日志的实现类，下面的代码不需要跟着实现
    private  static final Logger LOGGER = LoggerFactory.getLogger(Log4JTest01.class);

    public static void main(String[] args) {
        //按照日志级别设置日志信息
        //输出没有debug  是因为配置文件中 log4j.rootLogger=info,my,fileAppender    输出info及以上
        LOGGER.debug("debug级别的日志");
        LOGGER.info("info级别的日志");
        LOGGER.warn("warn级别的日志");
        LOGGER.error("error级别的日志");
    }
}
