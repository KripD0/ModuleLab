package com;

import rus.company;
import rus.positions;
import rus.workers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {

    static List<Object> Spisok = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void AddWorker(){
        int id;
        String Surname, name, second_name, date, adres, number;
        System.out.println("Введите Фамилию работника");
        Surname = in.nextLine();
        System.out.println("Введите Имя работника");
        name = in.nextLine();
        System.out.println("Введите Отчество работника");
        second_name = in.nextLine();
        System.out.println("Введите Дату рождения работника");
        date = in.nextLine();
        System.out.println("Введите Адресс работника");
        adres = in.nextLine();
        System.out.println("Введите Номер телефона работника");
        number = in.nextLine();
        Spisok.add(new workers(Surname, name, second_name, date, adres, number));
    }

    public static void  Outout(){
        System.out.println("Список всех работников");
        for(Object obj : Spisok){
            System.out.println(obj + "\n");
        }
    }

    public static void  Addposition(){
        if(!Spisok.isEmpty()){

            Outout();
            int ID;
            String position;
            System.out.println("Введите ID работника, которому хотите добавить должность.");
            ID = in.nextInt();in.nextLine();
            if((Spisok.get(ID - 1) instanceof workers)){
                System.out.println("Введите должность.");
                position = in.nextLine();
                workers worker = (workers) Spisok.get(ID - 1);
                Spisok.set(ID - 1, new positions(position, worker));
                System.out.println("Должность успешно добавлена.\n");
            }
            else System.out.println("У данного работника уже есть должность.");
        }
        else System.out.println("Сначала добавьте работников!!!");
    }

    public static void  Addcompany(){
        if(!Spisok.isEmpty()){
            Outout();
            int ID;
            String name, adres;
            System.out.println("Введите ID работника, которому хотите добавить компанию.");
            ID = in.nextInt();in.nextLine();
            if((Spisok.get(ID - 1) instanceof positions)){
                System.out.println("Введите название компании.");
                name = in.nextLine();
                System.out.println("Введите адрес компании.");
                adres = in.nextLine();
                positions pos = (positions) Spisok.get(ID - 1);
                Spisok.set(ID - 1, new company(name, adres, pos));
                System.out.println("Компания успешно добавлена.\n");
            }
            else if(Spisok.get(ID - 1) instanceof company) System.out.println("У данного работника уже есть компания.");
            else System.out.println("Сначала добавьте должность работнику.");
        }
        else System.out.println("Сначала добавьте работников!!!");
    }

    public static void Standartinput(){
        workers worker1 = new workers("Шатохин", "Данила", "Владимирович", "23.10.2003", "Кленовая 11", "89103042313");
        workers worker2 = new workers("Романов", "Николай", "Романович", "11.01.2000", "Белгород", "8910423442");
        positions pos = new positions("Юрист", worker2);
        workers worker3 = new workers("Ли", "Евгений", "Петрович", "11.12.2005", "Узбекистан", "89536662366");
        positions pos1 = new positions("Экономист", worker3);
        Spisok.add(worker1);
        Spisok.add(new company("bebra", "bebraSkilStreet", pos));
        Spisok.add(pos1);
    }

    public static int OutForposition(){
        String pos;
        int count = 0;
        if (!Spisok.isEmpty()){
            Outout();
            System.out.println("Введите нужную должность.");
            pos = in.nextLine();
            for (Object obj : Spisok){
                if(obj instanceof  positions && ((positions) obj).getName_position().equalsIgnoreCase(pos) || obj instanceof company && ((company) obj).getname_position().equalsIgnoreCase(pos)){
                    count ++;
                    System.out.println(obj + "\n");
                }
            }
        }
        else{
            System.out.println("Не было добавлено ни одного работника.\n");
            return 0;
        }
        if(count == 0){
            System.out.println("Работников с данной должностью не было найдено.\n");
        }
        return 0;
    }

    public static int OutForCompany(){
        String company;
        int count = 0;
        if (!Spisok.isEmpty()){
            Outout();
            System.out.println("Введите название нужной компании.");
            company = in.nextLine();
            for (Object obj : Spisok){
                if(obj instanceof  company && ((company) obj).getName().equalsIgnoreCase(company)){
                    count ++;
                    System.out.println(obj + "\n");
                }
            }
        }
        else{
            System.out.println("Не было добавлено ни одного работника.\n");

            return 0;
        }
        if(count == 0){
            System.out.println("Работников с данной компанией не было найдено.\n");
        }

        return 0;
    }
}
