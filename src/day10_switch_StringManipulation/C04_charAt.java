package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        //String de herhangi bir karakteri almak istedigimizde o
        // harfin indeksini kullanarak
        //str.charAt(istenenIndex) yazabiliriz
        String str="Java Cok Guzel";

        // "J" yi yazdiralim
        System.out.println(str.charAt(0));

        // G yi yazdiralim

        System.out.println(str.charAt(9));

        //"va" yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3));

        //"cOK" seklinde yazdiralim
        System.out.println(str.toLowerCase().charAt(5)+
                ""+str.toUpperCase().charAt(6)+
        str.toUpperCase().charAt(7));

        //son harfi yazdir
        //String de 14 harf var, son harfin index i 14-1 dir.

        System.out.println(str.charAt(14-1)); //uzunluk -1

        //eger uzunlugu index olarak girersek
        //java calistiktan sonra hata verir
        System.out.println(str.charAt(13-0));
    }
}
