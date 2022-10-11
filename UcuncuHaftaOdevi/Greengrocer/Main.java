import Business.AppleManager;
import Business.CherryManager;
import Business.PearManager;
import Entities.Apple;
import Entities.Cherry;
import Entities.Pear;

public class Main {
    public static void main(String[] args) {

        AppleManager appleManager = new AppleManager();
        CherryManager cherryManager = new CherryManager();
        PearManager pearManager = new PearManager();

        Apple apple = new Apple();
        appleManager.Add(apple,10);

        Cherry cherry = new Cherry();
        cherryManager.Add(cherry,8);

        Pear pear = new Pear();
        pearManager.Add(pear,7.5);

        appleManager.Buy(apple, 2.5);
        System.out.println("Stokta bulunan elma "+appleManager.stockAppleKg+" kilogramdır.");
        cherryManager.Buy(cherry, 11);
        System.out.println("Stokta bulunan kiraz "+cherryManager.stockCherryKg+" kilogramdır.");
        pearManager.Buy(pear, 3.5);
        System.out.println("Stokta bulunan armut "+pearManager.stockPearKg+" kilogramdır.");

    }
}