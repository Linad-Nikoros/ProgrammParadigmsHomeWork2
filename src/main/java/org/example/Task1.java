package org.example;

public class Task1 {
//    Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
//    Обоснуйте выбор парадигм.
    public static void MultiplicationTable() {
        for(int i =0; i <= 9; i++) {
            for(int j =0; j <= 9; j++) {
                int multiplySumm = i * j;
                System.out.println(i + "*" + j + "=" + multiplySumm);
            }
            System.out.println();
        }
    }
}
