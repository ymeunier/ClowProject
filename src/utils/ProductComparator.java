package utils;

import interfaces.Product;

import java.util.Comparator;

/**
 * Created by ib on 17/05/2017.
 *
 * @AUTHOR ib
 */
public class ProductComparator implements Comparator<Product> {

    @Override
    /**
     * Compare le prix de deux produits
     * @param a 1er Produit
     * @param b 2nd Produit
     * @return
     */
    public int compare(Product a, Product b) {
        // TODO test à faire
        if (a.getPrice() > b.getPrice()) {
            return 1;
        } else if (a.getPrice() < b.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

}
