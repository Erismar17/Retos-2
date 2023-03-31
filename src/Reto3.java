import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String [] [] nombreProducto = new String [4] [4];
        int [] [] precioProducto = new int [4] [4];

        for (int i = 0; i < nombreProducto.length; i++) {
            for (int j = 0; j < nombreProducto.length; j++) {
            System.out.println(" Escriba el producto en la posición " +i+j+":");
            nombreProducto[i] [j] = lectura.next();
            System.out.println(" Escriba el precio del producto en la posición " +i+j+":");
            precioProducto[i] [j] = lectura.nextInt();
            }
        }

        for (int i = 0; i < nombreProducto.length; i++) {
            for (int j = 0; j < nombreProducto.length; j++) {
        System.out.print(i+j+"\t");
            }
            for (int j = 0; j < precioProducto.length; j++) {
                System.out.print(nombreProducto [i] [j]+ "\t");
            }
            for (int j = 0; j < precioProducto.length; j++) {
                System.out.print(precioProducto [i] [j]+"\t");
            }
        }
    lectura.close();
    }
}