package service;

import entities.Company;
import entities.Pegasus;
import entities.Person;
import entities.Thy;

import java.util.List;


public class BuyService {
    public void buyThySeats(Person person, Thy thy, List<String> seats)
    {
        List<String> companySeats = thy.getSeats();
        for(String seat : seats)
        {
            if(!companySeats.contains(seat))
            {
                System.err.println("Seçtiğiniz koltuk bu uçakta yok. Olan koltuklar satın alındı.");
            }
            else
            {
                List<String> strings = person.getSelectedseats();
                companySeats.remove(seat);
                strings.add(seat + thy.getName());
                person.setSelectedseats(strings);
                PriceThySeat(person,thy);
            }
        }
        thy.setSeats(companySeats);
    }
    public void buyPegasusSeats(Person person, Pegasus pegasus, List<String> seats)
    {
        List<String> companySeats = pegasus.getSeats();
        for(String seat : seats)
        {
            if(!companySeats.contains(seat))
            {
                System.err.println("Seçtiğiniz koltuk bu uçakta yok. Olan koltuklar satın alındı.");
            }
            else
            {
                List<String> strings = person.getSelectedseats();
                companySeats.remove(seat);
                strings.add(seat + pegasus.getName());
                person.setSelectedseats(strings);
                PricePegasusSeat(person,pegasus);
            }
        }
        pegasus.setSeats(companySeats);
    }
    public static void PriceThySeat(Person person, Thy thy) {
        int price = 0;
        if(thy.isBusinessSeat()==true &&  thy.isAbroadFlight()==true)
        {
            price = 2000*2;
        }
        else if(thy.isBusinessSeat()==true &&  thy.isDomesticFlight()==true)
        {
            price=2000;
        }
        else if(thy.isEconomicSeat()==true && thy.isAbroadFlight()==true)
        {
            price=1000*2;
        }
        else if(thy.isEconomicSeat()==true && thy.isDomesticFlight()==true)
        {
            price=1000;
        }
        person.setThyTicketPrice(price);
    }
    public static void PricePegasusSeat(Person person, Pegasus pegasus) {
        int price = 0;
        if(pegasus.isBusinessSeat()==true &&  pegasus.isAbroadFlight()==true)
        {
            price = 3000*2;
        }
        else if(pegasus.isBusinessSeat()==true &&  pegasus.isDomesticFlight()==true)
        {
            price=3000;
        }
        else if(pegasus.isEconomicSeat()==true && pegasus.isAbroadFlight()==true)
        {
            price=2000*2;
        }
        else if(pegasus.isEconomicSeat()==true && pegasus.isDomesticFlight()==true)
        {
            price=2000;
        }
        person.setPegasusTicketPrice(price);
    }
}
