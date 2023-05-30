package ClasesCaC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Comentarios de documentación
 * Título del programa
 * @autor: Eduardo Molino
 * @version 1.0
 */

//Temas desarrollados en la clase del 30/05/2023

/*
 * Temas:
 * ArrayList
 * Clases (se usa una clase creada en archivo aparte llamada: Auto)
 */




public class introd12
{
    public static void main(String[] args)
    {
        System.out.println("---------------------INICIO--------------------");
        Scanner teclado = new Scanner (System.in);
        ArrayList<Operacion> listaOperaciones = new ArrayList<Operacion>();
        int num1,num2,operador;

        for (int i=1; i<5; i++){
            System.out.println("ingrese el oprador");
            System.out.println("1. sumar, 2. restar, 3. multiplicar, 4. dividir");
            operador=teclado.nextInt();
            System.out.println("Ingrese el numero 1:");
            num1=teclado.nextInt();
            System.out.println("Ingrese el numero 2:");
            num2=teclado.nextInt();

            //creo el objeto operacion
            Operacion miOperacion= new Operacion(num1, num2, operador, i);

            switch (operador) {

                case 1:miOperacion.sumar(num1,num2);break;
                case 2:miOperacion.restar(num1,num2);break;
                case 3:miOperacion.multiplicar(num1,num2);break;
                case 4:miOperacion.dividir(num1,num2);break;
                    
                    
            
                default:
                System.out.println("Operador inválido");
                    break;
            }

            if(operador==1||operador==2||operador==3||operador==4){
                listaOperaciones.add(miOperacion);
            }



        }

        
        System.out.println(listaOperaciones);
        
        System.out.println("---------------------FIN--------------------");
    teclado.close();    
    }
    
}

