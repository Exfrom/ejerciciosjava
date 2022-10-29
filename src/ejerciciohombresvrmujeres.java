import java.util.Scanner;

public class ejerciciohombresvrmujeres {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int hombre=0, mujer=0, eleccion=0;
       
        for(int x=1; x<=10; x++){
            System.out.println("Ingrese su genero \n 1-hombre \n 2-mujer \n");
            eleccion=leer.nextInt();
            if(eleccion==1){
                hombre=hombre+1;
            }
            else if(eleccion==2){
                mujer=mujer+1;
            leer.close();
            }
        }
    System.out.println("El total de hombres es "+hombre);
    System.out.println("El total de mujeres es "+mujer);
    }
}