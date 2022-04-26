package IfElse_NestedIfElse_Questions;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir yil giriniz");
        int yil= scan.nextInt();

        if (yil%4!=0) System.out.println("artik yil degildir");
        if (yil%4==0)
        {
            if (yil%100==0)
            {if (yil%400!=0) {
                    System.out.println("artik yil degildir");
                }
                else {
                System.out.println("artik yildir");
            }
            }
            else {
                System.out.println("artik yildir");
            }
        }
        }}








