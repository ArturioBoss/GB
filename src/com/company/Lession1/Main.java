package com.company.Lession1;

/* Мальцев Артур
    ДЗ к первому уроку
*/

public class Main {

    public static void main(String[] args) {

        // Задание 2
        int a =5;
        float b = 1F;
        double d = 1D;
        byte b1 = 123;
        boolean bol = true;
        char ch = 'A';
        String str = "Hello";

        //  Задание 3
        System.out.println("a * (b + (c / d)) = "+count(5,2,3,1));

        //  Задание 4
        System.out.println("(5+2)>=10 и (5+2)<=20 = "+sum(5,2));

        //  Задание 5
        number(0);

        //  Задание 6
        System.out.println("Число 5 отрицательное ? = "+number1(5));

        //  Задание 7
        Name("Чувак");

        //  Задание 8
        Year(2000);

        //  Вопрос
        System.out.println("Я думаю это "+a+"?");



    }

    static int count(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    static boolean sum(int a, int b){
        int total = a+b;
        return total >=10 && total <=20;
    }

    static void number(int number){
        if (number>=0){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean number1(int a){
        return a<=0;

    }

    static void Name(String name){
        System.out.println("«Привет, "+name+"!»");
    }

    static void Year(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Високосный год");
        }else {
            System.out.println("Не високосный год");
        }



    }
}


