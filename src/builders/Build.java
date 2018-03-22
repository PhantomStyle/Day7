package builders;

import reports.Report;

import java.util.List;

public interface Build {
    String build();

    List<Report> createReports();
}
