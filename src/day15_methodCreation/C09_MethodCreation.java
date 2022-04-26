package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim="oguzhan";
        String soyIsim="BALKAYA";
        String kKno="1234567890123456";

        //eger bir metoddan bir islem yapmasini
        //ve yaptigi islemi bize getirmesini isterseniz
        //return type void degil bize getirecegi sonucun data turunda olmalidir

        String gizlenmisIsimSoyisim=isimSoyisimGizle(isim,soyIsim);

        //bana isim ve soyismin gizlenmis halini getirmesini istiyorum
        //bekledigim donus String olur
        System.out.println(gizlenmisIsimSoyisim);//

        String gizlenmisKKno=krediKartiGizle(kKno);
        System.out.println(gizlenmisKKno);


    }

    private static String krediKartiGizle(String kKno) {
        String yeniKKNo="**** **** **** "+kKno.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyIsim) {
        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yenisoyIsim=soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\S","*");
        //method olusturmada 3. adim:
        //method calisinca sadece birsey mi yazdiracak
        //yoksa bize bir data mı dondurecek buna karar vermektir.
        //Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        //return Type i void degil String sectik
        //ve metodun sonua return edilecek datayı yazdık
        return yeniIsim+" "+yenisoyIsim;
    }
}
