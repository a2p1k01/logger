package nodomain.a2p1k02.logger.core;

import nodomain.a2p1k02.logger.util.Type;

import java.util.Date;

abstract class BaseLogger {
    Type type = Type.INFO;
    String message = "";
    Date date = new Date();
}
