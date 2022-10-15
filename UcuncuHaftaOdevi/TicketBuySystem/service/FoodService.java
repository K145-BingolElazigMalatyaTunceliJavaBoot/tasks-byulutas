package service;

import entities.Pegasus;
import entities.Thy;

public class FoodService {
    public void FoodService(Pegasus pegasus)
    {
        if(pegasus.isAbroadFlight()==true)
        {
            System.out.println("Yurt dışı uçuşlarımızda yemek servisimiz yoktur.");
        }
        else if(pegasus.isDomesticFlight()==true)
        {
            System.out.println("Yurtiçi uçuşlarımızda yemek servisimiz vardır.");
        }
    }
    public void FoodService(Thy thy)
    {
        if(thy.isAbroadFlight()==true)
        {
            System.out.println("Yurt dışı uçuşlarımızda yemek servisimiz vardır.");
        }
        else if(thy.isDomesticFlight()==true)
        {
            System.out.println("Yurtiçi uçuşlarımızda yemek servisimiz vardır.");
        }
    }
}
