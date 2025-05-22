package com.data;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        int total = 0;
        System.out.println("Nhap vao cac so nguyen (0 de dung lai): ");
        while (true) {
             numb = sc.nextInt();
            if(numb == 0) {
                break;
            }
            total = total + numb;
        }
        System.out.printf("Tong day so la: %d", total);
    }
}
