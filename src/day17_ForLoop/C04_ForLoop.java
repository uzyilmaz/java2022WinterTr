package day17_ForLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        //Soru2: 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda
        // virgul olarak ayni satirda yazdirin

        for (int i = 10; i <=30 ; i++) {
           System.out.print(i+", ");

        }


        int baslangic=15;
        int bitis=20;
        for (int i = baslangic; i <=bitis ; i++) {
            if (i<bitis){
                System.out.print(i+", ");
            }else {
                System.out.println(i);
            }

        }

    }
}
