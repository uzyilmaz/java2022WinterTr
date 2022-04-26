package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

       //soru3 kullanicidan bir gun ismini alin ve hici ise hici veya hsonu oldugunu
        //yazdirin
        //String icin equals metodunu kullanin

        //String case sensitive dir. Yani pazar, Pazar, PAZAR bunlar hep farklı
        //kelimelerdir
        //bu durumda String metodlarindan yardım aliriz


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase(); //kullanici nasil yazarsa yazsin biz kucuk harfe
                                                    //ceviriyoruz
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun ismi haftasonu");
        }
        if (gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("carsamba")||gunIsmi.equals("persembe")||gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");
        }






        }


}
