package movierating.models;

public class UserTestCase {

    private final String command;
    private final String name;

    public UserTestCase(String name) {
        this.command = "Add User";
        this.name = name;
    }

    public String getCommand() {
        return command;
    }

    public String getName() {
        return name;
    }
}
