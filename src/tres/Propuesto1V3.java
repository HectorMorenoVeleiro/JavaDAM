package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Propuesto1V3 {
    public static void main(String[] args) {
        int mayor = AjustesProgramas.introduceNumeroPorScanner("escribe a: ");
        int b = AjustesProgramas.introduceNumeroPorScanner("escribe b: ");
        int c = AjustesProgramas.introduceNumeroPorScanner("escribe c: ");
        int menor = mayor;
        if (b > mayor)
            mayor = b;
        else if (b < menor)
            menor = b;
        if (c > mayor)
            mayor = c;
        else if (c < menor)
            menor = c;
        System.out.println("el mayor es " + mayor + " y el menor es " + menor);
    }
}
