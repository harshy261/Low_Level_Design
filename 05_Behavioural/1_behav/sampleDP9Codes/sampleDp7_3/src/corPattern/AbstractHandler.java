package corPattern;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public AbstractHandler(AbstractHandler next) {
        this.nextHandler = next;
    }

    public void handleRequest(AbstractRequest request) {
        if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
