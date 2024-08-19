package server.Commands;

import server.Database;
import server.Response;

public class GetCommand implements Command {

    private Database db;
    private String keyValue;
    private Response response;

    public GetCommand(Database db, String keyValue) {
        this.db = db;
        this.keyValue = keyValue;
    }

    @Override
    public void execute() {

        if (this.db.get(keyValue) != null) {
            this.response = new Response("OK", this.db.get(keyValue));
        } else {
            this.response = new Response("ERROR", null, "No such key");
        }

    }

    public Response getResponse() {
        return this.response;
    }
}