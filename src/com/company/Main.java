package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ask();
    }

    private static boolean choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери кем бы ты хотел быть: \n 1-Воин, \n 2-Вор \n 3-Маг \n 4-Лучник \n 5-Священник \n П.С. Просто введи нужную цифру");

        if(!scanner.hasNextInt()) {
            return false;
        }
        int role = scanner.nextInt();
        switch (role) {
            case 1:
                System.out.println("Ммм, Воин, ты жаждешь сражений!");
                break;
            case 2:
                System.out.println("Вор - Ты можешь пробраться куда-угодно  и остаться незамеченным!");
                break;
            case 3:
                System.out.println("Мистика - твое всё");
                break;
            case 4:
                System.out.println("Пир-пир-пир!! Ты - лучник!");
                break;
            case 5:
                System.out.println("В твоем арсенале молитвы и вера в лучшее :D");
                break;
            default:
                System.out.println("Хорошая попытка, но выбрать надо из предложенных вариантов");
                return false;
        }
        return true;
    }

    private static void ask() {
        do {
            System.out.println("Как я могу обращаться к тебе, смерд?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Приветствую тебя, " + name + "!!!");
            while (!choice()) {};
        } while(askRepeat());
    }

    private static boolean askRepeat() {
        do{
            System.out.println("Вы хотите повторить, всё это еще разок? Пидр, YES or NO?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine().toUpperCase();
                if ("YES".equals(answer)) {
                    return true;
                } else if ("NO".equals(answer)) {
                    return false;
                }
            }while(true);
        }

    }
