/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class POOP4 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto = new Punto(); //Clase / variable = constructor
        punto.imprimePunto();
        Punto punto2 = new Punto(1, 2, "punto 2"); //definiendo e inicializando un punto
        punto2.imprimePunto();
        
        punto.x=20; //Colocamos informaciòn al vacio
        punto.y=100;
        punto.nombre="punto 1";
        punto.imprimePunto();
        System.out.println(punto);
        //nos arroja la direccion o referencia de donde esta el punto
        //@ significa "vas a encontrar ese objeto en: "
        Perro perro = new Perro();
        perro.imprimePerro();
        Perro perro2 = new Perro("cafe", "chino", 2, "Boxer", 5);
        perro2.imprimePerro();
        
        perro2.jugar();
        perro2.comer();
        perro2.saltar(3.5f,7, 9); //f para flotante 
        perro2.correr();
        perro2.morder();
        
        
    }
   
    
    
}