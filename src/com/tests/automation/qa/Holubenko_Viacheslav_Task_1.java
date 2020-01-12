package com.tests.automation.qa;

/*
1.	Составить алгоритм: если введенное число больше 7, то вывести “Привет”
*/

import java.util.Scanner;

public class Holubenko_Viacheslav_Task_1 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");

            if (scanner.hasNextInt()) {
                if (scanner.nextInt() > 7) {
                    System.out.println("Привет");
                }
            } else {
                System.out.println("Вы ввели не целое число!");
            }
            scanner.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}