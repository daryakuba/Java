package ru.mirea.lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Введите строку из слов");
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                counter++;
            }
        }
        counter++;
        System.out.println("Количество слов в строке: " + counter);
    }
}
