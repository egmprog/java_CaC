package ClasesCaC;
//Temas desarrollados en la clase del 21/04/2023

//"import java.util.Scanner;" es una declaración de importación en el lenguaje de programación Java 
//que permite que el programa utilice la clase Scanner del paquete java.util para leer la entrada del usuario.
//La clase Scanner proporciona métodos para leer diferentes tipos de datos de la entrada del usuario, 
//como enteros, flotantes, cadenas y otros tipos de datos primitivos. Al importar la clase Scanner, 
//el programador puede crear un objeto Scanner y utilizar sus métodos para leer la entrada del usuario 
//de una manera fácil y eficiente.

import java.util.Scanner;



public class introd02 {
    public static void main(String[] args){
        int num1 = 0, i, num2;
        String nombre = "",apellido="";
        

        System.out.println("Hola mundo");       //para facilitar la escritura de esta línea se puede tipear 'sout'+ enter
        
        num1 = 10;
        num2 = 3;
        
        nombre= "Juan";
        System.out.println("Hola " + nombre + " el número es " + num1);
        
        //condicionales
        //SI - SINO

        /*En Java, "if-else" es una estructura condicional que se utiliza para tomar decisiones basadas en una condición booleana.
            La sintaxis básica de "if-else" en Java es la siguiente:
                    if (condición) {
                    // Código a ejecutar si la condición es verdadera
                    } else {
                    // Código a ejecutar si la condición es falsa
                    }
        La "condición" es una expresión booleana que se evalúa como verdadera o falsa. 
        Si la condición es verdadera, se ejecuta el código dentro del bloque "if". 
        Si la condición es falsa, se ejecuta el código dentro del bloque "else".
        Es importante tener en cuenta que el bloque "else" es opcional. 
        Si no se proporciona un bloque "else", no se ejecutará ningún código si la condición es falsa.
        También es posible utilizar múltiples bloques "else-if" para evaluar múltiples condiciones. 
        La sintaxis para esto es la siguiente:
                    if (condición1) {
                    // Código a ejecutar si la condición1 es verdadera
                    } else if (condición2) {
                    // Código a ejecutar si la condición2 es verdadera
                    } else {
                    // Código a ejecutar si ninguna de las condiciones anteriores es verdadera
                    }
        En este caso, si la primera condición es falsa, se evalúa la segunda condición. 
        Si la segunda condición es verdadera, se ejecuta el código dentro del segundo bloque "if". 
        Si la segunda condición también es falsa, se ejecuta el código dentro del bloque "else".    */


        if(num1>0){
            System.out.println("El número "+num1+" es positivo");            
        }else{
            System.out.println("El número "+num1+" es negativo");
        }
        
        //PARA
        /*En Java, "for" es una estructura de control de flujo que se utiliza para repetir una sección de código 
        un número específico de veces. La sintaxis básica de la estructura "for" es la siguiente:
                    for (inicialización; condición; actualización) {
                    // Código a ejecutar en cada iteración
                    }
        La "inicialización" se utiliza para establecer el valor inicial de la variable de control de bucle. 
        La "condición" es una expresión booleana que se evalúa al comienzo de cada iteración del bucle y si es verdadera, 
        el cuerpo del bucle se ejecuta. 
        La "actualización" se utiliza para actualizar el valor de la variable de control de bucle al final de cada iteración.
        Es importante tener en cuenta que la sección de inicialización, condición y actualización es opcional.        */


        for (i=0; i<10; i++){                                               //i++   incrementa el valor de i en una unidad
            System.out.println("El incremental de i para «for» muestra: "+i);
        }

        //CALCULANDO
        
        System.out.println("La suma es: "+ (num1+num2));
        
        System.out.println("La resta es: "+ (num1-num2));
        
        System.out.println("La multiplicación es: "+ (num1*num2));


        if(num2==0){                                                        //validación para la división
            System.out.println("No es posible dividir por cero");
        }else{
        
            System.out.println("La división es: "+ ((double)num1/(double)num2));
        }
        
        
        //LEER
        //Aquí se aplica la librería Scanner importada en el inicio del archivo
        
        Scanner sc = new Scanner(System.in);         //creación de un OBJETO de la clase Scanner
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();                      //la ejecusión se detiene esperando la entrada de datos del usuario
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();    
        System.out.println("El nombre y apellido ingresado es: "+nombre+" "+apellido);

        sc.close();

        


    }
}
