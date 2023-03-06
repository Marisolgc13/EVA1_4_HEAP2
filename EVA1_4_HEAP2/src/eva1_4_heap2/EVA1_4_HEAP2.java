/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_heap2;

import java.util.Scanner;

/**
 *
 * @author Marisol G
 */
public class EVA1_4_HEAP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso1= new Persona ();
        System.out.println("main" + perso1);
        capturarDatos(perso1);
        System.out.println("Nombre:"+ perso1.getNombre());
        System.out.println ("Edad:"+ perso1.getNombre());
    }
    public static void capturarDatos(Persona perso){
        System.out.print("capturar" + perso);
        Scanner input = new Scanner (System.in);
        perso.setNombre(input.nextLine());
        perso.setEdad(input.nextInt());
    }
}
class Persona {
    private String nombre;
    private int edad;
    // agregar constructores default y con argumentos 
    public Persona(){
        this.nombre = "Marisol Gómez Chacón";
        this.edad = 19 ;
                
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}