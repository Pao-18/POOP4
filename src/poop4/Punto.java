 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Janet
 */
public class Punto {
    int x;
    int y; 
    String nombre; // si esta vaciò se le asigna un Null
    public Punto(){
        x=0;
        y=0;
        nombre=null;
            
    }
    public Punto(int x, int y, String nombre){
        //se le asignan los valores a los que declaramos arriba
        //this. para poder ingrsar a la informaciòn
        this.x=x;
        this.y=y;
        this.nombre=nombre;
        
    }
    /**
     * Método que llama a imprimir 
     */
    public void imprimePunto(){
        System.out.println("(x=" +x+", y="+y+") Nombre = "+nombre);
    }
    
}