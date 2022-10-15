package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String nameSurname;
    private List<String> selectedseats = new ArrayList<String>();
    private int thyTicketPrice;
    private int pegasusTicketPrice;
    public Person(String nameSurname)
    {
        this.nameSurname = nameSurname;
    }
    public String getNameSurname()
    {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname)
    {
        this.nameSurname = nameSurname;
    }
    public List<String> getSelectedseats()
    {
        return selectedseats;
    }
    public void setSelectedseats(List<String> selectedseats)
    {
        this.selectedseats = selectedseats;
    }
    public int getThyTicketPrice()
    {
        return thyTicketPrice;
    }
    public void setThyTicketPrice(int thyTicketPrice)
    {
        this.thyTicketPrice = thyTicketPrice;
    }
    public int getPegasusTicketPrice()
    {
        return pegasusTicketPrice;
    }
    public void setPegasusTicketPrice(int pegasusTicketPrice)
    {
        this.pegasusTicketPrice = pegasusTicketPrice;
    }
}
