package day34_deneme;

import day34_accesModifier_encapsulation.C01;

public class DenemeChild extends C01 {
    public static void main(String[] args) {
        System.out.println(halkaAcikSayi);
        halkaAcikSayi=30;
        C01.aileyeOzel=25; // aileyeOzel in access modifier protected oldugu
                            // ve bu class C01 in childclass i oldugu icin
                            // farkli bir package dan aileyeOzel e ulasabildik


    }

}
