package buquedabinaria;

import java.util.Scanner;

public class BuquedaBinaria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int aux;
        int inferior = 0;
        int centro;
        int superior = 10 - 1;
        centro = (superior + inferior) / 2;

        //******Busqueda Binario*****//
        //ingreso de datos  al arreglo
        System.out.println("ingrese los Datos del Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        
        //la busqueda binaria siempre se tiene que ordenar para buscar el dato
        System.out.println("____________"
                + "orden");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {

                    aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;

                }
            }

        }
        
        //muestra los datos oredenados 
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + "  ");
        }
        
        //busqueda binaria comiensa en la mitad  y busca si el numero esta en el parte menor o mayor 

        System.out.println("Digit el dato a buscar");
        int numero = entrada.nextInt();

        while (inferior <= superior && numero != arreglo[centro]) {
            centro = (superior + inferior) / 2;

            if (numero > arreglo[centro]) {
                inferior = centro + 1;

            } else if (numero < arreglo[centro]) {
                superior = centro - 1;
            }

        }
        if (numero == arreglo[centro]) {
            System.out.println("El número se encuentra en la posición: " + centro);
        } else {
            System.out.println("El número no está en el arreglo.");
        }

    }

}
