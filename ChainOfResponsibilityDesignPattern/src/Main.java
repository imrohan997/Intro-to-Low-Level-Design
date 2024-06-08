//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            LogProcessor log = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

            log.log(LogProcessor.ERROR, "exception occured");
            log.log(LogProcessor.DEBUG, "need to debug this");
            log.log(LogProcessor.INFO, "just for info");
    }
}