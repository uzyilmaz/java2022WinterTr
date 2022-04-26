package day04_dataCasting_increment;

public class C02_AutoWidening {
    public static void main(String[] args) {


        byte sayi1=44;
        System.out.println(sayi1);

        short sayi2=sayi1; //esitligin solu short, sagi ise byte olmasına ragmen
                            // java itiraz etmiyor. Deger olarak atanan data turu
                            //variable data turunden kucuk oldugu icin java sorun yapmaz.
                            //autowidening
        System.out.println(sayi2); // 44

        double sayi3=sayi2;

        System.out.println(sayi3); //44.0



    }
}
