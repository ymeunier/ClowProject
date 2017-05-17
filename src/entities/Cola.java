package entities;

import interfaces.Soda;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public class Cola implements Soda {
    public String name;
    public float price;

    @Override
    public String getName() {
        return "Cola";
    }

    @Override
    public float getPrice() {
        return (float) 1.50;
    }
}
