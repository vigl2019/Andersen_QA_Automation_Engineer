package com.tests.automation.qa;

/*
3.	Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */

public class Holubenko_Viacheslav_Task_3 {

    private static int[] arrNumbers = {5, 1, 55, 108, 115, 235, 9, 12, 38, 15};

    public static void main(String[] args) {

        System.out.println("Исходные элементы массива");

        for (int i = 0; i < arrNumbers.length; i++) {
            printArrElements(i);
        }

        System.out.printf("%n%n");
        System.out.println("Элементы массива, кратные 3");

        for (int i = 0; i < arrNumbers.length; i++) {
            if ((arrNumbers[i] % 3) == 0) {
                printArrElements(i);
            }
        }
    }

    private static void printArrElements (int i){
        if (i == (arrNumbers.length - 1)) {
            System.out.print(arrNumbers[i] + ".");
        } else {
            System.out.print(arrNumbers[i] + "; ");
        }
    }
}