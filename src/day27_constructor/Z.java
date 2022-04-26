package day27_constructor;

public class Z {

    String isim;
    String soyIsim;
    int numara;
    boolean gercekMi;


    public Z(String ism, String soyism, int no, boolean grc) {
        isim=ism;
        soyIsim=soyism;
        numara=no;
        gercekMi=grc;

    }

    public Z(String isim, String soyIsim, int numara) {
        this.isim=isim;
        this.soyIsim=soyIsim;
        this.numara=numara;
    }

    public String toString(){

        return ("Isim: "+isim+", Soyisim: "+soyIsim+", numara: "+numara);
    }
}
