public class Handler {
    protected Handler next;
    protected String name;

    public Handler(String name) {
        this.name = name;
    }

    public void setHandler(Handler handler) {
        if(next != null) {
            next.setHandler(handler);
        }
        else {
            this.next = handler;
        }
    }

    public void showLog(Log log){
        if(next != null) {
            next.showLog(log);
        }
    }

    public String getHandlerName() {
        return name;
    }
}