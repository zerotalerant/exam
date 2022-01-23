package com.company;

public class Main {
    public static void main(String[] args) {
        char[] array = {'П', 'р', 'о', 'г', 'р', 'а', 'м', 'м', 'и', 'с', 'т'};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
