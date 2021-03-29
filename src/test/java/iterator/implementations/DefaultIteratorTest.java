package iterator.implementations;

import iterator.AbstractIterator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DefaultIteratorTest {

    private final List collection = Arrays.asList("a", "b", "c");

    @Test
    public void shouldBeAbleToGetTheFirstElement() {
        AbstractIterator iterator = new DefaultIterator<String>(collection);
        assertThat(iterator.getFirst(), equalTo("a"));
    }

    @Test
    public void shouldBeAbleToIterateThroughAllTheItems() {
        StringBuilder builder = new StringBuilder();
        AbstractIterator iterator = new DefaultIterator<String>(collection);

        String next = (String) iterator.getNext();

        while (next != null) {

            builder.append(next);
            next = (String) iterator.getNext();
        }

        assertThat(builder.toString(), equalTo("abc"));

    }
}
