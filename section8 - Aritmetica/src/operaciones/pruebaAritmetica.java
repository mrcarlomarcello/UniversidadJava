/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author shello
 */
public class pruebaAritmetica {
    
    public static void main(String[] args){
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 10;
        aritmetica.b = 11;
        
        int prueba = aritmetica.suma();
        
        System.out.println("La prueba suma: " + prueba);
    }
}
