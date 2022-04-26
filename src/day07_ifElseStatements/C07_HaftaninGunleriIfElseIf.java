package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //soru3 kullanicidan bir gun ismini alin ve hici ise hici veya hsonu oldugunu
        //yazdirin. Eger gun ismini yanlis girerse "yanlis giris" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun haftaici");
        }else {
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }
        } //eger if else if....statement else ile bitiyorsa olasiliklardan sadece bir tanesi
            //mutlaka calisir.
        //Java ilk buldugu true ya ait sonucu yazdirir ve kalan sartlara bakmaz

        //if else if... cumleleri else ile bitmese de calisir.
        //ancak bu durumda sadece bir olasilik calisabilir veya hic bir
        // islem yapilmayabilir.
    }



