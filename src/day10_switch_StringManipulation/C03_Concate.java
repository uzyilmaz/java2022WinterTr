package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        //

        String str1="Java";
        String str2="Candir";

        // Java Candir yazdiralim

        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2); //JavaCandir
        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

        //concat icine String degil de sayi veya boolean deger yazsak?
        //concat method u icine String parametre ister
        //String disinda bir data turu String haline getirilmelidir.
    }
}
