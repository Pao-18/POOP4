/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Perro {
    String color; 
    String pelaje; 
    int tamaño;
    String raza; 
    int edad; 
    
public Perro (){
    color=null;
    pelaje = null; 
    tamaño = 0; 
    raza = null; 
    edad= 0; 
    
}
public Perro (String color, String pelaje, int tamaño, String raza,int edad ){
    this.color=color; 
    this.pelaje=pelaje;
    this.tamaño= tamaño;
    this.raza=raza;
    this.edad= edad; 

}   
public void imprimePerro(){
    System.out.println("#### Datos ####");
    System.out.println("color= "+color);
    System.out.println("pelaje="+pelaje);
    System.out.println("Tamaño= "+tamaño);
    System.out.println("raza="+raza);
    System.out.println("edad= "+edad);
    
}
/**
 * Métodos del Perro 
 */
public void jugar(){
    System.out.println("guaf guaf");
    
}
public boolean comer(){
    System.out.println("Estoy comiendo ");
    return true;
      
}
public void correr(){
    System.out.println("Corre en el parque");
    
}
public void morder(){
    System.out.println("grrrr");    
}
public void saltar(float saltar1, float saltar2, float saltar3){
    System.out.println("Me movi a: " +saltar1+","+saltar2+","+saltar3);
    
}
}