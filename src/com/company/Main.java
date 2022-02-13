package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("HelloWorld");
        int a = 11;
        if (a > 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
        if (a <= 9) {
            System.out.println("Однозначное");
        } else if (a <= 99) {
            System.out.println("Двухзначное");
        } else if (a <= 999) {
            System.out.println("Трехзначное");
        } else {
            System.out.println("Четырехзначное и выше");
        }
        System.out.println("2 задача");
        int b = 155;
        int c = 14;
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольника не сущевствует");
        }
        System.out.println("3 задача");
        if (a > 0) {
            a = a + 1;
            System.out.println("Variable = " + a);
        } else if (a == 0) {
            a = 10;
            System.out.println("Variable = " + a);
        } else {
            a = a - 2;
            System.out.println("Variable = " + a);
        }
        System.out.println("4 и 5 задачи");
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("3 положительных и 0 отрицательных");
        } else if (a < 0 && b < 0 && c < 0) {
            System.out.println("0 положительных и 3 отрицательных");
        } else if (a < 0 && b < 0 || a < 0 && c < 0 || b < 0 && c < 0) {
            System.out.println("1 положительное и 2 отрицательных");
        } else {
            System.out.println("2 положительных и 2 отрицательных");
        }
        System.out.println("6 задача");
        if (a > b) {
            System.out.println("Variable = " + a);
        } else if (a < b) {
            System.out.println("Variable = " + b);
        } else {
            System.out.println("Предлагаемые числа равны");
        }
        System.out.println("7 задача");
        int n = 1;
        if (n == 1) {
            System.out.println("1 Программист");
        } else if (n < 0 || n > 1 && n < 5 && a > 9 || a >= 5 && a <=20) {
            System.out.println("Программистов");
        } else {
            System.out.println("Программиста");
        }
    }
}
