package tres;

import EjerciciosClase.AjustesProgramas;

public class Propuesto11 {
    // programa que muestre los 50 primeros pares
    public static void main(String[] args) {
        int primerNumero = AjustesProgramas.introducirIntegerPorScanner("primer termino --> ");
        int razonASumar = AjustesProgramas.introducirIntegerPorScanner("razon a sumar --> ");
        int terminoAObtener = AjustesProgramas.introducirIntegerPorScanner("dime que termino deseas obtener --> ");
        int termino = 0;
        for (int i = primerNumero; i < terminoAObtener; i++) {
            System.out.println(termino + " ");
            termino += razonASumar;
        }
        System.out.println("el termino " + terminoAObtener + " es: " + termino);
    }

}
