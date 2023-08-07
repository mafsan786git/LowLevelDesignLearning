public abstract class LogProcessor {
    public static int INFO = 0;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message){
        if (this.nextLogProcessor != null){
            this.nextLogProcessor.log(logLevel,message);
        }
    }
}
