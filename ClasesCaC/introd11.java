package ClasesCaC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor: Eduardo Molino
 * @version 1.0
 */

//Temas desarrollados en la clase del 23/05/2023

/*
 * Temas:
 * ArrayList
 * Clases (se usa una clase creada en archivo aparte llamada: Auto)
 */




public class introd11
{
    public static void main(String[] args)
    {
        System.out.println("---------------------INICIO--------------------");
        
        

        Scanner teclado =new Scanner(System.in);
        
        //Primer ejemplo: un ArryList de números
        ArrayList<Integer> miListaDeNumeros = new ArrayList<Integer>();         

        
        //agregar valores fijos
        miListaDeNumeros.add(10);
        miListaDeNumeros.add(20);

        //para ingresar al ArrayList desde teclado
        
        System.out.println("Ingresa un numero:"); 
        int num= teclado.nextInt();
        miListaDeNumeros.add(num);

        //Se muestra el ArryaList        
        System.out.println("Número fijos del array y número ingresado: "+miListaDeNumeros);
        
        
        System.out.println("---------------------otro ejercicio--------------------");

        //Otro ejercicio: ArrayList de palabras
        ArrayList<String>listaDePalabras=new ArrayList<String>();
        String palabra;
        //Ciclo para ingresar 3 palabras por teclado
        for (int i=0; i<3;i++){
            System.out.println("Ingresa una palabra");
            palabra=teclado.next();
            listaDePalabras.add(palabra);
        }

        //se muestra el ArryList
        System.out.println("El array de plabras es: "+listaDePalabras);

        //se muestra el tamaño del ArryList
        System.out.println("El tamaño del ArryList es: "+listaDePalabras.size());
        
        
        System.out.println("---------------------otro ejercicio--------------------");

        //tercer ejercicio usando una clase creada en otro archivo denominado 'Auto'
        System.out.println("Aquí vamos a interactuar con la clase creada 'Auto'");
        ArrayList<Auto> listaDeAutos = new ArrayList<Auto>();
        Auto miAuto;
        miAuto=new Auto("","");
        
        //Dos valores fijos que se agregan al ArryList
        miAuto=new Auto("negro", "Fiat");
        listaDeAutos.add(miAuto);
        miAuto=new Auto("rojo", "Ford");
        listaDeAutos.add(miAuto);
        System.out.println("Lista estática: "+listaDeAutos);
        

        //Se agregan más valores al ArryList por teclado
        String color,modelo;        
        
        //ciclo para ingresar varios autos al ArrayList
        for(int j=1;j<3; j++){
            System.out.println("Ingrese el color del "+j+"º auto:");
            color =teclado.next();            
            
            System.out.println("Ingrese el modelo del "+j+"º auto:");
            modelo =teclado.next();            
            miAuto=new Auto(color, modelo);
            listaDeAutos.add(miAuto);
        }
        //Muestra el ArrayList
        System.out.print(listaDeAutos);
        
        System.out.println("---------------------======--------------------");
        
        System.out.println("---------------------FIN--------------------");
    teclado.close();    
    }
    
}

