package CarRentalCompany;

import CarRentalCompany.CarsTypes.Hatchback;
import CarRentalCompany.CarsTypes.Sedan;
import CarRentalCompany.CarsTypes.Suv;

public class RentalTransactions {

    public void getList(Customer customer){
        if (customer.getRol()== Role.COMPANY){
            System.out.println("Tüm araçlar listelendi.");
        }
        else if (customer.getRol()==Role.CITIZEN){
            System.out.println("Sadece Hatchback tipindeki arabalar listelendi.");
        }
        else {
            System.out.println("Sisteme giriş yapınız.");
        }
    }

    public void rentalHatchback(Hatchback hatchback,Customer customer){
        int totalPrice=350;
        if(hatchback.getDailyRental()==true){
            System.out.println("Hatchback tipindeki arabayı " +totalPrice+ "₺ fiyatla günlük olarak kiraladınız.");
        }
    }

    public void rentalSedan(Sedan sedan, Customer customer){
        if(customer.getRol()== Role.COMPANY){
            int totalPrice;
            if(sedan.getDailyRental()==true) {
                totalPrice=350;
                System.out.println("Sedan tipindeki arabayı "+totalPrice+"₺ fiyatla günlük kiraladınız.");
            }
            if(sedan.getMonthlyRental()==true) {

                totalPrice=300*30;
                System.out.println("Sedan tipindeki arabayı "+totalPrice+"₺ fiyatla aylık kiraladınız.");
            }
        }
        else {
            System.out.println("Müşteri hesabıyla giriş yaptığınız için sedan tipindeki arabaları kiralayamazsınız.");
        }
    }
    public void rentalSuv(Suv suv, Customer customer){
        int totalPrice;
        int age=2022-suv.getModelYear();
        if(customer.getRol()== Role.COMPANY){
            if(suv.getDailyRental()==true) {
                totalPrice=350*age/100;
                System.out.println("Suv tipndeki arabayı "+totalPrice+"₺ fiyatla günlük kiraladınız.");
            }
            if(suv.getMonthlyRental()==true) {
                totalPrice=300*age/100*30;
                System.out.println("Suv tipndeki arabayı "+totalPrice+"₺ fiyatla aylık kiraladınız.");
            }
        }
        else {
            System.out.println("Müşteri hesabıyla giriş yaptığınız için suv tipindeki arabaları kiralayamazsınız.");
        }
    }
}
