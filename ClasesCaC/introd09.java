package ClasesCaC;



/**
 * Comentarios de documentación
 * Título del programa
 * @autor
 * @version 1.0
 */

//Temas desarrollados en la clase del 12/05/2023

/*
 * 
 */

import java.util.Scanner;


public class introd09
{
    public static void main(String[] args)
    {
        //el objeto tienen un rango de valores y funcionalidad
        //la variable tienen solamente un rango de valores
        //declaración de una clase (String) donde nombre es un (objeto)
        String nombre;      
        
        // declaracion de: 
        int num1;       //int, donde num1 es una variable
        Integer num2;    //num2, en cambio, es un objeto
        
        //Scanner y System son clases y teclado es un objeto
        Scanner teclado = new Scanner(System.in);
        
        nombre=teclado.next();    //next es una funcionalidad asociada al objeto teclado en la clase Scanner

        
        

        teclado.close();
        
    }
    
}

