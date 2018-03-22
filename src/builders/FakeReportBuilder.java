package builders;

import builders.Build;
import loggers.FileLogger;
import loggers.Logger;
import reports.Report;

import java.util.ArrayList;
import java.util.List;

public class FakeReportBuilder implements Build{
    private Logger logger;

    public FakeReportBuilder(Logger logger) {
        this.logger = logger;
    }

    public FakeReportBuilder() {
        logger = new FileLogger();
    }

    @Override
    public String build() {
        String report = "";
        logger.log("Success!");
        return "";
    }

    @Override
    public List<Report> createReports() {
        return new ArrayList<>();
    }
}
