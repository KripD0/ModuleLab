package com;

import java.util.Scanner;

public class Menu {
    public static void Showmenu(){
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        while (flag){
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить работника.");
            System.out.println("2.Добавить работнику должность.");
            System.out.println("3.Добавить работнику предприятие.");
            System.out.println("4.Вывести список всех работников имеющих выбранную должность.");
            System.out.println("5.Вывести список всех работников работающих на выбранном предприятии.");
            System.out.println("6.Вывести список всех работников.");
            System.out.println("7.Выход");
            switch (scan.nextInt()){
                case 1: Lists.AddWorker(); break;
                case 2: Lists.Addposition(); break;
                case 3: Lists.Addcompany(); break;
                case 4: Lists.OutForposition(); break;
                case 5: Lists.OutForCompany(); break;
                case 6: Lists.Outout(); break;
                case 7: flag = false; break;
                case 8: Lists.Standartinput(); break;
                default:
                    System.out.println("Вы ввели неверный номер.");
            }
        }
    }
}
