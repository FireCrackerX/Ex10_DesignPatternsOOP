public class InfoLogHandler extends Handler {
    public InfoLogHandler(String name) {
        super(name);
    }
    
    @Override
    public void showLog(Log log) {
        if(log.getType().equals("INFO")) {
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
