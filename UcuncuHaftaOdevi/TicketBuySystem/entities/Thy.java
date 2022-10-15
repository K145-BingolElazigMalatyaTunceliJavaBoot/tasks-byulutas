package entities;

import service.SeatService;

public class Thy extends Company{
    public Thy(int seatLength)
    {
        this.setName("Türk Hava Yolları");
        this.setSeatLength(seatLength);
        this.setSeats(SeatService.seatService(getSeatLength()));
    }
}
