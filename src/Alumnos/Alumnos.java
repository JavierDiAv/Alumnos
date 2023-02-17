package Alumnos;
import Alumno.Alumno;
import java.util.Scanner;

/**
 * Programa donde pide el nombre y la nota del alumno.
 * Con las notas hace una media de todos los alumnos.
 * @author Javier
 * 
 */
public class Alumnos {
	/**
	 * Este es el main
	 * @param args Main
	 */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    /**
     * Define un array de 5 alumnos
     * @param alum es el alumno.
     */
    Alumno[] alum = new Alumno[5];
    
    
    /**
     * Pide los datos de los alumnos
     */
        
    System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
    /**
     * Crea variables.
     * @param nombreIntroducido String donde se va a introducir el nombre del alumno.
     * @param notaIntroducida Double donde se va a introducir el nombre del alumno.
     */
    String nombreIntroducido;
    double notaIntroducida;
    /**
     * Bucle for donde va a pedir el nombre y la edad de cada alumno que son 5.
     */
    for(int i = 0; i < 5; i++) {
      /**
       *  Utiliza el bucle para ir cambiando de alumno, alum[i].
       */
      alum[i] = new Alumno();          
      System.out.println("Alumno " + i);
      System.out.print("Nombre: ");
      nombreIntroducido = entrada.nextLine();
      (alum[i]).nombre = nombreIntroducido;
      System.out.print("Nota: ");
      notaIntroducida = Double.parseDouble(entrada.nextLine());
      alum[i].nota = notaIntroducida;
    }
        
    System.out.println("Los datos introducidos son los siguientes:");
    /**
     * @param sumaDeMedia Crea esta variable para sumar todas las notas.
     */
    double  sumaDeMedias = 0;
    /**
     * Crea un bucle for para mostrar en pantalla de cada almuno su nombre, su nota y la nota media de todos.
     */
    for(int i = 0; i < 5; i++) {
      System.out.println("Alumno " + i);  
      System.out.println("Nombre: " + alum[i].nombre);    
      System.out.println("Nota media: " + alum[i].nota);
      System.out.println("----------------------------");

      sumaDeMedias += alum[i].nota;
    }
    /**
     * Muestra en pantalla la media de la clase utilizando la variable sumaDeMedias entre 5.
     */
    
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  }
}
