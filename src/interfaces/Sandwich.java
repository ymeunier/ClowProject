package interfaces;

import interfaces.Product;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public interface Sandwich extends Product {
    @Override
    String getName();

    @Override
    float getPrice();
}
