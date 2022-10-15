import entities.Pegasus;
import entities.Person;
import entities.Thy;
import service.BuyService;
import service.FoodService;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BuyService service = new BuyService();
        FoodService foodService=new FoodService();

        Pegasus pegasus = new Pegasus(48);
        pegasus.setAbroadFlight(true);
        pegasus.setDomesticFlight(false);
        pegasus.setBusinessSeat(true);
        pegasus.setEconomicSeat(false);

        Thy thy = new Thy(96);
        thy.setAbroadFlight(false);
        thy.setDomesticFlight(true);
        thy.setBusinessSeat(false);
        thy.setEconomicSeat(true);

        List<String> theSeatsYouWantToBuy = new ArrayList<String>();

        Person person = new Person("Yolcu yolcu");

        theSeatsYouWantToBuy.add("1A");
        theSeatsYouWantToBuy.add("1B");

        System.out.println("Yolcu Bilgileri: "+person.getNameSurname());
        System.out.println("Seçtiğiniz Koltuklar: "+theSeatsYouWantToBuy);

        System.out.println("");

        System.out.println("UÇAKTAKİ BOŞ KOLTUKLAR");
        System.out.println("Türk Hava Yolları İçin Uçaktaki Boş Koltuklar: "+thy.getSeats());
        System.out.println("Pegasus İçin Uçaktaki Boş Koltuklar: "+pegasus.getSeats());

        System.out.println("");

        System.out.println("YEMEK SERVİSİ BİLGİSİ");
        System.out.print("Türk Hava Yolları İçin Yemek Bilgisi: ");
        foodService.FoodService(thy);
        System.out.print("Pegasus İçin Yemek Bilgisi: ");
        foodService.FoodService(pegasus);

        System.out.println("");

        service.buyPegasusSeats(person, pegasus, theSeatsYouWantToBuy);
        service.buyThySeats(person, thy, theSeatsYouWantToBuy);

        System.out.println("BİLET FİYATLARI");
        System.out.println("Türk Hava Yolları İçin Bilet Fiyatları: "+person.getThyTicketPrice());
        System.out.println("Pegasus İçin Bilet Fiyatları: "+person.getPegasusTicketPrice());

        System.out.println("");

        System.out.println("SİZİN ALDIĞINIZ BİLETTEN SONRA UÇAKTAKİ BOŞ KOLTUKLAR");
        System.out.println("Türk Hava Yolları İçin Uçaktaki Boş Koltuklar: "+thy.getSeats());
        System.out.println("Pegasus İçin Uçaktaki Boş Koltuklar: "+pegasus.getSeats());
    }
}