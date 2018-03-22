package loggers;

public class BdLogger implements Logger{
    @Override
    public void log(String text) {
        System.out.println("Logging to BD");
    }
}
