/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author lucas
 */

import java.util.Scanner;

public class AdvancedGeometry {

    // Ask to the user a positive integer using the message ‘question‘.
    // If the user inputs a wrong answer, it prints the error message ‘messageIfError‘ and ask again.
    // It repeats until we obtain a positive integer from the user.
    public static int askPositiveInteger(String question, String messageIfError){
        try{
            Scanner s = new Scanner(System.in);
            System.out.print(question);
            int nr = s.nextInt();
            if(nr <= 0){
                throw new Exception();
            }
            return nr;
        }catch(Exception e){
            System.out.println(messageIfError);
            return askPositiveInteger(question,messageIfError);
        }
    }

    public static void main(String[] args) {
        int height = askPositiveInteger("Enter the height of the rectangle: ","ey :(");
        int width = askPositiveInteger("Enter the width of the rectangle: ","ey :(");
        System.out.println("***");
        System.out.println("***");
    }
    
}
