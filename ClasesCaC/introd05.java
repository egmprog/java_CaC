package ClasesCaC;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor Eduardo Molino
 * @version 1.0
 */

//Temas desarrollados en la clase del 02/05/2023

/*Programar una calculadora con suma, resta, mutipl, div y otras
que permita hacer multiples operaciones hasta indicar el cierre del programa
 * 
 */
import java.util.Scanner;
//import java.lang.Math;
//import java.math.MathContext;

public class introd05
{
    public static void main(String[] args)
    {
        //declaración de variables
        int opcion, operacionvalida=1, seguir=0;
        double num1=0, num2=0;
        
        Scanner sc = new Scanner(System.in);

        //ingreso de valores y opciones 
        System.out.println("Ingrese los dos números para la operación");
        do{
            if(operacionvalida==1){
                System.out.println("Ingrese el primer número");
                num1=sc.nextInt();
                System.out.println("Ingrese el segundo número");
                num2=sc.nextInt();
            }
            
            System.out.println("Ingrese la operación que desea realizar");
            System.out.println("              1. Sumar");
            System.out.println("              2. Restar");
            System.out.println("              3. Multiplicar");
            System.out.println("              4. Dividir");
            System.out.println("              5. Calcular el mayor de ambos números");
            System.out.println("              6. (No deseo calcular: Salir)");
            opcion=sc.nextInt();

            //switch para gestionar la opción elegida
            switch(opcion){
                case 1:
                    System.out.println(num1+ " + "+ num2+" = "+(num1+num2));
                    operacionvalida=1;
                    break;
                case 2:
                    System.out.println(num1+ " - "+ num2+" = "+(num1-num2));
                    operacionvalida=1;
                    break;
                case 3:
                    System.out.println(num1+ " * "+ num2+" = "+(num1*num2));
                    operacionvalida=1;
                    break;
                case 4:
                   
                    //validación de la división con divisor distinto de cero
                    if(num2!=0){
                        System.out.println(num1+ " / "+ num2+" = "+(num1/num2));
                        operacionvalida=1;
                        break;
                        
                    }else{
                        System.out.println("Ingresó un divisor inválido. No se puede dividir por cero.");
                        operacionvalida=0;

                    }
                    
                    /* Otra forma de manejar el error producido al dividir por CERO
                        sin embargo, el mensaje arrojado es un texto estandar en inglés

                        try {
                       int resultado = num1/num2;
                        System.out.println("El resultado de la división es: " + resultado);
                        } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    
                        }
                    */
                case 5:
                    System.out.println("El mayor de los números ingresados es: "+Math.max(num1, num2));
                    operacionvalida=1;
                    break;

                case 6:
                    operacionvalida=0;
                    break;

                default:
                    System.out.println("Ingrese una opción válida. Reingrese la operación deseada");
                    operacionvalida=1;
            }
            
            if(operacionvalida==1){
                System.out.println("Desea realizar otra operación:");
                System.out.println("              1. Continuar");
                System.out.println("              Otra tecla para terminar");
            seguir = sc.nextInt();
            } 
            


        }while(seguir==1);
        sc.close();
        System.out.println("-----FIN DEL PROGRAMA-----");    
    }
}

