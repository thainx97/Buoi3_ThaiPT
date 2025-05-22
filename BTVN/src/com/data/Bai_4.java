package com.data;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen de in ra bang cuu chuong: ");

        while (true) {
            int numb = sc.nextInt();
            if(numb > 1) {
                for(int i = 1; i <= 10; i++) {
                        System.out.println(numb + " x " + i + "= " + i * numb);
                }
                break;
            } else {
                System.out.println("Nhap vao 1 so nguyen de in ra bang cuu chuong: ");
            }
        }

    }
}
