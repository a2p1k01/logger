package nodomain.a2p1k02.logger.core;

import nodomain.a2p1k02.logger.util.Type;

public class Logger extends BaseLogger {

    public Logger() {}

    public Logger(Type type) {
        this.type = type;

    }

    public void log(Object obj) {
        this.message = "Type: " + obj.getClass().getName() + " = " + obj;
        switch (this.type) {
            case DEBUG:
            case INFO:
                System.out.println(message);
                break;
            case FATAL:
            case WARNING:
                System.err.println(message);
                break;
        }
    }
}
