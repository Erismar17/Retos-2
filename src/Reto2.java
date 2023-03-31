import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nombres, nadador;
        int numeroNadadores, tiempo;
        System.out.println("Éste programa le permite saber qué nadador llegó primero a la meta. \n¿Cuántos competidores habían?");
        numeroNadadores=lectura.nextInt();
        int[] segundos = new int[numeroNadadores];
        String [] nadadores = new String [numeroNadadores];
        for (int i = 0; i < nadadores.length; i++) {
            System.out.println("Escriba el nombre del competidor: ");
            nadador=lectura.next();
            System.out.println(" Escriba el tiempo de recorrido en segundos: " );
            segundos[i]=lectura.nextInt();
        lectura.close();
        }
    }
}