package day20_scope_Arrays;

public class C01_InstanceVariables {

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {
       //sayi=10; //sayi variable i static olmadigi icin main method dan direk kullanılamaz
       //cünkü main method static bir method. Instance variable lara static methodlardan
       //ulasabilmek icin obje oluşturmamiz gerekir

       C01_InstanceVariables obj1=new C01_InstanceVariables();
        System.out.println(obj1.sayi); //0 default olarak java 0 atar.

        //sayi variable ına yeni deger atamak için
        obj1.sayi=10;
        System.out.println(obj1.sayi); //10

        obj1.bransIsmi="SQL";


        System.out.println(obj1.okuldaMi); //false : cunku obj1 e okulAcikmi icin bir deger atanmadi
                                            //dolayısıyla default degeri yani false yazdirir

        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi); //0
        System.out.println(obj2.bransIsmi);//Java

        obj1.okuldaMi=true;

        System.out.println(obj2.okuldaMi);




    }
}
