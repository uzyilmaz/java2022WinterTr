package IfElseQuestions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsiniz");
        }else {
            System.out.println("Emekli olabilirsiniz");
        }
    }
}
