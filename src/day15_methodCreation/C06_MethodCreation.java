package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //iki variable in degerlerini toplayan bir method olusturalim
        //1.adim: method adini yazalim.
        //methoda göndermem gereken argument var mi?
        ikiSayiTopla(25,50);

        C04.dortHarfiTersineCevir("Sema");

    }
    //bir methodu olusturmak calismasi için yeterli degildir.
    //method ancak cagrilirsa calisir
    //aynı class veya farkli class ta olmasinin hicbir onemi yoktur
    //java main method da yukaridan asagiya dogru calisir
    //ve geldigi satiri calistirir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami: "+(a+b));
    }
}
