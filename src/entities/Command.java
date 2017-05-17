package entities;

import interfaces.Product;
import utils.ProductComparator;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public class Command {
    private List<Product> products;
    private float maxPrice;

    /**
     *
     * @param maxPrice
     */
    public Command(float maxPrice) {
        this.maxPrice = maxPrice;
        this.products = new ArrayList<Product>();
   }

    /**
     * Ajout un produit à la commande
     * @param p produit à ajouter à la commande
     */
   public void addProduct(Product p) {
        this.products.add(p);
    }

    /**
     * Permet de comparer deux produits
     */
    public void sortProductsByPrice() {
        this.products.sort(new ProductComparator());
    }

    /**
     * Calcule le monant total de la commande
     * @return price : le montant total de la commande
     */
    public float getPrice(){
       float price=0;
       for (Product p:this.products) {
           price += p.getPrice();
       }
       return price;
    }

    public List<Product> getProducts() {
        return products;
    }

    /**
     * V&eacute;rifie si un maxprice est d&eacute;fini
     * @return renvoie le maxPrice si d&eacute;finit sinon renvoie null
     */
    public Float getMaxPrice() {
       // if (this.maxPrice is NaN) {
            return this.maxPrice;
            // TODO on doit test&eacute; si les produits sont sup&eacute;rieux aux maxprice
        //} else {
         //   return null;
       //}
    }

}
