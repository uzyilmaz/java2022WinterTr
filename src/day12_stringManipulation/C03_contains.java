package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String eMail="mulkiyeayboy@gomail.com.tr";
        String arananMetin="@gmail.com";

        if (!eMail.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (eMail.lastIndexOf(arananMetin)==(eMail.length()-10)){
            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen yazimi kontol edin");
        }

    }
}
