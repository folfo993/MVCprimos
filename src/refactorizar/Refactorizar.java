package refactorizar;

/**
 *
 *
 */
public class Refactorizar {

    public static void main(String[] args) {
        Modelo mod = new Modelo();
        boolean primo = false;
        int contadorDigitos;
        mod.setDigitos(Vista.scanDigitos());
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;
            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorDigitos = contador;
            if (contadorDigitos == mod.getDigitos()) {
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
                    mod.add(i);
                }
            }
        }
        Vista.imprimir(mod);
    }

}
