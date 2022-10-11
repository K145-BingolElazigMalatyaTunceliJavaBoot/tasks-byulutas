package Business;

import Entities.Cherry;

public class CherryManager implements CherryService{

    public double stockCherryKg=0;
    @Override
    public void Add(Cherry cherry, double kg) {
        cherry.setKg(kg);
    }

    @Override
    public void Buy(Cherry cherry, double kg) {
        if(cherry.getKg()<kg) {
            System.out.println ("Stokta istediğiniz kilogramda kiraz bulunmamaktadır.Stokta bulunan kiraz "+ cherry.getKg() + " kilogramdır." );
            stockCherryKg=cherry.getKg();
        }
        else {
            System.out.println(kg + " kilogram kiraz sepetinize eklendi.");
            stockCherryKg=cherry.getKg()-kg;
        }
    }
}
