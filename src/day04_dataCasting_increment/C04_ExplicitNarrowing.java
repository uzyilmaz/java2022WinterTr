package day04_dataCasting_increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2; //87.9
        System.out.println(sayi3);

        int sayi4=(int)(sayi1/sayi2); //87.9
                                //deger double, variable int
                                // yani variable daha dar
                                //dolayısıyla java bunu otomatik olarak yapmaz
                                //sorumlulugu ustlenmemizi ister
                                //sag tarafa yazdıgımız (int) sorumluluk bende demek

        System.out.println(sayi4);//87

        int sayi5=-130;
        byte sayi6=(byte)sayi5; //kabul etmedi cunku sag taraftaki deger int>sol taraftaki deger variable byte

        System.out.println(sayi6);

        sayi5=260;
        sayi6=(byte)sayi5; //kabul etmedi cunku sag taraftaki deger int>sol taraftaki deger variable byte

        System.out.println(sayi6);

        sayi5=55;
        sayi6=(byte)sayi5; //kabul etmedi cunku sag taraftaki deger int>sol taraftaki deger variable byte

        System.out.println(sayi6);
    }
}
