package launcher;

import entities.*;

/**
 * Created by ib on 17/05/2017.
 *
 * @AUTHOR ib
 */
public class Launcher {
    public static void main(String[] args) {

        Client c = new Client(20);
        c.askForMenu(new Nuggets(),new Patatoes(),new Cola());
        c.showCommand();
        c.showLeftMoney();

        Client d = new Client(70);
        d.askFor(new BigMickey());
        d.askFor(new IcedTea(),4);
        d.showCommand();
        d.showLeftMoney();
    }
}
