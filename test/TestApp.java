import builders.FakeReportBuilder;
import org.junit.Test;
import reports.NoReportsException;
import reports.Report;
import reports.Reporter;
import senders.FakeEmailReportSender;

public class TestApp {
    @Test(expected = NoReportsException.class)
    public void whenEmptyListReturnNotification(){
        Report reporter = new Reporter(new FakeReportBuilder(), new FakeEmailReportSender());
        reporter.sendReports();
    }
}
