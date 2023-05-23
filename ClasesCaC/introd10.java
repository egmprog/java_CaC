package ClasesCaC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor: Eduardo Molino
 * @version 1.0
 */

//Temas desarrollados en la clase del 19/05/2023

/*
 * Colecciones ArrayList
 * Clases creadas y utilizadas desde otro archivo java
 */




public class introd10
{
    public static void main(String[] args)
    {
        System.out.println("---------------------INICIO--------------------");
        
        //coleccion de palabras. ArrayList.

        //Se crea el ArrayList y se agregan tres palabras
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Juan");
        palabras.add("Amanda");
        palabras.add("Ramiro");
        
        //Se muestran las palabras y la cantidad de elemntos del ArrayList
        System.out.println(palabras);
        System.out.println("La cantidad de elementos del array es: "+palabras.size());

        //Otro ejercicio
        //ArrayList de números

        System.out.println("---------------------======--------------------");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        Integer num;
        
        //ciclo para ingesar 5 números al ArryList
        for (int i=1; i<=5; i++){
            System.out.println("Ingresa el "+i+"º número para el array:");
            num = teclado.nextInt();
            numeros.add(num);
        }
        
        //se muestra el ArrayList por consola
        System.out.println(numeros);

        //otra forma de mostrar loe elementos del ArrayList, mediante un ciclo, listándolo uno debajo de otro
        System.out.println("-----otra forma-------");
        for (int i=1; i<=5; i++){
            System.out.println("El número es "+numeros.get(i-1));
            
        }

        //otro ejercicio: ArryList relacionado con una clase creada 'alumnos2'
        System.out.println("-----otro ejercicio-------");
        String nombre2;
        //array alumnos
        ArrayList<Integer> numeros2 = new ArrayList<>();
        //array palabras
        ArrayList<String> alumnos2 = new ArrayList<>();
        //creo un array desde una clase creada por mi
        ArrayList<alumnos2> alumcomis = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Ingrese el nombre del alumno:");
            nombre2 = teclado.next();
            alumnos2 alum =new alumnos2(nombre2, "24563");
            alumcomis.add(alum);
        }
        System.out.println(alumcomis);
        System.out.println("---------------------FIN--------------------");

        teclado.close();
        


        
    }
    
}

