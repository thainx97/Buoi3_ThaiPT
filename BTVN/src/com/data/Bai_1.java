package com.data;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int numb = sc.nextInt();
        if(numb < 2) {
            System.out.printf("%d khong la so nguyen to", numb);
        }
        Boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(numb); i++) {
            if (numb % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.printf("%d la so nguyen to", numb);
        } else  {
            System.out.printf("%d khong la so nguyen to", numb);
        }
    }
}
