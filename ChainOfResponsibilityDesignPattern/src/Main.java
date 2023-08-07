public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.INFO,"Need info details.");
        logProcessor.log(LogProcessor.ERROR,"Need error details.");
        logProcessor.log(LogProcessor.DEBUG,"Need debug details.");
        System.out.println("Hello world!");
    }
}