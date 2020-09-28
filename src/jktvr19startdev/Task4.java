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
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        Random random = new Random();
        for (int i=0; i < myArr.length; i++) {
            while(true){
                int evenNum = random.nextInt(99-0+1)+0;
                if(evenNum % 2 == 0){
                    myArr[i] = evenNum;
                    System.out.printf("%-3d", myArr[i]);
                    break;
                }
            } 
        }
        System.out.println();
        System.out.println("----- конец задачи 4 ------");
    }
}
