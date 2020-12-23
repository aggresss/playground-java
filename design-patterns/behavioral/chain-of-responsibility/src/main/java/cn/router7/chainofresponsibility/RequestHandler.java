package cn.router7.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RequestHandler.
 */
public abstract class RequestHandler {

    private static final Logger log = LoggerFactory.getLogger(RequestHandler.class);

    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    /**
     * Request handler.
     */
    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        log.info("{} handling request \"{}\"", this, req);
    }

    @Override
    public abstract String toString();
}
