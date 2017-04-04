 import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /*
package s05.invoiceapp;

/**
 *
 * @author alumno
 */
public class S05Invoiceapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // mensaje de bienvenida al usuario
        System.out.println("bienvenido a la aplicacion total factura");
        System.out.println();//print a blank line
        //crear un objeto tipo scaner con identificacion sc
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese subtotal: ");
        double subtotal = sc.nextDouble();
        double impuesto = subtotal *0.18;
        double total = subtotal + impuesto;
        
        String mensaje ="total factura:    "+total + "\n";
        System.out.println(mensaje);
                
        
        
    }
    
}
