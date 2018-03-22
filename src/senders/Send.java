package senders;

import reports.Report;

public interface Send {
    void send(Report report);

    void send(String report);
}
