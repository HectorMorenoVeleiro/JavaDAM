package tres;

import EjerciciosClase.AjustesProgramas;

public class AritmeticaRec {
    // programa que muestre los 50 primeros pares

    // metodo sacar termino n gracias a conocer el termino anterior a el
    public static int terminoEne(int primerNumero, int diferencia) {
        // recursividad
        if (algo)
            return primerNumero;
        // recursividad caso generico
        else (algo)
            return terminoEne(primerNumero, diferencia);
    }

    public static void main(String[] args) {

        int primerNumero = AjustesProgramas.introducirIntegerPorScanner("primer termino --> ");
        int diferenciaASumar = AjustesProgramas.introducirIntegerPorScanner("diferencia a sumar --> ");
        int terminoAObtener = AjustesProgramas.introducirIntegerPorScanner("dime que termino deseas obtener --> ");

        int terminoMomento = primerNumero;
        int acumula = primerNumero;

        // for (char i = 'a'; i < 'a' + terminoAObtener; i++) {
        // System.out.print(i + ".[" + terminoMomento + "]\t");
        // terminoMomento *= diferenciaASumar;
        // acumula += terminoMomento;
        // }

        System.out.println("\nel termino " + terminoAObtener + " es: " + terminoMomento);
        System.out.println("la suma de los " + terminoAObtener + " primeros terminos de la sucesion es " + acumula);

        System.out.println("la suma por FORMULA DA : "
                + primerNumero * ((int) Math.pow(diferenciaASumar, terminoAObtener) - 1) / (diferenciaASumar - 1));

        long primer = AjustesProgramas.introducirLongPorScanner("introduce el primero --> ");
        long ultimo = AjustesProgramas.introducirLongPorScanner("introduce el ultimo --> ");

        long n = ultimo - primer + 1;
        long suma = (n * (primer + ultimo)) / 2;

        // System.out.println("la suma de tu sucesion es " + (long) (suma));
    }
}