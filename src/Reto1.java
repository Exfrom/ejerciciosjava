import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args){
        System.out.println("Reto la abuela");
        Scanner leer=new Scanner(System.in);
        double Fahrenheit,centigrados;
        System.out.println("Ingrese los grados Fahrenheit:");
        Fahrenheit=leer.nextDouble();
        centigrados=(Fahrenheit-32)/1.8;
        System.out.println("Los grados centigrados: "+centigrados);
        leer.close();
    }
}


