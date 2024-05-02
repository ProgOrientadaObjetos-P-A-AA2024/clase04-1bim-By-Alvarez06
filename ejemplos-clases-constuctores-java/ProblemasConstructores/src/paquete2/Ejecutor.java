package paquete2;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        /*
        Informacion
        "Militar", "Loja", 1000, 3000
        "Militar DOS", "Loja", 1000, 3000
        */
        
        //Objetos instanciados
        Hospital h1 = new Hospital();
        
        System.out.print("Ingrese el nombre del hospital: ");
        String nom = sc.nextLine();
        System.out.print("\nIngrese la ciudad del hospital: ");
        String ciu = sc.nextLine();
        System.out.print("\nIngrese el numero de doctores: ");
        int numDoc = sc.nextInt();
        System.out.print("\nIngrese el numero de enfermeros: ");
        int numEnf = sc.nextInt();
        
        h1.establecerNombre(nom);
        h1.establecerCiudad(ciu);
        h1.establecerNumeroDoctores(numDoc);
        h1.establecerNumeroEnfermeros(numEnf);
        
        
        System.out.printf("\nNombre del Hospital: %s\n"
                + "Ciudad: %s\nN° de Doctores: %d\nN° de Enfermeros: %d\n", 
                h1.obtenerNombre(), h1.obtenerCiudad(), h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());
        
    }
}
