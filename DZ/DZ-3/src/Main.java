import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.");
        int a = 10;
        System.out.print("a = " + a + ", это - ");
        if (a == 10){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println();

        System.out.println("2. В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число \n(в первую, вторую, третью или четвертую).");
        int min = 100;
        System.out.print("min = " + min + ", это - ");
        if (min >= 0 && min <= 15){
            System.out.println("Первая четверть часа");
        }else if (min > 15 && min <= 30){
            System.out.println("Вторая четверть часа");
        }else if (min > 30 && min <= 45) {
            System.out.println("Третья четверть часа");
        }else if (min > 45 && min <= 59){
            System.out.println("Четвертая четверть часа");
        }else {
            System.out.println("Невреное значение min");
        }
        System.out.println();

        System.out.println("3. Если переменная a больше нуля, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.");
        int a1 = 1;
        System.out.print("a = " + a1 + ", утверждение, что a больше 0 - ");
        if (a1 > 0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println();

        System.out.println("4. Если переменная a меньше нуля, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.");
        int a2 = -1;
        System.out.print("a = " + a2 + ", утверждение, что a меньше 0 - ");
        if (a2 < 0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println();

        System.out.println("5. Если переменная a больше или равна нулю, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.");
        int a3 = -3;
        System.out.print("a = " + a3 + ", утверждение, что a больше или равна 0 - ");
        if (a3 >= 0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println();

        System.out.println("6. Если переменная a меньше или равна нулю, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.");
        int a4 = 0;
        System.out.print("a = " + a4 + ", утверждение, что a меньше или равна 0 - ");
        if (a4 <= 0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println();

        System.out.println("7. Если переменная a не равна нулю, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.");
        int a5 = 1;
        System.out.print("a = " + a5 + ", утверждение, что a не равна 0 - ");
        if (a5 != 0){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println();

        System.out.println("8. Если переменная a равна 'test', то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 'test', 'тест', 3.");
        // как проверить при числе 3, если ругается на сравнение разных типов данных?
        String a6 = "3";
        String check = "test";
        System.out.print("a = " + a6 + ", утверждение, что a равна 'test' - ");
        if (a6 == check){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println();

        System.out.println("9. Если переменная a равна '1' и по значению и по типу, то выведите 'Верно', иначе выведите 'Неверно'. \nПроверьте работу скрипта при a, равном '1', 1, 3.");
        //Пока не понятно как сравнить разные типы данных, пропустили тк не проходили эту тему
        System.out.println();

        System.out.println("10. Есть три числа (a,b,c) c помощью if else  выведите максимум и минимум");
        //выводит максимум, минимум и проверяет равные числа
        int a7 = 40;
        int b7 = 50;
        int c7 = 40;
        if (a7 > b7 && a7 > c7){
            System.out.println("Число 'a' - max = " + a7 + " больше 'b' = " + b7 + " и больше 'c' = " + c7);
        }else if (b7 > a7 && b7 > c7){
            System.out.println("Число 'b' - max = " + b7 + " больше 'a' = " + a7 + " и больше 'c' = " + c7);
        }else if (c7 > a7 && c7 > b7){
            System.out.println("Число 'c' - max = " + c7 + " больше 'a' = " + a7 + " и больше 'b' = " + b7);
        };
        if (a7 < b7 && a7 < c7){
            System.out.println("Число 'a' - min = " + a7 + " меньше 'b' = " + b7 + " и меньше 'c' = " + c7);
        }else if (b7 < a7 && b7 < c7){
            System.out.println("Число 'b' - min = " + b7 + " меньше 'a' = " + a7 + " и меньше 'c' = " + c7);
        }else if (c7 < a7 && c7 < b7){
            System.out.println("Число 'c' - min = " + c7 + " меньше 'a' = " + a7 + " и меньше 'b' = " + b7);
        };
        if (a7 == b7 && a7 == c7){
            System.out.println("Все 3 числа равны, a = " + a7 + " b = " + b7 + " c = " + c7);
        }else if (a7 == b7 && c7 < a7){
            System.out.println("Числа a = " + a7 + " и b = " + b7 + " равны и больше числа с = " + c7);
        }else if (a7 == b7 && c7 > a7){
            System.out.println("Числа a = " + a7 + " и b = " + b7 + " равны и меньше числа с = " + c7);
        }else if (b7 == c7  &&  b7 > a7){
        System.out.println("Числа b = " + b7 + " и c = " + c7 + " равны и больше числа a = " + a7);
        }else if (b7 == c7  &&  b7 < a7){
            System.out.println("Числа b = " + b7 + " и c = " + c7 + " равны и меньше числа a = " + a7);
        }else if (c7 == a7  &&  b7 < a7){
            System.out.println("Числа a = " + a7 + " и c = " + c7 + " равны и больше числа b = " + b7);
        }else if (c7 == a7  &&  b7 > a7){
            System.out.println("Числа a = " + a7 + " и c = " + c7 + " равны и меньше числа b = " + b7);
        }
        System.out.println();



        System.out.println("11. Есть число (a) вывести  положительное или отрицательное");
        int a8 = -1;
        System.out.print("Число a = " + a8 + " - ");
        if (a8 > 0) {
            System.out.println("Положительное");
        }else if (a8 < 0){
            System.out.println("Отрицательное");
        }else {
            System.out.println("Введен ноль");
        }
        System.out.println();

        System.out.println("12. Есть число (a) вывести  четное не четное");
        int a9 = 11;
        int b9 = a9%2;
        System.out.print("Число а = " + a9 + " - ");
        if (b9 == 0){
            System.out.println("Четное");
        }else {
            System.out.println("Нечетное");
        }

    }
}