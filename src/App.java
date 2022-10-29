import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //definir un objeto
        Scanner leer=new Scanner(System.in);
        //datos entrada
        final double PI=3.1416;
        double radio,area;
        System.out.println("Ingrese el radio del circulo");
        radio=leer.nextDouble();
        //procesar la informacion
        area=PI*radio*radio;
        //Salida
        System.out.println("El area del circulo con radio "+radio+"es"+area);
        leer.close();
    }
}
