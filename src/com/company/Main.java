package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор символов: ");
        String pldrm = scanner.nextLine();
        boolean palindrom = true;
        for (int i = 0; i <= pldrm.length() - 1; i++) {
            for (int j = pldrm.length() - 1; j >= 0; j--) {
                if (pldrm.charAt(i) != pldrm.charAt(j)) {
                    palindrom = false;
                } else {
                    palindrom = true;
                }
            }
        }
        System.out.println(palindrom);
    }
}
