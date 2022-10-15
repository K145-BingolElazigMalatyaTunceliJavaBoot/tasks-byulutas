package entities;

import service.SeatService;

public class Pegasus extends Company{
    public Pegasus(int seatLength)
    {
        this.setName("Pegasus");
        this.setSeatLength(seatLength);
        this.setSeats(SeatService.seatService(getSeatLength()));
    }
}
