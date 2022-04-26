package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b && b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }

        if (a<0)
            System.out.println("suslu parantez olmazsa sadece ilk ; e kadar calisir");

        System.out.println("ikinci satir da calisti");

        //bir if statement in daha anlasilir olmasini istiyorsaniz if body sini
        //suslu parantez icerisine yazmalisiniz. body i suslu parantez icerisine yazmasak
        // dahi if cumlesi calisir ancak ilk ; gordugunda if cumlesi bitmis olur
    }
}
