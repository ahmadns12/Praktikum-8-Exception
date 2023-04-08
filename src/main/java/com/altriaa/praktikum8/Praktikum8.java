/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.praktikum8;
import java.util.Scanner;
/**
 *
 * @author Altriaa
 */
public class Praktikum8 {

    public static void main(String[] args) {
        try{
            Scanner inp = new Scanner(System.in);
            int n1,n2;
            System.out.println("Input the number: ");
            n1 = inp.nextInt();
            n2 = inp.nextInt();
            int div = n1/n2;
            System.out.println("Your divison results: " + div);
        } catch (Exception e){
            System.out.println("The number divided by zero");
        } finally {
            System.out.println("The 'try catch' is finished");
        }
    }
}
