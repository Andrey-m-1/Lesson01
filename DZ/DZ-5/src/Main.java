public class Main {

    // 1 Метод Boolean IsPositiv
    public static boolean IsPositiv(int a1)
    {
        if (a1 >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // 2 Метод Boolean IsNegativ
    public static boolean IsNegativ(int a2)
    {
        if (a2<0){
            return true;
        }
        return false;
    }

    //3 Метод Boolean IsZero
    public static boolean IsZero(int a3)
    {
        while (a3==0){
            return true;
        }
        return false;
    }

    //4 Метод Boolean Chetnoe
    public static boolean Chetnoe(int a4)
    {
        if (a4%2==0){
            return true;
        }else {
            return false;
        }
    }

    //5 Метод Boolean NeChetnoe
    public static boolean NeChetnoe(int a5)
    {
        if (a5%2!=0) {
            return true;
        }
        else {
            return  false;
        }
    }

    //1 Метод int Kvadrat
    public static int Kvadrat (int b1)
    {
        return b1*b1;
    }

    //2 Метод int Kub
    public static int Kub (int b2)
    {
        return b2*b2*b2;
    }

    //3 Метод int Stepen - Принимает число и степень метод возводит в степень и возвращает данное число
    public static int Stepen (int b3, int c3)
    {
        int d3=1;
        for (int i = 1; i <= c3; i++) {
           d3 = d3*b3;
        }
        return d3;
    }

    //4 Метод int Sum
    public static int Sum (int b4, int c4)
    {
        return b4+c4;
    }


    public static void main(String[] args) {

        System.out.print("1. Печать метода Boolean IsPositiv: ");
        System.out.println(IsPositiv(100));

        System.out.print("2. Печать метода Boolean IsNegativ: ");
        System.out.println(IsNegativ(-100));

        System.out.print("3. Печать метода Boolean IsZero: ");
        System.out.println(IsZero(0));

        System.out.print("4. Печать метода Boolean Chetnoe: ");
        System.out.println(Chetnoe(4));

        System.out.print("5. Печать метода Boolean NeChetnoe: ");
        System.out.println(NeChetnoe(6));

        System.out.println();

        System.out.print("1. Печать метода int Kvadrat: ");
        System.out.println(Kvadrat(5));

        System.out.print("2. Печать метода int Kub: ");
        System.out.println(Kub(3));

        System.out.print("3. Печать метода int Stepen: ");
        System.out.println(Stepen(2,4));

        System.out.print("4. Печать метода int Sum: ");
        System.out.println(Sum(3,6));

    }

}