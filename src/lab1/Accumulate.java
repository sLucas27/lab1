/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Accumulate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = s.nextInt();
        System.out.print("Enter the initial array: ");
        int[] initial = new int[len];
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            initial[i] = s.nextInt();
            res[i] = initial[i];
            try{
                res[i] += res[i-1];
            }catch(Exception e){}
        }
        System.out.print("Accumulated array: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            System.out.print(" ");
        }
    }
    
}
