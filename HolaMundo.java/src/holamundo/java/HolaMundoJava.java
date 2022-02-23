/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo.java;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author HP
 */
public class HolaMundoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        Persona per1 = new Persona();
        per1.setNombre("Jesus DD");
        System.out.println("Nombre:" + per1.getNombre());
        per1.comer("Hamburguesa hawaiiana!!!");
        
        Persona per2 = new Persona();
        per2.setNombre("Jesus");
        per2.comer("Pizza Hawaiiana");
        System.out.println("Nombre:" + per2.getNombre());
    
        Automovil mibocho = new Automovil();
        mibocho.setMarca("VW");
        mibocho.setSubmarca("Sedan");
        mibocho.setModelo(1970);
        mibocho.setColor(Color.BLUE);
        System.out.println("Marca: " + mibocho.getMarca());
        System.out.println("Submarca: " + mibocho.getSubmarca());
        System.out.println("Modelo: " + mibocho.getModelo());
        System.out.println("Color: " + mibocho.getColor());
        
        Automovil miakura = new Automovil();
        miakura.setMarca("akura");
        miakura.setSubmarca("NSX");
        miakura.setModelo(2013);
        miakura.setColor(Color.GRAY);
        System.out.println("Marca: " + miakura.getMarca());
        System.out.println("SubMMarca: " + miakura.getSubmarca());
        System.out.println("Modelo: " + miakura.getModelo());  
        System.out.println("Color: " + miakura.getColor());
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubmarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.YELLOW);
        System.out.println("Marca: " + miMustang.getMarca());
        System.out.println("Submarca: " + miMustang.getSubmarca());
        System.out.println("Modelo: " + miMustang.getModelo());
        System.out.println("Color: " + miMustang.getColor());
        
     
                }
}