package singleton;

import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class SingletonTest {

    @Test
    public void shouldBeAbleToGetAnInstanceOfTheSingletonClass() {

        Singleton singleton = Singleton.getInstance();

        assertThat(singleton, instanceOf(Singleton.class));
        assert singleton != null;
    }

    @Test
    public void shouldGetTheSameInstanceEverytime() {

        Singleton instance0 = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertThat(instance0, equalTo(instance1));
        assertThat(instance1, equalTo(instance2));
        assertThat(instance2, equalTo(instance0));

    }

    @Test
    public void SingletonOverrideHashCode()
    {
        Singleton singleton = Singleton.getInstance();
        assertThat(singleton.hashCode(), equalTo(Objects.hash(Singleton.class.getName())));
    }

}
