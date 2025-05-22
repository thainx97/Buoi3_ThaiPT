package com.data;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi van ban: ");
        String text = sc.nextLine();
        System.out.println("Nhap vao tu can tim: ");
        String find = sc.nextLine();
        int index = text.indexOf(find);
        if(index != -1) {
            System.out.println("Tu" + find + " xuat hien o vi tri thu " + index);
        } else {
            System.out.println("Tu " + find + " khong xuat hien trong chuoi" );
        }
    }
}
