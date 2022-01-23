package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество домов на улице: ");
        int size = scanner.nextInt();
        System.out.println("Заполните улицу номерами домов, в вашем случае до : " + size);
        int array[] = new int[size];
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0) {
                chet = chet + array[i];
            } else
                nechet = nechet + array[i];
        }
        if (chet > nechet) {
            System.out.println("В чётных домах больше жителей!");
        } else
            System.out.println("В нечётных домах больше жителей!");
    }
}