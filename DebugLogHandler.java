public class DebugLogHandler extends Handler {
    public DebugLogHandler(String name) {
        super(name);
    }

    @Override
    public void showLog(Log log) {
        if(log.getType().equals("DEBUG")) {
            System.out.println("File::Logger: " + log.getMessage());
            System.out.println("Standard Console::Logger: " + log.getMessage());
        }
        else if (next != null){
            next.showLog(log);
        }
        else {
            System.out.println("No handler found for log type: " + log.getType());
        }
    }
}
