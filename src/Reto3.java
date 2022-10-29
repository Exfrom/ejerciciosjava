import java.util.Scanner;
import java.util.Random;
public class Reto3 {
    public static void main(String[] args){
        int moneda, eleccion;
        Scanner entrada=new Scanner(System.in);
        Random aleatorio=new Random();
        moneda=(int)(aleatorio.nextDouble()*2+1);
        System.out.println("Selecciona \n 1.para cara \n 2.para sello \n");
        eleccion=entrada.nextInt();
        if (moneda==eleccion){
            System.out.println("Ganaste, eleccion coincide con la moneda");
        }
        else if(moneda!=eleccion){
            System.out.println("Perdiste, eleccion no coincide con la moneda");
         }
         else{
            System.out.println("Eleccion Errada");
         }
         entrada.close();

    }
}
