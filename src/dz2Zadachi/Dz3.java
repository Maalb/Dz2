package dz2Zadachi;

public class Dz3 {
    public static void main(String[] args) {
        int value = 15;
        int a = 1;
        while (a <= value){
            for (int i=1; i<=value; i++){
                if (a * i == value){
                    System.out.println(a+ " "+ i);
                }
            }
            a++;
        }
    }
}
