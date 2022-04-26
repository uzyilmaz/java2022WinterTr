package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //Soru: kullanicidan iki tamsayi alip
        //bu sayilari ve aralarindaki tum sayilari yazdiran
        //bir kod olusturun
    int baslangic=40;
    int bitis=60;


        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //ayni soruyu while loop ile yapalim
int i=baslangic;
        while (i<=bitis){
            System.out.print(baslangic+ " ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic); //while ile yaptıktan sonra baslangic degeri 60 olur.
                                        //buna engel olmak icin baslangıc degerini "i" ye atadık
    }
}
