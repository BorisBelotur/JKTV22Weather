/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22weather;

import tasks.InitProject;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;
    
    public App() {
        scanner =new Scanner(System.in);
    }
    

    public void run() {
        System.out.println("Погода в году");
        boolean repeat =true;
        InitProject initProject = new InitProject();
        initProject.init();
        do {
           System.out.println("Выберите задачу:");
           System.out.println("0.Выход из программы");
           System.out.println("1.Температура в указанную дату");
           System.out.println("2.Дни с рекордными значениями температуры");
           System.out.println("3.Средняя температура за месяц");
           System.out.println("4.Средняя температура за год");
           int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Завершаем программу");
                    repeat = false;
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Выберите номер из списка!");
            }
        }while(repeat);
        System.out.println("Выход");
    }
    
}
