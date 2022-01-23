package com.company;

import java.util.Scanner;

import static com.company.Main.Test.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int p = scanner.nextInt();
        System.out.print("Введите степень: ");
        double n = scanner.nextDouble();
        System.out.println("Ответ: " + power(p, n));
        System.out.println("Shor: " + aShortPower(p, n));
        System.out.println("Int: " + anIntPower(p, n));
        System.out.println("Long: " + aLongPower(p, n));
        System.out.println("Float: " + aFloatPower(p, n));
    }
    public class Test {
        static double power(int p, double n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * p;
            }
            return result;
        }

        @Overload
        static short aShortPower(int p, double n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * p;
            }
            return (short) result;
        }

        @Overload
        static int anIntPower(int p, double n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * p;
            }
            return result;
        }

        @Overload
        static long aLongPower(int p, double n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * p;
            }
            return result;
        }

        @Overload
        static float aFloatPower(int p, double n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * p;
            }
            return result;
        }
    }
}