/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author megam
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        // TODO code application logic here
        int miVariableEntera = 666;
        
        System.out.println(miVariableEntera);
        System.out.println("Hello World! You sexy beast! "+miVariableEntera);
        System.out.printf("Hello you sexy beast %s \n", miVariableEntera);

        String miCadena = "Esta es una simple cadena de texto que encierra un gran mensaje.";
        
        String segundaCadena = in.nextLine();
        
        System.out.println(miCadena);
        
        imprimir(miCadena);
        imprimir(segundaCadena);
                
        System.out.println("Imprimiremos todos los tipos de variables primitivas");                
        
        byte numeroByte = (byte)127;
        
        System.out.println("Valor Minimo de byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor Maximo de byte: "+ Byte.MAX_VALUE);
        System.out.println("Valor de la variable = "+ numeroByte);
        
        short numeroShort = 10;
        
        System.out.println("Valor minimo de short: "+ Short.MIN_VALUE);
        System.out.println("valor maximo de short: "+ Short.MAX_VALUE);
        System.out.println("Valor de la variable numeroShort: "+ numeroShort);
        
        int numeroEntero = 32324123;
        
        System.out.println("Valor Minimo de Integer: "+ Integer.MIN_VALUE);
        System.out.println("Valor Maximo de Integer: "+ Integer.MAX_VALUE);
        System.out.println("Valor de la variable numeroEntero: "+ numeroEntero);
        
        long numeroLong = 12340987125433245L;
        
        System.out.println("Valor Minimo de Long: "+ Long.MIN_VALUE);
        System.out.println("Valor Maximo de Long: "+ Long.MAX_VALUE);
        System.out.println("Valor de la variable numeroLong: "+ numeroLong);
    }
    
    public static void imprimir(String temp){
        for(int i = 0 ; i < temp.length(); i++){
            System.out.println(temp.charAt(i));
            try{Thread.sleep(150);}catch(InterruptedException e){System.out.println(e);};           
        }
        System.out.println();
    }
    
}
