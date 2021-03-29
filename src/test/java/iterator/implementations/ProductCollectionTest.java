package iterator.implementations;

import iterator.AbstractCollection;
import iterator.AbstractIterator;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProductCollectionTest {

    @Test
    public void shouldBeAbleToIterateACollectionsOfProducts(){

        AbstractCollection collection= new ProductsCollection();
        AbstractIterator iterator = (DefaultIterator) collection.getIterator();

        ProductsCollection.Product p =(ProductsCollection.Product) iterator.getNext();

        while (p != null)
        {
            assertThat(p, instanceOf(ProductsCollection.Product.class));
            p = (ProductsCollection.Product) iterator.getNext();
        }
    }
}
