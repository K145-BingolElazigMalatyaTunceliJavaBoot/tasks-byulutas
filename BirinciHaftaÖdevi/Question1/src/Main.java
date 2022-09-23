/**
 * Okul puanlarının harf karşılığını yazan program.
 * Random alınabilir değerler.
 * 0 - 35 arası FF
 * 35 - 50 arası DC
 * 50 - 70 arası BB
 * 70 - 100 arası AA
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int dersnotu = random.nextInt(100);

        if (dersnotu >= 70 && dersnotu <= 100) {
            System.out.println("Ders Notunuz:"+ dersnotu + "\n" + "Harf Notu Karşılığı:AA");
        } else if (dersnotu >= 50 && dersnotu <= 70) {
            System.out.println("Ders Notunuz:"+ dersnotu + "\n" + "Harf Notu Karşılığı:BB");
        } else if (dersnotu >= 35 && dersnotu <= 50) {
            System.out.println("Ders Notunuz:"+ dersnotu + "\n" + "Harf Notu Karşılığı:DC");
        } else if(dersnotu >=0 && dersnotu < 35)  {
            System.out.println("Ders Notunuz:"+dersnotu + "\n" + "Harf Notu Karşılığı:FF");
        }
    }
}