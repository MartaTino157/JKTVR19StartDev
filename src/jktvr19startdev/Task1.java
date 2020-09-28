/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdev;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class Task1 {
    public void run(){
        System.out.println("----- Задача 1 ------");
        System.out.println("Введите число градусов по Цельсию: ");
        Scanner scan = new Scanner(System.in);
        double celsius = scan.nextDouble();
        System.out.println("По Фарингейту это будет: "+celsius*9/5+32);
        System.out.println("----- конец задачи 1 ------");
    }
}
