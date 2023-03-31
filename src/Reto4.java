import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String [] [] memoria = new String [3] [3];
        for (int i = 0; i < memoria.length; i++) {
            for (int j = 0; j < memoria.length; j++) {
                System.out.println(" Escriba la palabra en la posición: " +i+j);
            memoria[i] [j] = lectura.next();

            }
        }
        for (int i = 0; i < memoria.length; i++) {
            for (int j = 0; j < memoria.length; j++) {
                System.out.println(memoria [i] [j]+ "\t");
            }
        }
        lectura.close();
    }
    
}