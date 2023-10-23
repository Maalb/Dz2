package dz2Zadachi;

public class Dz2Hard {
    public static void main(String[] args) {
        int god = 104;
        if (god%100==0 && god%400!=0 ){
            System.out.println("Не високосный");
        }else if(god%4==0){
            System.out.println("Високосный");
        }else {
            System.out.println("Не високосный");
        }

    }
}
