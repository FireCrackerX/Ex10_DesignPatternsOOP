public class App {
    public static void main(String[] args) {
        Handler infoLogHandler = new InfoLogHandler("Info Log Handler");
        Handler debugLogHandler = new DebugLogHandler("Debug Log Handler");
        Handler errorLogHandler = new ErrorLogHandler("Error Log Handler");

        infoLogHandler.setHandler(debugLogHandler);
        debugLogHandler.setHandler(errorLogHandler);

        Log errorLog = new Log("This is an error information.", "ERROR");
        Log infoLog = new Log("This is an information.", "INFO");
        Log debugLog = new Log("This is a debug information.", "DEBUG");

        infoLogHandler.showLog(infoLog);
        System.out.println("=====================================");
        infoLogHandler.showLog(debugLog);
        System.out.println("=====================================");
        infoLogHandler.showLog(errorLog);
    }
    
}
