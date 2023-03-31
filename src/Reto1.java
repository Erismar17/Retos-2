import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        int[] numeros ;
        int cantidad;
        System.out.println("¿Cuantos números desea registrar?");
        cantidad=lectura.nextInt();
        numeros=new int [cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escriba el número en la posición "+i);
            numeros[i]=lectura.nextInt();

        }
        for (int numero : numeros) {
        if (numero % 2 == 0) {
            System.out.println(numero + " es un múltiplo de 2");
        } else {
            System.out.println(numero + " no es un múltiplo de 2");
        }
        }
    }
}