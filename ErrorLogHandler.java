public class ErrorLogHandler extends Handler{
    public ErrorLogHandler(String name) {
        super(name);
    }

    @Override
    public void showLog(Log log) {
        if(log.getType().equals("ERROR")) {
            System.out.println("Error Console::Logger: " + log.getMessage());
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
