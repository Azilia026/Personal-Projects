/*
This program is based off of the kattis problem "pet"
*/

import java.util.Scanner;
public class pet{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[][] grades = new int[5][4];
        
        for(int i = 0; i<5; i++){ //puts user inputed values into the 2d array
            for(int j = 0; j<4; j++){
            grades[i][j] = input.nextInt();
            }
        }
        
        int max = max(grades); 
        System.out.print(max);
       
    }
    
    
    public static int max(int[][] grades){
      
      int sum1 = 0;                    //finds the sum of each column of the 2d array
      for(int row = 0; row < 4; row++){
      sum1 += grades[0][row];
      } 
      int sum2 = 0;
      for(int row = 0; row < 4; row++){
      sum2 += grades[1][row];
      }
      int sum3 = 0;
      for(int row = 0; row < 4; row++){
      sum3 += grades[2][row];
      }
      int sum4 = 0;
      for(int row = 0; row < 4; row++){
      sum4 += grades[3][row];
      }
      int sum5 = 0;
      for(int row = 0; row < 4; row++){
      sum5 += grades[4][row];
      }
      
      int[] sums = {sum1, sum2, sum3, sum4, sum5}; //puts all of the sums into a new array
      
      int max = sums[0];
      for(int i = 1; i<sums.length; i++){ //finds the max value of the sums
         if(sums[i]>max){
         max = sums[i];
         }
      }
      
      if (max == sum1)       //finds which row the max value came from
      System.out.print("1 ");
           
      else if(max == sum2)
      System.out.print("2 ");
      
      else if(max == sum3)
      System.out.print("3 ");
      
      else if(max == sum4)
      System.out.print("4 ");
      
      else
      System.out.print("5 ");
     
      return max;
    }
    
}
