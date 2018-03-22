package senders;

import reports.Report;

public class FakeEmailReportSender implements Send{

    @Override
    public void send(Report report) {
    }

    @Override
    public void send(String report) {
    }
}
