package day18_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        //Soru: kullanicidan bir rakam alip carpim tablosu olusturalim

        int input=5;

        //1 2 3     1*1 1*2 1*3
        //2 4 6     2*1 2*2 2*3
        //3 6 9     3*1 3*2 3*3

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");//bu print in tek gorevi satiri aşagiya gecirmek

        } //outer loop bir deger aldiginda inner loop baştan sona çalışır
        //sonra outer loop deger degistirdiginde inner loop tekrar baştan sona çalışır ve dongu
        //outer loop broken olana kadar devam eder
    }
}
