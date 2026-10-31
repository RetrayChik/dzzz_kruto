package com.retraychik.untitled1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int a = sc.nextInt();
        if(a % 10000 < 10 && a % 10000 >= 0){
            System.out.println("DIGIT");
        } else if (a % 10000 < 100 && a % 10000 > 0) {
            System.out.println("NUM");
        } else{
            System.out.println("OTHER");
        }
    }
}