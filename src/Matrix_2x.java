import java.util.Scanner;

public class Matrix_2x
{
   int razmernost;
   int array[][];


     Matrix_2x(int r)

     {
        razmernost=r;
        array=new int[r][r];
     }
   public  void printout ()// вывод матрицы
   {
      for (int i =0; i<array.length;i++)
      { for (int j=0 ; j<array.length; j++)
         System.out.print(array[i][j]+"\t");
         System.out.println();    }}

   public  boolean Identity ()// вывод матрицы
   {
      boolean result=false;
      int summ=0;
      int summ2=0;

      for (int i =0; i<array.length;i++)
      for (int j=0 ; j<array.length; j++)
         if (i==j)
         summ+=array[i][j];
         else
            if (array[i][j]!=0)
               summ2+=1;
         if(summ==array.length&&summ2==0)
            result=true;


         return result;
   }

}
