import java.util.Scanner;
import java.util.Random;
public class Reto4 {
    public static void main(String[] args) {
        int maquina, eleccion;
        Scanner entrada=new Scanner(System.in);
        Random aleatorio=new Random();
        maquina=(int)(aleatorio.nextDouble()*2+1);
        System.out.println("Selecciona \n 1.piedra  \n 2.papel  \n 3.tijera \n");
        eleccion=entrada.nextInt();

        if (eleccion==1 && maquina==2){
            System.out.println("perdiste, gana la maquina");
        }
        else if (eleccion==2 && maquina==3){
            System.out.println("perdiste, gana la maquina");
        }
        else if (eleccion==3 && maquina==1){
            System.out.println("perdiste, gana la maquina");
        }
        else if (maquina==1 && eleccion==2){
            System.out.println("Felicitaciones, le ganaste a la maquina!!");
        }
        else if (maquina==2 && eleccion==3){
            System.out.println("Felicitaciones, le ganaste a la maquina!!");
        }
        else if (maquina==3 && eleccion==1){
            System.out.println("Felicitaciones, le ganaste a la maquina!!");
        }
        else if (maquina==eleccion){
            System.out.println("Empate");
        }
        else{
            System.out.println("Lo siento, eleccion incorrecta");
        }

        entrada.close();

    }
}
