package oop;

public class Loops {
    int liczba = 1;
    static int[] liczby;
    //tak to się robi

    public static void main(String[] args) {
        liczby = new int[5]; //dokładnie tak
        liczby[0] = 1;
        liczby[1] = 12;
        liczby[2] = 123;
        liczby[3] = 1234;
        liczby[4] = 12345;//jeszcze jak

        //for(int number : liczby){
        //    System.out.println("Liczba: " + number);
        //}

        //for(int i = 0; i < 3; i++){
        //  System.out.println("Liczba: " + liczby[i]);
        //}

        //for(int i = 0; i < 10; i++){
        //    System.out.println("Counter: " + i);
        //}

        for(long i = 1 ;; i *= 2){
            System.out.println(i);
            if(i == 0){
                break;
            }
        }

    }
}
