package entities;

import java.util.List;

public abstract class Company {
    private String name;
    private List<String> seats;
    private int seatLength;
    private boolean businessSeat;
    private boolean economicSeat;
    private boolean abroadFlight;
    private boolean domesticFlight;
    public boolean isAbroadFlight()
    {
        return abroadFlight;
    }
    public void setAbroadFlight(boolean abroadFlight)
    {
        this.abroadFlight = abroadFlight;
    }
    public boolean isDomesticFlight()
    {
        return domesticFlight;
    }
    public void setDomesticFlight(boolean domesticFlight)
    {
        this.domesticFlight = domesticFlight;
    }
    public boolean isBusinessSeat()
    {
        return businessSeat;
    }
    public void setBusinessSeat(boolean businessSeat)
    {
        this.businessSeat = businessSeat;
    }
    public boolean isEconomicSeat()
    {
        return economicSeat;
    }
    public void setEconomicSeat(boolean economicSeat)
    {
        this.economicSeat = economicSeat;
    }
    public int getSeatLength()
    {
        return seatLength;
    }
    public void setSeatLength(int seatLength)
    {
        this.seatLength = seatLength;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<String> getSeats()
    {
        return seats;
    }
    public void setSeats(List<String> seats)
    {
        this.seats = seats;
    }
}