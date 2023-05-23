package ClasesCaC;

import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor Eduardo Molino
 * @version 1.0
 */

//Temas desarrollados en la clase del 05/05/2023

/*
 * Hacer una calculadora de suma, resta, mult y div
 * en la que se ingresen los numeros y se hagan operaciones hasta que 
 * el usuario decida acabar
 */



public class introd06
{
    public static void main(String[] args)
    {
        //variables
        String continuar="SI",continuarM;
        
        Scanner sc = new Scanner(System.in);
        
        do{

            //todo igual a la semana pasada... excepto lo que sigue...
        
        


            //opcion de seguir o salir con si o no (String)
            System.out.println("Desea continuar: SI - NO");
            continuar = sc.nextLine();
            continuarM= continuar.toUpperCase();   //convierte si en mayusculas
        }while(continuarM.equals("SI"));
        
       sc.close();
       System.out.println("-----FIN DEL PROGRAMA-----"); 
    }

    
}

