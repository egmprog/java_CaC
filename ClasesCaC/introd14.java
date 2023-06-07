package ClasesCaC;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Comentarios de documentación
 * Título del programa
 * 
 * @autor: Eduardo Molino
 * @version 1.0
 */

// Temas desarrollados en la clase del 02/06/2023

/*
 * Temas:
 * ArrayList
 * Clases (se usa una clase creada en archivo aparte llamada: Persona)
 * Introducción a los menús del tipo frame
 */

public class introd14 {
    public static void main(String[] args) {
        System.out.println("---------------------INICIO--------------------");

        Scanner teclado = new Scanner(System.in);
        int opcion, menu, dni, comision;
        String nombre, apellido;
        menu = 1;
        /*
         * System.out.println(
         * "Ingrese la opción de carga de datos: 1.- Datos Predefinidos;  2.- Datos ingresados manualmente."
         * );
         * opcion = teclado.nextInt();
         * ArrayList<Persona> listaDeAlumnos;
         * 
         * if (opcion == 1) {
         * listaDeAlumnos = cargarDatosPredefinidos();
         * } else {
         * listaDeAlumnos = cargarDatosScanner();
         * }
         */
        ArrayList<Persona> listaDeAlumnos;
        listaDeAlumnos = cargarDatosScanner();
        while (menu != 100) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("     MENU     " + "\n" +
                    "1.- Ingresar Alumno sin cargar datos " + "\n" +
                    "2.- Modificar Alumno " + "\n" +
                    "3.- Quitar Alumno " + "\n" +
                    "4.- Listar Alumnos " + "\n" +
                    "5.- Cantidad de Alumnos " + "\n" +
                    "6.- Ingresar Alumno con carga de datos " + "\n" +
                    "100.- Salir"

            ));

            switch (menu) {
                case 1:
                    Persona alumnoNew = new Persona("Ana", "Gutierrez", 1234, 4);
                    listaDeAlumnos.add(alumnoNew);
                    break;
                case 4:
                    System.out.println(listaDeAlumnos);
                    break;
                case 6:
                    System.out.println("Ingrese los datos del alumno");
                    nombre = JOptionPane.showInputDialog("ingresa el nombre del Alumno");
                    apellido = JOptionPane.showInputDialog("ingrese el apellido del Alumno");
                    dni = Integer.parseInt(JOptionPane.showInputDialog("ingrese el DNI"));
                    comision = Integer.parseInt(JOptionPane.showInputDialog("ingrese la comision"));
                    listaDeAlumnos.add(new Persona(nombre, apellido, dni, comision));
                case 100:
                    System.out.println("Salir.");
                    break;
                default:
                    System.out.println("Opción inválida.");

            }
        }
    }

    /*
     * static ArrayList<Persona> cargarDatosPredefinidos() {
     * ArrayList<Persona> listadoPersonas = new ArrayList<>();
     * listadoPersonas.add(new Persona("juan", "pacheco", 123, 1));
     * listadoPersonas.add(new Persona("ana", "pacheco", 1234, 2));
     * listadoPersonas.add(new Persona("julia", "perez", 12345, 1));
     * listadoPersonas.add(new Persona("laura", "nicolas", 12, 1));
     * listadoPersonas.add(new Persona("miguel", "tevez", 333, 2));
     * listadoPersonas.add(new Persona("ramiro", "santacruz", 444, 2));
     * listadoPersonas.add(new Persona("amanda", "ferreira", 555, 1));
     * listadoPersonas.add(new Persona("natalia", "razetto", 666, 1));
     * listadoPersonas.add(new Persona("andrea", "migleoti", 777, 3));
     * Persona miPersona = new Persona("andrea", "migleoti", 777, 3);
     * 
     * return listadoPersonas;
     * }
     */
    static ArrayList<Persona> cargarDatosScanner() {
        ArrayList<Persona> listaDeAlumnos;
        return listaDeAlumnos;
    }

}
