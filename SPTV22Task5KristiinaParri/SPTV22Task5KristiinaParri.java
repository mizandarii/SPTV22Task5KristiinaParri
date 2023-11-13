/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task5kristiinaparri;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author admin
 */
public class SPTV22Task5KristiinaParri {
    
    static int rowWiseSorting(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
              Arrays.sort(arr[i]);
        }
    for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
           System.out.print(arr[i][j] + " ");
         }
         System.out.println();
       }
        return 0;
    }
    
    
    public static void sort2dArray(int arr[][]) {
   int n1 = 3;
   int n2 = 5;
   int n3 = 7;
   int n4 = 8;
   int n5 = 9;
   for (int i = 0; i < n1; i++) {
      for (int j = 0; j < n2; j++) {
         for (int k = 0; k < n3; k++) {
            for (int l = 0; l < n4; l++) {
                for (int m = 0; m < n5; m++) {
                    if (arr[l][m] <= arr[i][j]) {
                        // swap
                        int temp = arr[i][j];
                        arr[i][j] = arr[l][m];
                        arr[l][m] = temp;
                    } else {
                    }
            }
         }
      }
      }
   }
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int min=50;
        int max = 100;
        int temp = 0;
        int[][] arr = new int[5][];
        arr[0] = new int [3];
        arr[1] = new int [5];
        arr[2] = new int [7];
        arr[3] = new int [8];
        arr[4] = new int [9];
        Random rd = new Random();
        for (int i = 0; i < arr.length;i++) {
            for(int j = 0; j < arr[i].length;j++){
                    arr[i][j] = rd.nextInt(max-min+1)+min;
                }
            }
        System.out.println("Несортированный массив");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        
        System.out.println();
        

        System.out.println("Отсортированный массив");

        
        rowWiseSorting(arr);
        ///sort2dArray(arr);

}
    }



