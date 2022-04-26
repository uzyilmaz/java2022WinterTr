package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //Parametre olarak bir int ve istediginiz kadar
        //string alan en uzun kelimenin harf sayisi ile int parametre
        // degerini carpip sonucu yazdiran bir method olusturun

        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);
        // Bir method da varargs disinda parametre kullanacaksak once diger
        // parametreleri yazip varargs i en sona yazmaliyiz
        // Bu sebeple bir method da bir den fazla varargs olamaz

    }

    private static void carpim(int sayi, String... str) {
        String enUzunstr="";

        for (String each:str) {
            if (each.length()>enUzunstr.length()){
                enUzunstr=each;
            }
        }
        System.out.println("Istenen deger: "+sayi*enUzunstr.length());
    }
}
