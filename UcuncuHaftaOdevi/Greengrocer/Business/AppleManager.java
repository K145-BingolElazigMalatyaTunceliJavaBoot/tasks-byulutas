package Business;

import Entities.Apple;

public class AppleManager implements AppleService{

    public double stockAppleKg=0;
    @Override
    public void Add(Apple apple, double kg) {
        apple.setKg(kg);
    }

    @Override
    public void Buy(Apple apple, double kg) {
        if(apple.getKg()<kg) {
            System.out.println ("Stokta istediğiniz kilogramda elma bulunmamaktadır.Stokta bulunan elma "+ apple.getKg() + " kilogramdır." );
            stockAppleKg=apple.getKg();
        }
        else {
            System.out.println(kg + " kilogram elma sepetinize eklendi.");
            stockAppleKg=apple.getKg()-kg;
        }
    }
}
