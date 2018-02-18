import java.util.Scanner;

public class StaticMetod {

public static Matrix_2x genarray(Matrix_2x array)
{
    for (int i =0; i<array.array.length;i++)
      for (int j=0 ; j<array.array.length; j++)
        array.array[i][j]=generator_2(-5, 9);
       return array;
}
//генератор случайный чисел в заданом промежутке
    public static int  generator_(int x,int y ) // x-генерировать число от заданого числа  y-генерировать число от заданого числа
    {
        int rand;

        rand=((int)(Math.random() * (y-x) +x));

        return rand;

    }
    public static int  generator_2(int x,int y ) // x-генерировать число от заданого числа  y-генерировать число от заданого числа
    {
        Scanner scaner1 = new Scanner(System.in); //создание обьекта позволяющий считать входную информа
        System.out.println("Введите число = ");


        return  scaner1.nextInt();

    }

//умножение матриц
    public static Matrix_2x multiplication_array(Matrix_2x array1, Matrix_2x array2)
    {
        Matrix_2x result=new Matrix_2x(array1.razmernost);
//          for (int i =0; i<array1.array.length;i++)
//            for (int j=0 ; j<array1.array.length; j++)
//                result.array[i][j]=array1.array[i][j]*array2.array[i][j];
//        return result;

            //A[m][n]*B[k][l]=C[m][l] C - eto rezultat
            int m = array1.array.length;
            int n = array1.array[0].length;
            int k = array2.array.length;
            int l = array2.array[0].length;
            if (n != k)
            {
                System.out.println ("Matrici umnojit nelzja");
            }

            for(int i=0; i<m; i++)
            {
                for(int j=0; j<l; j++)
                {
                    result.array[i][j] = 0;
                    for (int s=0; s<n; s++)
                    {
                        result.array[i][j] += array1.array[i][s] * array2.array[s][j];
                    }
                }
            }
            return result;

    }
    // Сумма матриц
    public static Matrix_2x summ_array(Matrix_2x array1, Matrix_2x array2)
    {
        Matrix_2x result=new Matrix_2x(array1.razmernost);
          for (int i =0; i<array1.array.length;i++)
            for (int j=0 ; j<array1.array.length; j++)
                result.array[i][j]=array1.array[i][j]+array2.array[i][j];
        return result;

    }
    //разница матриц
       public static Matrix_2x deffer_array(Matrix_2x array1, Matrix_2x array2)
    {
        Matrix_2x result=new Matrix_2x(array1.razmernost);
        for (int i =0; i<array1.array.length;i++)
            for (int j=0 ; j<array1.array.length; j++)
                result.array[i][j]=array1.array[i][j]-array2.array[i][j];
        return result;

    }
    //умножение матрицы  на число
    public static Matrix_2x numder_multiplication_array(Matrix_2x array1, int array2)
    {
        Matrix_2x result=new Matrix_2x(array1.razmernost);
        for (int i =0; i<array1.array.length;i++)
            for (int j=0 ; j<array1.array.length; j++)
                result.array[i][j]=array1.array[i][j]*array2;
        return result;

    }

    public static void printout (Matrix_2x array)
    {
        for (int i =0; i<array.array.length;i++)
        { for (int j=0 ; j<array.array.length; j++)
                System.out.print(array.array[i][j]+"\t");
        System.out.println();    }
    }




}
