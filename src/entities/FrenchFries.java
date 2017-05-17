package entities;

import interfaces.Fries;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public class FrenchFries implements Fries {
    private String name;
    private float price;

    @Override
    public String getName() {
        return "French Fries";
    }

    @Override
    public float getPrice() {
        return (float) 1.90;
    }

}
