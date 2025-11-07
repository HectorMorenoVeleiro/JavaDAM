package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Ejemplo1 {

    public static void main(String[] args) {
        int matematicas = AjustesProgramas.introducirIntegerPorScanner("QUE NOTA HA SACADO USTED EN MATES ? --> ");
        int lengua = AjustesProgramas.introducirIntegerPorScanner("\nQUE NOTA HA SACADO USTED EN LENGUA ? --> ");
        System.out.println("____________________________________________");
        if (matematicas >= 5 && lengua < 5) System.out.println("\nMATESSI|LENGUANO");
        else if (matematicas >= 5) System.out.println("\nMATESSI|LENGUASI");
        else if (lengua >= 5) System.out.println("\nMATESNO|LENGUASI");
        else System.out.println("\nMATESNO|LENGUANO");
    }
}
