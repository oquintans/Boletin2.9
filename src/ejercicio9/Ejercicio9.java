/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b100,b20,b5,m1,dinero;
        
        System.out.println("Billetes de 100€");
        Scanner dato=new Scanner(System.in);
        b100=dato.nextInt();
        System.out.println("Billetes de 20€");
        b20=dato.nextInt();
        System.out.println("Billetes de 5€");
        b5=dato.nextInt();
        System.out.println("Monedas de 1€");
        m1=dato.nextInt();
        
        dinero=b100*100+b20*20+b5*5+m1;
        System.out.println("Dinero Total:"+dinero);
                
    }
    
}
