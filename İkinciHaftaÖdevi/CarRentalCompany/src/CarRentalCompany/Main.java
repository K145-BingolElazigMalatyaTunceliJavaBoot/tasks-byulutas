package CarRentalCompany;

import CarRentalCompany.CarsTypes.Hatchback;
import CarRentalCompany.CarsTypes.Sedan;
import CarRentalCompany.CarsTypes.Suv;

public class Main {
    public static void main(String[] args) {

        Hatchback hatchback = new Hatchback();
        Suv suv = new Suv();
        Sedan sedan = new Sedan();

        //Kiralama İşlemleri ekleme
        RentalTransactions rentalTransactions=new RentalTransactions();

        //Vatandaş ekleme
        Customer vatandas = new Customer("Vatandaş",Role.CITIZEN);
        //Şirket ekleme
        Customer sirket = new Customer("Şirket",Role.COMPANY);

        // Hatchback araç ekleme
        hatchback.setLuggageCapacity(100);
        hatchback.setDailyRental(true);
        hatchback.setColor("white");
        hatchback.setModelYear(1997);

        //Sedan araç ekleme
        sedan.setLuggageCapacity(200);
        sedan.setDailyRental(false);
        sedan.setMonthlyRental(true);
        sedan.setColor("black");
        sedan.setModelYear(1998);

        //Suv araç ekleme
        suv.setLuggageCapacity(300);
        suv.setDailyRental(false);
        suv.setMonthlyRental(true);
        suv.setColor("red");
        suv.setModelYear(1999);

        System.out.println("");
        rentalTransactions.getList(vatandas);
        System.out.println("");
        rentalTransactions.getList(sirket);
        System.out.println("");
        rentalTransactions.rentalHatchback(hatchback,vatandas);
        System.out.println("");
        rentalTransactions.rentalHatchback(hatchback,sirket);
        System.out.println("");
        rentalTransactions.rentalSedan(sedan,vatandas);
        System.out.println("");
        rentalTransactions.rentalSedan(sedan,sirket);
        System.out.println("");
        rentalTransactions.rentalSuv(suv,vatandas);
        System.out.println("");
        rentalTransactions.rentalSuv(suv,sirket);
    }
}