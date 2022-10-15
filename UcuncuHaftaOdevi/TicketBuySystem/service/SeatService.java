package service;

import java.util.ArrayList;
import java.util.List;

public class SeatService {
    public static List<String> seatService(int seatLength)
    {
        List<String> seats = new ArrayList<String>();
        final String[] seatLetterCode = {"A", "B", "C", "D", "E", "F"};
        for(int i = 1; i < (seatLength/6)+1; i++)
        {
            for(int j = 0; j < seatLetterCode.length; j++)
            {
                seats.add(i+""+seatLetterCode[j]);
            }
        }
        return seats;
    }
}
