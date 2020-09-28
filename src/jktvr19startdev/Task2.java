/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        int num = random.nextInt(10-5+1)+5;
        System.out.println("Отгадай: ");
        Scanner scan = new Scanner(System.in);
        String userNumStr = scan.nextLine();
        int userNum = Integer.parseInt(userNumStr);
        if (num == userNum) {
            System.out.println("Ты выиграл");
        } else {
            System.out.println("Ты проиграл");
        }
        System.out.println("----- конец задачи 2 ------");
    }
   
}
