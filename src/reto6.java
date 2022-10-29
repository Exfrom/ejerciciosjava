import java.util.Scanner;
import java.util.Random;
public class reto6 {
    public static void main(String[] args) {
        int cantidad, precio, total=0, subtotal=0, balota, descuento=0, efectivo, pagofinal, vueltas;
        String desicion="si";
        Scanner leer=new Scanner (System.in);
        
        do{
        System.out.println("ingresa la cantidad del producto: ");
        cantidad=leer.nextInt();
        System.out.println("ingresa el precio del producto: ");
	    precio=leer.nextInt();
	    subtotal=cantidad*precio;
        total+=subtotal;
        leer.nextLine();
        System.out.println("El  total de la compra es:" +total);
       
            if(subtotal>=0){
                System.out.println("Desea ingresar otro producto:si \n");
                desicion=leer.nextLine();
            }
                
                    
        }

        while(desicion.equals("si"));
        {
        System.out.println("balota:\n 1.bolitaroja=10% \n 2.bolitaaazul=30% \n 3.bolitaamarilla=50% \n 4.bolitablanca=100% \n ");
        Random aleatorio =new Random();
        balota=(int)(aleatorio.nextDouble()*4+1);
        System.out.println(balota);
        }
        if (balota==1 && total>=50000){
            System.out.println("FELICITACIONES!! sacaste la bolita roja \n por lo tanto obtienes el 10% de descuento en tu compra!!!.. \n");
            descuento = (int)(total*0.10);
            pagofinal=total-descuento;
            System.out.println("El valor de su compra con descuento es: \n" +pagofinal);
            System.out.println("Con cuanto cancela: ");
            efectivo=leer.nextInt();
            vueltas=pagofinal-efectivo;
            System.out.println("Sus vueltas son: \n "+vueltas);
        }   
        else if(balota==2 && total>=50000){
            System.out.println("FELICITACIONES!! sacaste la bolita azul \n por lo tanto obtienes el 30% de descuento en tu compra!!!..\n");
            descuento = (int)(total*0.30);
            pagofinal=total-descuento;
            System.out.println("El valor de su compra con descuento es" +pagofinal);
            System.out.println("Con cuanto cancela: ");
            efectivo=leer.nextInt();
            vueltas=pagofinal-efectivo;
            System.out.println("Sus vueltas son: \n "+vueltas);
        }   
        else if(balota==3 && total>=50000){
            System.out.println("FELICITACIONES!! sacaste la bolita amarilla \n por lo tanto obtienes el 50% de descuento en tu compra!!!!...\n");
            descuento = (int)(total*0.50);
            pagofinal=total-descuento;
            System.out.println("Con cuanto cancela: ");
            efectivo=leer.nextInt();
            System.out.println("El valor de su compra con descuento es: \n" +pagofinal);
            vueltas=pagofinal-efectivo;
            System.out.println("Sus vueltas son: \n "+vueltas);
        }
        else if(balota==4 && total>=50000){
            System.out.println("FELICITACIONES!! sacaste la bolita blanca \n por lo tanto obtienes el 100% de descuento en tu compra!!!...\n");
            System.out.println("FELICITACIONES TU COMPRA SALIO GRATIS!!!!!!....");
        }
        else if(total<=49999){
            System.out.println("Lo siento no puedes participar en el sorteo!!! \n su compra es de un monto inferior a 50mil pesos!! \n Lo invitamos a que siga comprando!!!...\n");
        }
    }

}
