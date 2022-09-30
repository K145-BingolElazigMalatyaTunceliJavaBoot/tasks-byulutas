package CarRentalCompany.CarsTypes;

import CarRentalCompany.Car;

public class Sedan extends Car {
    private Boolean monthlyRental;

    public Boolean getMonthlyRental() {

        return monthlyRental;
    }

    public void setMonthlyRental(Boolean monthlyRental) {
        if(getDailyRental()==true) {
            this.monthlyRental = false;
        }else{
            this.monthlyRental=monthlyRental;
        }
    }
}
