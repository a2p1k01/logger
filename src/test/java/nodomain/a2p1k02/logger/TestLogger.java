package nodomain.a2p1k02.logger;

import nodomain.a2p1k02.logger.core.Logger;
import nodomain.a2p1k02.logger.util.Type;
import org.junit.Test;

public class TestLogger {

    @Test
    public void testMain1() {
        int age = 18;
        Logger logger = new Logger(Type.INFO);
        logger.log(age);
    }

    @Test
    public void testMain2() {
        int age = 18;
        Logger logger = new Logger(Type.WARNING);
        logger.log(age);
    }
}
