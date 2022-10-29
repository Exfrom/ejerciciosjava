import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
    
        Scanner leer=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad ");
        edad=leer.nextInt();
        
        if (edad>=0 || edad<=12){
            //lo que pasa si la condicion se cumple
            System.out.println("Eres un niño");
        }
        else if ((edad>=13 || edad<=17)){
            System.out.println("Eres un adolecente");
        }
        else if((edad<=18 || edad>=40) && (edad<=41 || edad>=60)){
            System.out.println("Eres un adulto");
        }
        else{
            System.out.println("pa la casa a lavar los platos");
        }
        leer.close();
    }
}
        





