package entities;

import interfaces.Fries;
import interfaces.Product;
import interfaces.Sandwich;
import interfaces.Soda;
import utils.ProductComparator;

import java.util.Collections;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by ib on 17/05/2017.
 *
 * @author  ib
 */
public class Client {
    private Command command;

    /**
     * Positionnement d'un MaxPrice
     * @param mp Maxprice dauthorfinit manuellement
     */
    public Client(float mp) {
        this.command= new Command(mp);
    }

    public Client() {
        this.command = new Command(0);
    }

    /**
     * Ajout d'un produit par le client
     * @param p produit à ajouter
     */
    public void askFor(Product p) {
        this.command.addProduct(p);
    }

    /**
     * Ajout de plusieurs produits par le client
     * @param p produit à ajouter
     * @param quantity nombre de produits
     */
    public void askFor(Product p, int quantity) {
        while (quantity > 0) {
            this.command.addProduct(p);
            quantity--;
        }
    }

    /**
     * Ajout d'un menu
     * @param sandwich sandwich dauthorsirauthor
     * @param fries frites dauthorsirauthore
     * @param soda
     */
    public  void askForMenu(Sandwich sandwich, Fries fries, Soda soda) {
        this.command.addProduct(new Menu(sandwich,fries,soda));
    }

    public String generateDetailCommand() {
        Currency cur = Currency.getInstance(Locale.getDefault());
        StringBuffer sb = new StringBuffer("\nDauthortail de la commande");
        sb.append("\n");
        for (Product p:this.command.getProducts()) {
            sb.append(p.getName());
            sb.append("\t");
            sb.append((p.getPrice()));
            sb.append("\n");
        }

        sb.append("***************");
        sb.append("\n");
        sb.append("Total");
        sb.append("\t");
        sb.append(this.command.getPrice());
        sb.append(" ");
        sb.append(cur.getSymbol());

        return sb.toString();
    }

    public void showCommand(){
        System.out.println(this.generateDetailCommand());
    }

    public void sortCommand(){
        this.command.sortProductsByPrice();
    }

    public void showLeftMoney(){
        float rest = this.command.getMaxPrice() - this.command.getPrice();
        System.out.println("Solde : "+ rest);
    }
}
