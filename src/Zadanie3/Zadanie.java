package Zadanie3;

public class Zadanie {

    public static void main(String[] args){

        int a = 0;
        int b = 100;

        int c = (int)(Math.random()*(b-a+1)+a);
        System.out.println("Losowy wynik wynosi (1 - 100): " + c);

        if((c % 2) == 0)
        {
            System.out.println("Liczba jest parzysta");
        }else{
            System.out.println("Liczba jest nieparzysta");
        }



    }

}
