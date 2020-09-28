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
class App {
    public void run(){
        System.out.println("Выберите необходимую задачу (номера от 1 до 7) \nили 0 - выход из программы");
        Scanner scan = new Scanner(System.in);
        String task = scan.nextLine();
        switch (task){
            case "0": 
                System.out.println("Вы вышли из программы");
                break;
            case "1": 
                Task1 task1 = new Task1();
                task1.run();
                break;
            case "2": 
                Task2 task2 = new Task2();
                task2.run();
                break;
            case "3": 
                Task3 task3 = new Task3();
                task3.run();
                break;
            case "4": 
                Task4 task4 = new Task4();
                task4.run();
                break;
            case "5": 
                Task5 task5 = new Task5();
                task5.run();
                break;
            case "6": 
                Task6 task6 = new Task6();
                task6.run();
                break;
            case "7": 
                Task7 task7 = new Task7();
                task7.run();
                break;
            default:
                System.out.println("Такой задачи нет");
        }
    }
}
