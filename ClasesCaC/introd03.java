package ClasesCaC;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Eduardo Molino
 * @version 1.0
 */

//Temas desarrollados en la clase del 25/04/2023

/*
 * Temas: ingreso de datos por teclado
 * ciclo WHILE y condicional IF/ELSE
 * validación de adtos ingresados
 */


//se importa la clase Scanner para ingresar datos por teclado
import java.util.Scanner;

public class introd03 
{
    public static void main(String[] args)
    {
        
        int num1=0, num2=0;
        String nombre="", apellido="";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombre= teclado.nextLine();
        System.out.println("Ingrese su apellido");
        apellido= teclado.nextLine();
        System.out.println("Ingrese su edad");
        num1= teclado.nextInt();
        while(num1<=0 || num1>120){
            System.out.println("Ingrese una edad correcta (1-120)");
            num1= teclado.nextInt();
        }
        System.out.println("Ingrese su DNI");
        num2= teclado.nextInt();
        while(num2<=1000000 || num1>50000000){
            System.out.println("Ingrese un DNI correcto");
            num2= teclado.nextInt();
        }

        System.out.println("Usted ha escrito:");
        System.out.println(nombre +" "+ apellido+ " su edad es: "+num1+" y su DNI es: "+num2);

        System.out.println("----------------------------OTRO EJERCICIO------------------------");

        //Ingresar dos número por teclado e indicar cual es el mayor
        int a1, a2;
        
        System.out.println("Ingrese dos número");
        Scanner nu = new Scanner(System.in);
        a1= teclado.nextInt();
        a2= teclado.nextInt();
        
        if(a1>a2){
            System.out.println("El número "+a1+" es mayor que "+a2);            
        }else if(a2>a1)
        {
            System.out.println("El número "+a2+" es mayor que "+a1);            
        }else{
            System.out.println("Ambos números son iguales");
        }

        teclado.close();
        nu.close();
        
        //Diseñar una calculadora, validar la division por cero, calcular raiz cuadrada

    }
}
