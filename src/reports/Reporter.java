package reports;

import builders.Build;
import senders.Send;

import java.util.List;

public class Reporter implements Report {
    private final Build reportBuilder;
    private final Send reportSender;

    public Reporter(Build reportBuilder, Send reportSender) {
        this.reportBuilder = reportBuilder;
        this.reportSender = reportSender;
    }

    @Override
    public void sendReports() {
        List<Report> reports = reportBuilder.createReports();
        if (reports.size() == 0) {
            throw new NoReportsException();
        }

        for (Report report : reports) {
            reportSender.send(report);
        }
    }
}

