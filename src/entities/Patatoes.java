package entities;

import interfaces.Fries;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public class Patatoes implements Fries {
    public String name;
    public float price;

    @Override
    public String getName() {
        return "Patatoes";
    }

    @Override
    public float getPrice() {
        return (float) 2.70;
    }
}
