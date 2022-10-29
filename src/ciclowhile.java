import java.util.Scanner;

public class ciclowhile {
    
    public static void main(String[] args) {
        int precio, cantidad, referencias=0, subtotal, total=0;
        String seguir="s";
            Scanner leer=new Scanner(System.in);
            while(seguir.equals("s")){
            System.out.println("Digite el precio del producto");
            precio=leer.nextInt();
            System.out.println("Digite el precio del cantidad");
            cantidad=leer.nextInt();
            subtotal=precio*cantidad;
            //iniciar el contador de minutos de la compra
            referencias=referencias+1;
            System.out.println(cantidad+"del producto del precio"+precio+" es "+subtotal);
            //iniciamos acumulador para el total de la compra
            total=total+subtotal; 
            leer.nextLine();
            System.out.println("Desea registrar otro producto s / n ");
        } 
        while(seguir.equals("s"));
        System.out.println("El total de es compra es " +total);
        System.out.println("La cantidad  de minutos de la compra es "+referencias);
    }
}
