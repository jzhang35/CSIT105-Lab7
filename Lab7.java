//James Zhang
package lab7;
import java.util.Scanner;

public class Lab7
{
   public static void main(String[] args)
   {
      final int FRUIT_ARRAY_SPACE = 10;
      int finalNum = 0;
      double totalFruitSold = 0;
      double averageFruitSold;
      
      int[] fruitArray = new int[FRUIT_ARRAY_SPACE];
      
      Scanner keyboard = new Scanner(System.in);

      for (int index = 0; index < FRUIT_ARRAY_SPACE; index++)
      {
         System.out.print( "Enter the number of fruits sold(-1 when done):");
         fruitArray[index] = keyboard.nextInt();
         
         if(fruitArray[index] <= 0 && index != 0){
             index = 10;
         } else if (fruitArray[index] <= 0 && index == 0){
             System.out.println("What? you didn't sell any fruit!");
             index = 10;
         } else if (index == 9 && fruitArray[index] >= 0){
             System.out.println("\nArray is full!");
             finalNum++;
         } else {
             finalNum++;
         }
         
      }
      
      if(fruitArray[0] != -1){
      
        System.out.println("\n       Fruit");
        System.out.println("    #   Sold");
        System.out.println("===== ======");
      
        for (int index = 0; index < finalNum; index++)
        {
           System.out.printf("%5d %6d\n", 
                             index, fruitArray[index]);
        }
      
        for (int index = 0; index < finalNum; index++)
        {
            totalFruitSold += (double)fruitArray[index];

            if(index == (finalNum - 1))
            {
                averageFruitSold = totalFruitSold / (double)finalNum;
                System.out.printf("\nAverage Fruits Sold: %,.1f\n", 
                                  averageFruitSold);

            }

        }
      }
   }
}