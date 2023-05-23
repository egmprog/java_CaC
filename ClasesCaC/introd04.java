package ClasesCaC;
/**
 * Comentarios de documentación
 * Título del programa
 * @autor
 * @version 1.0
 */

//Temas desarrollados en la clase del 25/04/2023


//se importa la clase Scanner para ingresar datos por teclado
import java.util.Scanner;

//import javax.management.monitor.GaugeMonitor;

public class introd04
{
    public static void main(String[] args)
    {
        //int es una variable numérica    
         int num1, num2;
         int i;         

        //String es un objeto
        String nombre, apellido,tecla="";

         
            Scanner teclado = new Scanner(System.in);   
            System.out.println("Primer ejercicio: ingreso de datos por teclado");
            System.out.println("Ingrese su nombre");
            nombre= teclado.nextLine();
            System.out.println("Ingrese su apellido");
            apellido= teclado.nextLine();
            System.out.println("Ingrese su DNI");
            num1= teclado.nextInt();
            System.out.println("Ingrese su teléfono");
            num2= teclado.nextInt();
            System.out.println("");
            System.out.println(nombre+" "+apellido+" su DNI es "+num1+" y su teléfono es: "+num2);
            System.out.println("--------------------------------------------------------");
            
            //detener el programa hasta apretar una tecla
            System.out.println("Pulse una tecla para continuar");
            try
            {
                tecla = teclado.nextLine();
            }
            catch(Exception e)
            {}
            tecla = teclado.nextLine();
            tecla=tecla+"-";
            
                     
        System.out.println("");    
        System.out.println("Ejercicios sobre CICLOS");
        //for
        System.out.println("Segundo ejercicio: Usando FOR. Elaborar una lista de 1 a 9");
        for(i=0; i<10;i++) {
            if (i<9){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
                System.out.println("");
            }
            
        }       
        
        System.out.println("--------------------------------------------------------");
        
        //while
        System.out.println("Tercer ejercicio: Usando WHILE, idem anterior: 1 a 9");
        i=0;
        while(i<10){
            
            if (i<9){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
                System.out.println("");
            }
            i++;
        }
        
        
        System.out.println("--------------------------------------------------------");
        
        //do while
        System.out.println("Cuarto ejercicio: Usando DO WHILE 1 a 9");
        i=0;
        do{
            if (i<9){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
                System.out.println("");
            
        } i++;
        } while(i<=9);
    
        
       
        System.out.println("--------------------------------------------------------");
       //switch
       i=0;
       System.out.println("Quinto ejercicio: Usando un switch");
       System.out.println("Ingresa un número entero de 1 a 3");
       i=teclado.nextInt();
       switch(i){
        case 1:
        System.out.println("Hola buen día");
        break;
        case 2:
        System.out.println("Hola buenas tardes");
        break;
        case 3:
        System.out.println("Hola, buenas noches");
        break;
        default:
        System.out.println("Opción inexistente");
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Fin de los ejercicios");

        teclado.close();
        
       
    }
}

