/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author pedro.hsfarias1
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //entradas
        System.out.print("x1: ");
        Double x1 = leia.nextDouble();
        System.out.print("x2: ");
        Double x2 = leia.nextDouble();
        System.out.print("c: ");
        Double c = leia.nextDouble();
        //processamento
        Double s = x1 + x2;
        Double p = x1 *x2;
        Double a = c/p;
        Double b = -(a*s);
        
        //saída
        System.out.println(a + "x^2 + " + b+ "x + " + c + " =0");
    }
    
}
