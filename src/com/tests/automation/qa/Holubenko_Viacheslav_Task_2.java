package com.tests.automation.qa;

/*
2.	Составить алгоритм: если введенное имя совпадает с Вячеслав,
то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Holubenko_Viacheslav_Task_2 {
    public static void main(String[] args) {

        System.out.print("Введите имя: ");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();

            if (name.trim().toUpperCase().equals("ВЯЧЕСЛАВ")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}