package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        // Soru: kac tane String verilirse verilsin
        //iclerinden en uzun olani yazdiran bir method olusturun
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Kerimanteyze";
        //Yazilan argument sayisis sabitse her zamanki gibi bir method olusturabiriz
        //ancak argument sayisinin degisme ihtimali varsa
        //o zaman varargs tercih edilir

        enUzunKelime(str1,str2,str3,str4);
    }

    private static void enUzunKelime(String... str) {
        String enUzunstr="";

        for (String each:str) {
            if (each.length()>enUzunstr.length()){
                enUzunstr=each;
            }
        }
        System.out.println("En uzun kelime: "+enUzunstr);
    }

}
