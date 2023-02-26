import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Запросите у пользователя его имя и выведите в ответ: «Привет, его имя!».");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you name:  ");
        String name = scanner.next();
        System.out.println("Привет, " + name);
        System.out.println();

        System.out.println("2. Запросите у пользователя год его рождения, посчитайте, сколько ему лет и выведите результат");
        Scanner scanner2 = new Scanner (System.in);
        System.out.print("Enter your bith year:  ");
        int bithYear = scanner2.nextInt();
        int nowYear = 2023;
        int age = nowYear - bithYear;
        System.out.println("Your bith year: " + age);
        System.out.println();

        System.out.println("3. Запросите у пользователя длину стороны квадрата и выведите периметр такого квадрата");
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter side length of a square:  ");
        int length = scanner3.nextInt();
        int perimeterSquare = 4 * length;
        System.out.println("Perimeter square =  " + perimeterSquare);
        System.out.println();

        System.out.println("4. Запросите у пользователя радиус окружности и выведите площадь такой окружности");
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter radius:  ");
        int radius = scanner4.nextInt();
        int areaCircle = (int) (radius * Math.PI);
        System.out.println("Area circle =  " + areaCircle);
        System.out.println();

        System.out.println("5. Запросите у пользователя расстояние в км между двумя городами и за сколько часов он хочет добраться. \nПосчитайте скорость, с которой необходимо двигаться, чтобы успеть вовремя");
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Enter distance, km:  ");
        int distance = scanner5.nextInt();
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Enter travel time, hour:  ");
        int travelTime = scanner6.nextInt();
        int speed = distance / travelTime;
        System.out.println("Speed =  " + speed);
        System.out.println();

        System.out.println("6. Реализуйте конвертор валют. Пользователь вводит доллары, программа переводит в евро. Курс валюты храните в константе.");
        Scanner scanner7 = new Scanner(System.in);
        System.out.print("Enter quantity dollars, $:  ");
        float quantityDollars = scanner7.nextFloat();
        final float EURO_TO_DOLLAR = 0.95F;
        float quantityEuroCurrentExchange = quantityDollars * EURO_TO_DOLLAR;
        float scale = (float) Math.pow(10, 2);
        float result = (float) (Math.ceil(quantityEuroCurrentExchange * scale) / scale);
        System.out.println("Quantity euro current exchange =  " + result);
        System.out.println();


        System.out.println("8. Пользователь вводит сумму денег в кошельке и цену одной шоколадки. Программа выводит сколько шоколадок может купить пользователь и сколько сдачи у него останется.");
        Scanner scanner9 = new Scanner(System.in);
        System.out.print("Enter rest of money = ");
        float restMoney = scanner9.nextFloat();
        Scanner scanner10 = new Scanner(System.in);
        System.out.print("Enter chocolate price = ");
        float chocolatePrice = scanner10.nextFloat();
        float scale2 = (float) Math.pow(10, 2);
        int quantityChocolate = (int) (restMoney / chocolatePrice);
        float sdachaNoRounding =  restMoney - (quantityChocolate * chocolatePrice);
        float sdachaResult = (float) (Math.ceil(sdachaNoRounding * scale2) / scale2); // почему неверно округляет сдачу? Пример: в кошельке 1000, цена шок. - 350,33/ Дб сдача 299,34, а выдает 299,35
        System.out.print("Quantity chocolate = " + quantityChocolate + "\nsdacha =  " + sdachaResult);
    }
}