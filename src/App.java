import builders.FakeReportBuilder;
import loggers.BdLogger;
import loggers.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = new BdLogger();
        FakeReportBuilder builder = new FakeReportBuilder(logger);
        builder.build();
    }
}
