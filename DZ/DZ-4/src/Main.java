import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Сделать прямоугольник с ввом двух сторон");
        System.out.print("Введите ширину прямоугольника а = ");
        Scanner width = new Scanner(System.in);
        int a = width.nextInt();
        System.out.print("Введите высоту прямоугольника b = ");
        Scanner height = new Scanner(System.in);
        int b = height.nextInt();

        for (int i1 = 0; i1 < b; i1++) {
            for (int j1 = 0; j1 < a; j1++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("2. Сделать прямоугольный треугольник с вершиной вверху");

        int a2 = 5;

        for (int i2 = 0; i2 < a2; i2++) {
            for (int j2 = 0; j2 <= i2; j2++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println("3. Сделать прямоугольный треугольник с вершиной внизу");

        int a3 = 5;
        int b3 = 0;

        for (int i3 = 0; i3 < a3; i3++) {
            for (int j3 = 5; j3 > b3; j3--){
                if (j3 > i3) System.out.print(" * ");
        }
            System.out.println();
        }

        System.out.println("4. Сделать равносторонний треугольник с вершиной сверху");

        int a4 = 8; // высота
        int b4 = 15; // ширина

        for (int i4 = 0; i4 < a4; i4++) {
            for (int j4 = 0; j4 < b4; j4++) {
                if (j4 >= b4/2-i4 && j4 <= b4/2+i4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("5. Сделать ромб");
        int a5 = 17; // высота
        int b5 = 17; // ширина

        for (int i5 = 0; i5 < a5; i5++) {
            for (int j5 = 0; j5 < b5; j5++) {
                if (i5 <= a5 / 2 && j5 >= b5 / 2 - i5 && j5 <= b5 / 2 + i5
                        || i5 >= a5 / 2 && j5 >= i5-(b5/2) && j5 <=b5-(i5+1-b5/2))
                    System.out.print(" * "); // + "i=" + i5 + " j=" + j5
                else
                    System.out.print("   ");
                }
                System.out.println();
            }


        System.out.println("6. Сделать наклонную линию вправо");
        int a6 = 8;

        for (int i6 = 1; i6 <= a6; i6++) { // почему не стартует при i6 и j6 = 0, только при =1 ?
            for (int j6 =1; j6 <= i6; j6++) {
                if (j6 == i6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                System.out.println();
        }

        System.out.println("7. Сделать наклонную линию влево");
            int a7 = 8;
            int b7 = 0;

        for (int i7 = 0; i7 < a7; i7++) {
            for (int j7 = a7; j7 >= b7 ; j7--) {
                if (j7 == i7)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("8. Сделать границы прямоугольника");
        int a8 = 5; // ширина
        int b8 = 8; // высота

        for (int i8 = 0; i8 < b8; i8++) {
            for (int j8 = 0; j8 < a8; j8++) {
                if (i8 == 0 || i8 == b8-1 || j8==0 || j8 == a8-1 )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }

        System.out.println("9. Сделать 'пустой' прямоугольный треугольник с вершиной вверху");

        int a9 = 7;

        for (int i9 = 0; i9 < a9; i9++) {
            for (int j9 = 0; j9 <= i9; j9++) {
                if (j9 == 0 || j9 == i9 || i9==a9-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("10. Сделать 'пустой' прямоугольный треугольник с вершиной внизу");

        int a10 = 7;

        for (int i10 = 0; i10 < a10; i10++) {
            for (int j10 = a10; j10 > i10; j10--) {
                if (i10==0 || i10==a10-1 || j10==a10 || j10==i10+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("11. Сделать равносторонний треугольник с вершиной сверху");

        int a11 = 8; // высота
        int b11 = 15; // ширина

        for (int i11 = 0; i11 < a11; i11++) {
            for (int j11 = 0; j11 < b11; j11++) {
                if (i11==0 && j11==b11/2 || i11==a11-1 || i11 >=1 && j11==b11/2-i11 || i11 >=1 && j11==b11/2+i11)
                    System.out.print("*"); //  + "j=" + j11 + " "
                else
                    System.out.print(" "); //  + "j="+ j11+" "
            }
            System.out.println();
        }

                System.out.println("12. Сделать границу ромба");
        int a12 = 17; // высота
        int b12 = 17; // ширина

        for (int i12 = 0; i12 < a12; i12++) {
            for (int j12 = 0; j12 < b12; j12++) {
                if (i12 == 0 && j12==b12/2 // верхняя вершина
                        || i12 == a12-1 && j12==b12/2 // нижняя вершина
                        || i12 >=1 && i12 <= a12/2 && j12==b12/2-i12 // верхняя левая граница
                        || i12 >=1 && i12<= a12/2 && j12==b12/2+i12 // верхняя левая граница
                        || i12 >= a12/2 && i12 < a12 && j12==i12-b12/2 // нижняя левая граница
                        || i12 >= a12/2 && i12 <= a12 && j12==b12-(i12+1-b12/2) // нижняя правая граница
                )
                   System.out.print(" * "); // + "i=" + i12 + " j=" + j12
                else
                    System.out.print("   ");
                }
                System.out.println();
            }
    }
}


