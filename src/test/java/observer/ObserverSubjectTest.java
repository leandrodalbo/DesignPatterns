package observer;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class ObserverSubjectTest {

    @Test
    public void shouldAddAnObserver() {
        ObserverSubject observerSubject = ObserverSubject.getInstance();
        LocalObserver observer = new ConcreteObserver();
        observerSubject.addObserver(observer);

        assertTrue(observerSubject.containsObserver(observer));
    }

    @Test
    public void shouldRemoveAnObserver() {
        ObserverSubject observerSubject = ObserverSubject.getInstance();
        LocalObserver observer = new ConcreteObserver();
        observerSubject.addObserver(observer);
        observerSubject.removeObserver(observer);
        assertFalse(observerSubject.containsObserver(observer));
    }

    @Test
    public void shouldNotifyAllObservers() {
        ObserverSubject observerSubject = ObserverSubject.getInstance();
        LocalObserver observer0 = mock(ConcreteObserver.class);
        LocalObserver observer1 = mock(ConcreteObserver.class);

        observerSubject.addObserver(observer0);
        observerSubject.addObserver(observer1);

        observerSubject.notifyObservers();

        verify(observer0,times(1)).react();
        verify(observer1,times(1)).react();
    }

}
