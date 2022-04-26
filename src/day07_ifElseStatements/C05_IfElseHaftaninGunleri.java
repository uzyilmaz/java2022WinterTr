package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
        //soru3 kullanicidan bir gun ismini alin ve hici ise hici veya hsonu oldugunu
        //yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("girdiginiz gun ismi haftasonu");
        }else{
            System.out.println("girdiginiz gun haftaici");
        }
    }
}
