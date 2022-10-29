import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        int op, num1, num2, total=0;
        
        double potencia;
        double rcuadrada;
           
        System.out.println("Menu Opciones \n 1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Division\n 5.potencia\n 6.raiz\n Ingrese el numero de la opcion que desee realizar");
        op=entrada.nextInt();
        
        System.out.println("Ingrese el numero1");
        num1=entrada.nextInt();
        System.out.println("Ingrese el numero2");
        num2=entrada.nextInt();
        switch(op){
                
        case 1:
            total=num1+num2;
            System.out.println("la suma de los numeros es"+total);

        break;
        case 2:
            total=num1-num2;
            System.out.println("la resta de los numeros es" +total);
        break;
        case 3:
            total=num1*num2;
            System.out.println("La multiplicacion de los numeros es"+total);
        break;
        case 4:
            total=num1/num2;
            System.out.println("La division de los numeros es:" +total);
        break;
        case 5:
            potencia=Math.pow(num1,num2);
            System.out.println("el total de la potencia de:"+num1+ " y " +num2+ " es " +potencia);
            
                   
        break;
        case 6:
            rcuadrada=Math.sqrt(num1);
            System.out.println("La raiz cuadrada es:"+rcuadrada);
            rcuadrada=Math.sqrt(num2);
            System.out.println("La raiz cuadrada es:"+rcuadrada);
        break;
        default:
        System.out.println("la opcion seleccionada no es valida");
        break;
                

        }   
    }
}

        

    

