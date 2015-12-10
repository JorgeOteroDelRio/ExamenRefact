/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencdrefact;

import java.util.Scanner;

/**
 *
 * @author joterodelrio
 */
public class ExamenCDRefact {

    public static boolean esPrimo = false;

    public static void main(String[] args) {
        int dig = introducirDigito();
        int ndig = 0;
        if (dig <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int numComparar = 1; numComparar <= 99999; numComparar++) {

            ndig = contarDivisionEntera(numComparar);

            if (ndig == dig) {
                if (numComparar < 4) {
                    esPrimo = true;
                } else {
                    if (numComparar % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (numComparar - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (numComparar % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(numComparar);
                }
            }
        }
    }

    public static int contarDivisionEntera(int i) {
        int aux = i;
        int contador = 0;
        while (aux != 0) {
            aux = aux / 10;
            contador++;
        }
        return contador;
    }

    public static int introducirDigito() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un dígito:");
        return teclado.nextInt();
    }

}
