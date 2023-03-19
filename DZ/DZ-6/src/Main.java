import java.util.Scanner;

public class Main {
    // Первое задание - методы

    //1. Метод сумма
    public static int Summa(int a, int b){
            return a+b;
    }

    //2. Метод деление
    public static int Delenie(int a, int b){
        return a/b;
    }

    //3. Метод произведение
    public static int Proizvedneie(int a, int b){
        return a*b;
    }

    //4. Метод разность
    public static int Raznost (int a, int b){
        return a-b;
    }


    public static void main(String[] args) {

        // Первое задание - печать методов

        System.out.print("1. Печать метода Summa: ");
        System.out.println(Summa(5,10));

        System.out.print("2. Печать метода Delenie: ");
        System.out.println(Delenie(10,2));

        System.out.print("3. Печать метода Proizvedneie: ");
        System.out.println(Proizvedneie(3,5));

        System.out.print("4. Печать метода Raznost: ");
        System.out.println(Raznost(10,2));

        System.out.println();

        // Второе задание
        //Пользователь вводит 5 значений
        //собрать все числа в массив и вывести:
        //1)Максимум
        //2)Минимум
        //3)Средне ариф.
        //4)Вывод массива

        System.out.print("Введите количество элементов массива : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] arr = new int[i];
        System.out.println("arr i = " + i);

        for (int j = 0; j < i; j++) {
            System.out.print("Введите значение элемента № " + (j+1) + " массива : " );
            Scanner scanner1 = new Scanner(System.in);
            arr[j] = scanner1.nextInt();
        }

        System.out.println("1. Вывод максимального элемента массива");
        int maxNum = arr[0];
        for (int num : arr) {
            if (num > maxNum)
                maxNum = num;
        }
        System.out.println("Max num = " + maxNum);
        System.out.println();


        System.out.println("2. Вывод минимального элемента массива");
        int minNum = arr[0];
        for (int num : arr) {
            if (num < minNum)
                minNum = num;
        }
        System.out.println("Min num = " + minNum);
        System.out.println();


        System.out.println("3. Среднеарифметическое значение массива");
        int sum = 0;
        for (int num: arr) {
            sum +=num;
        }
        int srArifm = sum / i;
        System.out.println("Sum = " + sum);
        System.out.println("Ср арифм = " + srArifm);
        System.out.println();


        System.out.print("4. Вывод состава массива: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ,");
        }
        System.out.println();
        System.out.println();


        // Третье задание - калькулятор
        System.out.println("Калькулятор");
        System.out.print("Введите первое число : ");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        char c;
        do {
            System.out.print("Введите операцию : ");
            c = scanner2.next().charAt(0);

            if (c != '+' && c != '-' && c != '*' && c != '/')  {
                System.out.println("Указан неверный оператор, введите одно из значений  +, -, *, / ");
            }

            if (c == '+' || c == '-' || c == '*' || c == '/'){
                break;
            }

        } while (true); // c != '+' && c != '-' && c != '*' && c != '/' - так указывать неправильно,
                                                                        // лучше через if()+break

        System.out.print("Введите второе число : ");
        Scanner scanner3 = new Scanner(System.in);
        int b = scanner3.nextInt();

        if (c == '+') {
            System.out.println("Сумма чисел = " + Summa(a,b));
        } else if (c == '-'){
            System.out.println("Разность чисел = " + Raznost(a,b));
        } else if (c == '*'){
            System.out.println("Произведение чисел = " + Proizvedneie(a,b));
        } else if (c == '/') {
            System.out.println("Деление чисел = " + Delenie(a,b));
        }


    }
}