package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        String str="  Siz ne derseniz deyin, Java bildigini okur.  ";

        str.trim();
        System.out.println(str);// bosluklu yazdirir cunku atama yok
        System.out.println(str.length());

        str=str.trim();
        System.out.println(str);//bosluksuz yazdirir cunku atama yapildi
        System.out.println(str.length());


    }
}
