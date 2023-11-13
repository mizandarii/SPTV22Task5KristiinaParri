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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min=50;
        int max = 100;
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
        
        for (int i = 0; i < arr.length;i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println("Отсортированный массив");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
            }
}
    }

