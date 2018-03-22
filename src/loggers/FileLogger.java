package loggers;

public class FileLogger implements Logger{
    @Override
    public void log(String text) {
        System.out.println("Logging to file");
    }
}
