package iterator.implementations;

import iterator.AbstractCollection;
import iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

public class ProductsCollection implements AbstractCollection<AbstractIterator> {

    private List<Product> productList = new ArrayList<Product>();

    @Override
    public AbstractIterator getIterator() {
        return new DefaultIterator(productList);
    }

    private void initialize()
    {
        productList.add(new Product());
        productList.add(new Product());
        productList.add(new Product());
    }

    public class Product{

    }
}
