package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Propuesto3 {
    public static void main(String[] args) {
        int limite = AjustesProgramas.introduceNumeroPorScanner(
                "INTRODUCE EL NUMERO DE FILAS --> ");
        for (int i = 0; i <= limite; i++) {
            if (i <= limite / 2) {
                for (int k = limite; k > i; k--)
                    System.out.print(" ");
                for (int j = 0; j < 2 * i + 1; j++)
                    System.out.print("*");
                System.out.println();
            } else {
                for (int k = 0; k < i; k++)
                    System.out.print(" ");
                for (int j = i / 2 - 1; j > 0; j--)
                    System.out.print("*");
                System.out.println();
            }
        } // bucle externo
    }
}
