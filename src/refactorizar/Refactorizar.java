package refactorizar;

import java.util.Scanner;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar {

    public static void main(String[] args) {
        boolean primo = false;
        int digitos;
        int contadorDigitos = 0;
        digitos = scanDigitos();
        if (digitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorDigitos = contador;

            if (contadorDigitos == digitos) {
                if (i < 4) {
                    primo = true;
                } else {
                    if (i % 2 == 0) {
                        primo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(i);
                }
            }
        }
    }

    private static int scanDigitos() {
        int digitos;
        System.out.print("Introducir digitos: ");
        Scanner parida = new Scanner(System.in);
        digitos = parida.nextInt();
        return digitos;
    }

}
