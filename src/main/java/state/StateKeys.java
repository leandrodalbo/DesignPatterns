package state;

public enum StateKeys {

    OPEN("open"),
    CLOSED("closed");

    private final String key;

    StateKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
