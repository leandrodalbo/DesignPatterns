package observer;

import java.util.ArrayList;
import java.util.Collection;

public class ObserverSubject {

    private static ObserverSubject instance = null;
    private Collection<LocalObserver> observerList = new ArrayList<>();

    public static ObserverSubject getInstance() {
        if (instance == null) {
            instance = new ObserverSubject();
        }

        return instance;
    }

    public void addObserver(LocalObserver observer) {
        this.observerList.add(observer);
    }

    public boolean containsObserver(LocalObserver observer) {
        return this.observerList.contains(observer);
    }


    public void removeObserver(LocalObserver observer) {
        this.observerList.remove(observer);
    }

    public void notifyObservers() {
        this.observerList.stream()
                .forEach(localObserver -> localObserver.react());
    }
}
