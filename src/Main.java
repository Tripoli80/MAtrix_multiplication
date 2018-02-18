import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Введите размер квадратного масива = ");
        int dlinna = scaner1.nextInt();
        Matrix_2x ARRAY = new Matrix_2x(dlinna);
        Matrix_2x ARRAY2 = new Matrix_2x(dlinna);
        Matrix_2x Temp = new Matrix_2x(dlinna);
        ARRAY = StaticMetod.genarray(ARRAY);//генерация масива
        ARRAY2 = StaticMetod.genarray(ARRAY2);//генерация масива


        StaticMetod.printout(ARRAY);
        System.out.println();
        StaticMetod.printout(ARRAY2);
        System.out.println();
        StaticMetod.multiplication_array(ARRAY, ARRAY2).printout();
//        if(ARRAY.Identity())  //проверка на еденичную матрицу
//        {
//            System.out.println("матрица 1 единичная");
//        }else System.out.println("матрица не еденичная");
        System.out.println("результат d=");
       Temp=StaticMetod.summ_array( StaticMetod.multiplication_array(StaticMetod.numder_multiplication_array(ARRAY, 3),ARRAY2),StaticMetod.multiplication_array(StaticMetod.deffer_array(ARRAY, ARRAY2),ARRAY));


        Temp.printout();


        if(StaticMetod.multiplication_array(ARRAY,ARRAY2).Identity())  //проверка на еденичную матрицу
        {
            System.out.println("матрицы обратные");
        }else System.out.println("матрица не обратные");




    }}




