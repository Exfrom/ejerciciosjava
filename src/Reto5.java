import java.util.Scanner;
public class Reto5 {
    Scanner entrada = new Scanner(System.in);{
        String nombre, apellido; 
              
        System.out.println("ingresa tu nombre: ");
        nombre=entrada.nextLine();
        System.out.println("la longitud de nombre es " + nombre.length() );
            
        System.out.println("ingresa tu apellido: ");
        apellido=entrada.nextLine();
        System.out.println("la longitud de apellido es " + apellido.length() );
            
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());
            
        String nombreabrev = nombre.substring(0, 2);
        System.out.println(nombreabrev);
        System.out.println(nombreabrev+apellido);
            
        String nombre_completo = (nombre+apellido);
        System.out.println(nombre_completo);
        }
     
    }

