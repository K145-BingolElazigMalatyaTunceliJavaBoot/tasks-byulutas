/**
 * 3 ile 100 arasında asal sayıların toplamını bulan program.
 */

public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 3; i <= 100; i++) {
            int kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol++;
                    break;
                }
            }
            if (kontrol==0) {
                toplam += i;
            }
        }
        System.out.println("3 ile 100 sayıları arasındaki asal sayıların toplamı:" + toplam);
    }
}