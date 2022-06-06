package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Виберіть розмір хештаблиці ");
        Scanner sc1 = new Scanner(System.in);
        int in1 = sc1.nextInt();
        HashTable hashTable = new HashTable();
        hashTable.size(in1);
        loop1:while(true){
            System.out.println("Введіть точку х центру кола: ");
            Scanner sc2 = new Scanner(System.in);
            double x = sc2.nextDouble();
            System.out.println("Введіть точку y центру кола: ");
            Scanner sc3= new Scanner(System.in);
            double y = sc3.nextDouble();
            System.out.println("Введіть довжину радіуса кола: ");
            Scanner sc4 = new Scanner(System.in);
            double radius = sc4.nextDouble();
            Circle circle = new Circle(x, y, radius);
            hashTable.addElement(circle);
            System.out.println("Оберіть:" +
                    "\n1.Бажаєте ввести ще одне коло " +
                    "\n2.Перейти до роботи з хештаблицею ");
            Scanner sc5 = new Scanner(System.in);
            int in2 = sc5.nextInt();
            if(in2 == 1){

            }
            else if(in2 == 2){
                break loop1;
            }
        }
        System.out.println("Хештаблиця:");
        for(int i = 0; i < hashTable.getList().length; i++){
            if(hashTable.getList()[i] == null){

            }
            else{
                System.out.println("id: " + i +", ключ кола:" + hashTable.getList()[i].getKey() + "," +
                    hashTable.getList()[i].getCircle().GetCircle());
            }
        }
    }
}
