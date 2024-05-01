/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Computadora {
    private String tipoProcesador;
    private double memoria;
    
    /*
    Creacion de constructores:
    1. Constructor predeterminado, sin parametros pero con asignacion por defecto
    de los valores.
    2. Constructor con parametro double para asignar desde un principio el valor 
    de memoria del objeto a crear
    3. Constructor con parametro string para asignar desde un principio el valor
    de tipo procesador del objeto a crear
    4. Constructor con ambos parametros menciondos
    */
    public Computadora(){
        tipoProcesador = "Intel - X";
        memoria = 16;
                
    }
    
    public Computadora(double m){
        memoria = m;
                
    }
    
    public Computadora(String tipo ){
        tipoProcesador = tipo;
                
    }

    public Computadora(String tipo, double mem ){
        memoria = mem;
        tipoProcesador = tipo;
                
    }
    
    
    // métodos establecer para cada atributo
    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }
    
    public void establecerMemoria(double n){
        memoria = n;
    }
    
    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }
    
    public double obtenerMemoria(){
        return memoria;
    }
    
}
