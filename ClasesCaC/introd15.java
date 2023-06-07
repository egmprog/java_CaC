package ClasesCaC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

/**
 * Comentarios de documentación
 * Título del programa
 * 
 * @autor: Eduardo Molino
 * @version 1.0
 */

// Temas desarrollados en la clase del 06/06/2023
// uso de archivos
// manejo de errores: try / catch

/*
 * Temas:
 * 1. Crear un archivo,
 * 2 .cargarle registros...
 * p. ej: ana, lopez (123)
 * juan, perez (456)
 * 3. Leer el archivo y dejar el contenido en un arrayList
 * 5. modificar un registro del archivo
 * a. traer todo el contenido del archivo y dejarlo en un arrayList
 * b. modificar el arryList
 * c. grabar esa modificacion en el archivo
 * 6. borrar un registro del archivo
 * a. traer todo el contenido del archivo y dejarlo en un arrayList
 * b. eliminar el arryList
 * c. grabar esa modificacion en el archivo
 */

public class introd15 {
     // zona para variables globales, constantes, metodos
     // crear una constante que es el nombre del archivo
     private static final String FILE_PATH = "alumnos.txt";

     public static void main(String[] args) {
          // código principal
          // alta de alumno es un metodo
          altaAlumno("Ana", "Pacheco", 123);
          altaAlumno("Juan", "Lopez", 456);

          List<String> listado = listarAlumnos();
          System.out.println(listarAlumnos());

     }

     // metodos
     public static List<String> listarAlumnos() {
          List<String> alumnos = new ArrayList<>();
          try (BufferedReader leer = new BufferedReader(new FileReader(FILE_PATH))) {
               String linea;
               while ((linea = leer.readLine()) != null) {
                    alumnos.add(linea);
               }
          } catch (IOException e) {
               System.out.println("Hubo un error: " + e.getMessage());
          }
          return alumnos;
     }

     public static void altaAlumno(String nombre, String apellido, int dni) {
          try (BufferedWriter buffer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
               // aca va el código para escribir en el archivo
               buffer.write(nombre + ", " + apellido + "(" + dni + ")");
               buffer.newLine();
          } catch (IOException e) {
               System.out.println("No se pudo grabar en el archivo" + e.getMessage());
          }
     }

}
