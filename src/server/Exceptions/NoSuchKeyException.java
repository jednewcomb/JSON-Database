package server.Exceptions;

public class NoSuchKeyException extends RuntimeException {
    public NoSuchKeyException() {
        super("No such key");
    }
}