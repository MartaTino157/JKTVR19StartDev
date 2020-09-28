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
public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int n = 5;
        Random random = new Random();
        int myArr[][] = new int[10][];
        for (int i = 0; i < myArr.length; i++) {
            while(n<10){
                myArr[i] = new int[n];
                for (int j = 0; j < myArr[i].length; j++) {
                    myArr[i][j] = random.nextInt(99-10+1)+10;
                    System.out.printf("%3d",myArr[i][j]);
                }
                System.out.println();
                n++;
            }
        }
        System.out.println();
        System.out.println("----- конец задачи 6 ------");
    }
}
