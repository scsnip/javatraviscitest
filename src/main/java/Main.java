import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


public class Main {
    public static final Logger logger = Logger.getLogger("Main");
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("test from logger");
        System.out.println("Hello!");
    }
}
