package Business;

import Entities.Pear;

public class PearManager implements  PearService{

    public double stockPearKg=0;
    @Override
    public void Add(Pear pear, double kg) {
        pear.setKg(kg);
    }

    @Override
    public void Buy(Pear pear, double kg) {
        if(pear.getKg()<kg) {
            System.out.println ("Stokta istediğiniz kilogramda armut bulunmamaktadır.Stokta bulunan armut "+ pear.getKg() + " kilogramdır." );
            stockPearKg=pear.getKg();
        }
        else {
            System.out.println(kg + " kilogram armut sepetinize eklendi.");
            stockPearKg=pear.getKg()-kg;
        }
    }
}
