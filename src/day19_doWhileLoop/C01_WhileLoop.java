package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //Soru: Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve
        // toplam kac tane olduklarini ekranda yazdirin

        int input=30;

        //bu soruyu for loop ile de yapabiliriz ancak biz whileloop ile yapalım
        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen+" ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input+" sayisini bolen "+sayac+" adet sayi vardir");
    }
}
