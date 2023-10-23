package dz2Zadachi;

public class Dz2Medium {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 17;
        int d = 0;
        if (a > b) {
            d = b;
            b = a;
            a = d;
        }
        if (b > c) {
            d = c;
            c = b;
            b = d;
        }
        if (a > b) {
            d = b;
            b = a;
            a = d;
        }
        System.out.println("Меньшее: " + a + ", Среднее: " + b + ", Болшее: " + c);
    }
}
