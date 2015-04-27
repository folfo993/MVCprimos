/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oquintansocampo
 */
public class Vista {

    public static int scanDigitos() {
        int digitos;
        do {
            System.out.print("Introducir digitos: ");
            Scanner parida = new Scanner(System.in);
            digitos = parida.nextInt();
            if (digitos <= 0) {
                System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
            }
        } while (digitos <= 0);        
        return digitos;
    }

    public static void imprimir(Modelo lista) {
        ArrayList<Integer> primos = lista.getListaP();
        for (Integer primo : primos) {
            System.out.println(primo);
        }
    }
}
