/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task2alesjavassiljeva;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV20Task2AlesjaVassiljeva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввидите трёхзначное число: ");
        int x = scanner.nextInt();
        int a = x % 10;
        int b = x / 10 % 10;
        int c = x / 100;
        int sum = a + b + c;
        System.out.println("Сумма цифр: "+ sum);
    }
    
}
