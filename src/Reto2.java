import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args){
        System.out.println("Dosis vacuna");
        Scanner leer=new Scanner(System.in);
        float pesobb, mesesbb,dosisvacuna;
        System.out.println("Ingrese el peso del bebe:");
        pesobb=leer.nextFloat();
        System.out.println("Ingrese los meses del bebe:");
        mesesbb=leer.nextFloat();
        dosisvacuna=((pesobb+10)/(mesesbb*10))*8;
        System.out.println("la dosis ideal de vacuna para el bb: "+dosisvacuna);
        leer.close();
}
}