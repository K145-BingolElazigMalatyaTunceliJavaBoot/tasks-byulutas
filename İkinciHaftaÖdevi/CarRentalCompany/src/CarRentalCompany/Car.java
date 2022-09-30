package CarRentalCompany;
public class Car {
    private int luggageCapacity;
    private Boolean dailyRental;
    private String color;
    private  int modelYear;

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public Boolean getDailyRental() {
        return dailyRental;
    }

    public void setDailyRental(Boolean dailyRental) {
        this.dailyRental = dailyRental;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
}
