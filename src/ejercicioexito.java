import java.util.Scanner;
public class ejercicioexito {
    public static void main(String[] args) {
        int precio, cantidad, referencias=0, subtotal, total=0, billete=0, op;
        Scanner leer=new Scanner(System.in);
        for(int x=1; x<=5; x++){
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
        } 
        System.out.println("El total de es compra es " +total);
        System.out.println("Con cuanto va a cancelar?:");
        billete=leer.nextInt();
        System.out.println("Su cambio es " +(billete-total));
        System.out.println("Usted tiene movil exito  digite \n 1.si \n 2.no \n");
        op=leer.nextInt();
        System.out.println("La cantidad  de minutos de la compra es "+referencias);
        
        leer.close();
 
    }

}
