/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Exer10 {
    
    public static void main(String[] args) {
        // Cº = (5 * (F-32) / 9)
        System.out.println("************************Conversor de Celsius para Fahrenheit*************************\n"
                + "Digite uma temperatura em graus Celsius.");
        Scanner scan = new Scanner(System.in);
        double cEmF = scan.nextDouble()*1.8+32;
        System.out.println(cEmF + "ºC.");
    }
}
