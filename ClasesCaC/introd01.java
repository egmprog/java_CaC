package ClasesCaC;
/*Los siguientes comentarios han sido aportados por el Chat GPT */

/* En Java, "public class" es una declaración que define una clase como pública. 
En la programación orientada a objetos, una clase es un plano o plantilla que define la estructura y el comportamiento de un objeto. 
En Java, las clases son los bloques fundamentales de construcción de programas y se utilizan para crear objetos, 
que son instancias específicas de esa clase.
La palabra clave "public" en Java es un modificador de acceso que indica que la clase es accesible desde cualquier parte del código, 
es decir, no tiene restricciones de visibilidad. Esto significa que la clase puede ser utilizada, extendida y accedida desde cualquier 
otra parte del programa, incluyendo otras clases y paquetes.
Entonces, "public class" en Java se utiliza para declarar una clase como pública, 
lo que permite que la clase sea accesible desde cualquier parte del código, 
lo que la hace visible para su uso en otros lugares del programa.*/


public class introd01 {


    /*En Java, "public static void main" es una declaración que define el método principal (main) de una clase. 
El método main es el punto de entrada de un programa Java y es el punto de partida para la ejecución del programa. 
Cuando se ejecuta un programa Java, la JVM (Máquina Virtual de Java) busca el método main como punto de entrada 
para iniciar la ejecución del programa.
La sintaxis completa del método main en Java es la siguiente:
"public": Es un modificador de acceso que indica que el método es accesible desde cualquier parte del programa.
"static": Es una palabra clave que indica que el método pertenece a la clase en sí misma y no a una instancia específica de la clase. 
Esto significa que se puede invocar el método main sin crear una instancia de la clase que lo contiene.
"void": Es el tipo de retorno del método, que indica que el método no devuelve ningún valor.
"main": Es el nombre del método, que es convencionalmente utilizado por la JVM como el punto de entrada del programa.
"String[] args": Es un parámetro del método main que permite pasar argumentos a la clase cuando se ejecuta el programa. 
Los argumentos se pasan como un arreglo de cadenas de texto (Strings), que pueden ser utilizados dentro del método main 
para realizar ciertas operaciones en el programa.
En resumen, "public static void main" en Java define el método principal de una clase, 
que es el punto de entrada para la ejecución de un programa Java y permite recibir argumentos en forma de arreglo de cadenas de texto. */


    public static void main(String[] args) {



        /*En Java, existen varios tipos de variables que se utilizan para almacenar diferentes tipos de datos. 
        Los tipos de variables en Java se dividen en dos categorías principales: 
        tipos primitivos y tipos de referencia. Aquí se describen algunos de los tipos de variables más comunes en Java:
        Tipos primitivos:
        byte: representa un número entero de 8 bits con signo.
        short: representa un número entero de 16 bits con signo.
        int: representa un número entero de 32 bits con signo.
        long: representa un número entero de 64 bits con signo.
        float: representa un número de punto flotante de 32 bits.
        double: representa un número de punto flotante de 64 bits.
        char: representa un carácter Unicode de 16 bits.
        boolean: representa un valor booleano, que puede ser verdadero (true) o falso (false).
        Tipos de referencia:
        String: representa una secuencia de caracteres en Java.
        Arrays: representa una colección de elementos del mismo tipo, que pueden ser primitivos o de referencia.
        Clases personalizadas: representa objetos creados a partir de clases definidas por el usuario.
        Es importante tener en cuenta que los tipos primitivos se almacenan directamente en la memoria, 
        mientras que los tipos de referencia se almacenan en la memoria como referencias a objetos, 
        que a su vez se almacenan en otro lugar de la memoria. Además, Java también es un lenguaje de programación con tipado estático, 
        lo que significa que los tipos de variables deben ser declarados explícitamente antes de su uso. */


        int num;
        String nombre;
        double num2;

        num=10;
        nombre="Juan";
        num2=20;


        /*En Java, "System.out.println" es una instrucción que se utiliza para imprimir una línea de texto en la salida estándar 
        (normalmente la consola). Es una forma de mostrar mensajes o resultados de cálculos en la pantalla para propósitos de 
        depuración, seguimiento del flujo del programa o interacción con el usuario.
        "System": Es una clase predefinida en Java que proporciona acceso a la entrada, salida y errores estándar del sistema.
        "out": Es un objeto de la clase "System" que representa la salida estándar del sistema.
        "println": Es un método de la clase "out" que imprime una línea de texto seguida de un salto de línea en la salida estándar.
        El texto a imprimir se puede especificar como un argumento entre paréntesis y comillas dobles (" "). 
        Puede ser una cadena de caracteres (String), una expresión o una variable que se desee imprimir en la salida estándar. */


        System.out.println("----------------------------------------------------------------------");
        System.out.println("La variable num es: "+num+" la variable nombres es: "+nombre+" la variable num2 es: "+num2);
        System.out.println("----------------------------------------------------------------------");
    }
}
