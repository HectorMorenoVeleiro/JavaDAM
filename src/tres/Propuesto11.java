package tres;

import EjerciciosClase.AjustesProgramas;

public class Propuesto11 {
    // programa que muestre los 50 primeros pares
    // vale ns que estamos haciendo
    public static void main(String[] args) {
        int primerNumero = AjustesProgramas.introducirIntegerPorScanner("primer termino --> ");
        int razonASumar = AjustesProgramas.introducirIntegerPorScanner("razon a sumar --> ");
        int terminoAObtener = AjustesProgramas.introducirIntegerPorScanner("dime que termino deseas obtener --> ");
        int termino = 0;
        for (int i = primerNumero; i < terminoAObtener; i++) {
            System.out.println(termino + " ");
            termino += razonASumar;
            // vale el numero va sumando en termino el intervalo pasado en
            // razon a sumar y entonces va desde el primer numero que diga hasta el termino
            // a obtener, pero de igual forma no entiendo el proposito de "primer numero"
            // pues este no deberia aparecer nunca, el contador comienza desde termino,
            // y este no interacciona en ningun momento con "primerNumero" por lo que ese
            // termino solo recortaria "terminoAObtener" haciendo que el programa resulte
            // mas corto de lo esperado, estaría mal o hecho de forma antiintuitiva pese a
            // compilar bien.
        }
        System.out.println("el termino " + terminoAObtener + " es: " + termino);
    }
}
