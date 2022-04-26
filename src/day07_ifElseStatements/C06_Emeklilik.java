package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin 65 veya daha buyukse emekli olabilirsin
        //65 ten kucukse calismalisin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas+"sene daha calismalisin");
        }
        //if else statement larda iki durumdan sadece biri calisir
        //ikisinin birden calisma ihtimali =====> yok
        //ikisinin de calismama ihtimali =====> yok
    }
}
