/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora portatil = new Computadora("Intel-x19", 6.1+4.2);
        System.out.printf("%s ; %.2f", portatil.obtenerTipoProcesador(), 
                portatil.obtenerMemoria());
    }
    
}
