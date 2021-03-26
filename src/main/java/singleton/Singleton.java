package singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(Singleton.class.getName());
    }
}
