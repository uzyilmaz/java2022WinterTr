package day22_Arrays;

public class C08_Split {
    public static void main(String[] args) {
        // Soru: verilen bir cumlede istenen harfin kac defa kullanildigini
        // yazdiran bir method olusturun

        String cumle="Nerede o 'hello world' yazdiramayan ogrenciler";
        String harf="e";

        harfKacKereKullanilmis(cumle, harf);

    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {
        int sayac=0;

        String karakterler[]=cumle.split("");

        for (int i = 0; i <karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;
            }

        }
        System.out.println("Aradiginiz "+harf+" verilen cumlede "+sayac+" adet kullanılmıs");
    }
}
