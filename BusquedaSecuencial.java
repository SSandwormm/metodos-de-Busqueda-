package busquedasecuencial;

import java.util.Scanner;

public class BusquedaSecuencial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int dato ;
        boolean band =false;

        //ingreso de datos
        System.out.println("ingrese los Datos del Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        //la busqueda de dato secuencial o lineal comienza desde la la poscicon 1 hasta encontrarlo 
        System.out.println("dato abuscar ");
        dato = entrada.nextInt();
        int i = 0, pos = 0;
        while (i < arreglo.length && band == false) {
            if (dato == arreglo[i]) {
                band = true;
                pos = i;
                break;
            }
            i++;
        }
        if (band == false) {
            System.out.println("El numero no se encuentra en el arreglo");
        } else {
            System.out.println("El numero ha sido encontrado y esta en la posición " + (pos + 1));
        }

    }

}


