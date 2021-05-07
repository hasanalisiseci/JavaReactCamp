package nLayeredDemo.core.Adapters;

import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    JLoggerManager loggerManager;

    public JLoggerManagerAdapter(JLoggerManager loggerManager) {
        this.loggerManager = loggerManager;
    }

    @Override
    public void logToSystem(String message) {
        this.loggerManager.log(message);
    }
}
