package entities;

import interfaces.Sandwich;

/**
 * Created by ib on 16/05/2017.
 *
 * @author ib
 */
public class BigMickey implements Sandwich {
    public String name;
    public float price;

    @Override
    public String getName() {
        return "Big Mickey";
    }

     @Override
    public float getPrice() {
        return (float) 2.70;
    }

}
