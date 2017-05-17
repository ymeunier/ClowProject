package entities;

import interfaces.Fries;
import interfaces.Product;
import interfaces.Sandwich;
import interfaces.Soda;

/**
 * Created by ib on 16/05/2017.
 *
 * @AUTHOR ib
 */
public class Menu implements Product {
    private Fries fries;
    private Sandwich sandwich;
    private Soda soda;

    /**
     * Permet de composer un menu
     * @param sandwich Nom du Sandwich
     * @param fries Nom de frites
     * @param soda Nom du soda
     */
    public Menu(Sandwich sandwich, Fries fries, Soda soda) {
        this.sandwich = sandwich;
        this.fries = fries;
        this.soda = soda;
    }

    @Override
    /**
     * Fonction permettant d'obtenir le prix d'un menu
     * @return Retourne le prix d'un menu moins les 10 %
     */
    public float getPrice() {
        return  (0.9f * (fries.getPrice() + soda.getPrice() + +sandwich.getPrice()));
    }

    /**
     * Fonction permettant de d&eacute;crire la composition d'un menu
     * @return Retourne le menu compo&eacute;s&eacute; d'une frites / patatoes, d'un Iced Tea / Cola, d'un BigMickey / Nuggets
     */
    @Override
    public String getName() {
        return "Menu : " + fries.getName() + ", " + soda.getName() + ", " +sandwich.getName();
    }

    public Fries getFries() {
        return fries;
    }

    public Soda getSoda() {
        return soda;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

}
