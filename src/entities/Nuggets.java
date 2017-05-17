package entities;

import interfaces.Sandwich;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public class Nuggets implements Sandwich {
    public String name;
    public float price;

    @Override
    public String getName() {
        return "Nuggets";
    }

    @Override
    public float getPrice() {
        return (float) 4.30;
    }

}
