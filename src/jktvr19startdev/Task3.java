/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdev;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле"); 
        int myArr[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99-10+1)+10;
            System.out.printf("%-3d", myArr[i]);
        }
        int summa = 0;
        int min = 100;
        int max = 0;
        for (int n : myArr) {
            if(n > max) max = n;
            if(n < min) min = n;
            summa += n;
        }
        System.out.println();
        System.out.println("Сумма всех чисел массива: " + summa);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("----- конец задачи 3 ------");
    }
}
