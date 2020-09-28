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
public class Task7 {
    public void run(){
        System.out.println("----- Задача 7 ------");
        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Введите букву: ");
        String letter = scan.nextLine();
        int n = 0;
        int index = str.toLowerCase().indexOf(letter.toLowerCase());
        while(index != -1){
            str = str.substring(index + 1);
            index = str.toLowerCase().indexOf(letter.toLowerCase());
            n++;
        }
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ n + " раз");
        System.out.println("");
        System.out.println("----- конец задачи 7 ------");
    }
}
