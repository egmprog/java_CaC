package ClasesCaC;

import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Eduardo Molino
 * @version 1.0
 */

//Temas desarrollados en la clase del 09/05/2023

/*
 * listar 5 alumnos, NyA y lenguaje de prog
 *
 * comentarios generales:
 * las clases tienen sus objetos y sus métodos
 * ej: clase Scanner; objeto: teclado; nextLine: es un método  
 * ej: String nombre;   String es la clase, nombre es un objeto
 * ej: 
 */



public class introd07
{
    public static void main(String[] args)
    {
        String nombreA, apellidoA, lenguaje, nombreP, apellidoP;
        int i, edadP;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("--------------------INICIO-------------------------------");
        System.out.println("Se cargarán los datos de 2 alumnos y profesores");
        for(i=0; i<2; i++)
        {
            System.out.println("----FOR-------------------------------");
            System.out.println("Datos del alumno");
            System.out.println("Ingrese su nombre");
            nombreA=teclado.next();
            System.out.println("Ingrese su apellido");
            apellidoA=teclado.next();
            System.out.println("Ingrese su lenguaje");
            lenguaje=teclado.next();

            System.out.println("-----------------------------------");
            System.out.println("Datos del profesor");
            System.out.println("Ingrese su nombre");
            nombreP=teclado.next();
            System.out.println("Ingrese su apellido");
            apellidoP=teclado.next();
            System.out.println("Ingrese su edad");
            edadP=teclado.nextInt();
            
            System.out.println("-----------------------------------");    
            System.out.println("El nombre del alumno "+i+" es:"+nombreA+" "+apellidoA+" y su lenguaje preferido de programación es "+lenguaje);
            System.out.println("El profesor se llama "+nombreP+" "+apellidoP+" y su edad es "+edadP);
         
        }
        System.out.println("-----------------------------------");    
        System.out.println("Listo, se han cargado los datos de "+i+" usuarios");
        System.out.println("-----------------------------------");    
        
        

        teclado.close();
    }

    
}

