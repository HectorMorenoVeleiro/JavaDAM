package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Propuesto10 {
    // numero vampiro

    public static boolean metodoVampirico(int digito1, int digito2, int numeroVampiro) {
        boolean esNumeroVampiroConEstosDigitos = false;
        if (digito1 * digito2 == numeroVampiro && !(digito1 % 10 == 0 && digito2 / 10 == 0))
            esNumeroVampiroConEstosDigitos = true;
        return esNumeroVampiroConEstosDigitos;
    }

    public static void main(String[] args) {
        /*
         * numero vampiro:
         * · numero par de digitos (20, 4053, 432224)
         * · colmillos (son fruto de la multiplicacion de
         * numeros del original, teniendo la mitad de este)
         * · permutacion (los dos colmillos combinados en x
         * forma forman el numero original)
         * · condicion de ceros (no pueden terminar ambos en 0)
         */

        // Llamas al numero por escaner
        int numeroVampiro = AjustesProgramas.introduceRangoDeIntegers(10000, 999,
                "Introduce un número de 4 digitos --> ");

        boolean esNumeroVampiro = false;

        // divides el numero en digitos
        int digito1 = numeroVampiro % 10;
        int digito2 = (numeroVampiro / 10) % 10;
        int digito3 = (numeroVampiro / 100) % 10;
        int digito4 = numeroVampiro / 1000;

        // haces todas las combinaciones de digitos
        int operacion1 = digito1 + digito2 * 10;
        int operacion2 = digito1 + digito3 * 10;
        int operacion3 = digito1 + digito4 * 10;
        int operacion4 = digito2 + digito3 * 10;
        int operacion5 = digito2 + digito4 * 10;
        int operacion6 = digito4 + digito3 * 10;

        // llamas a un metodo que compruebe si esa combinacion es = numeroVampiro y si
        // alguna de esas lo es entonces el numero tmb
        if (metodoVampirico(digito1, digito2, numeroVampiro)
                || metodoVampirico(operacion1, operacion2, numeroVampiro)
                || metodoVampirico(operacion1, operacion3, numeroVampiro)
                || metodoVampirico(operacion1, operacion4, numeroVampiro)
                || metodoVampirico(operacion1, operacion5, numeroVampiro)
                || metodoVampirico(operacion1, operacion6, numeroVampiro)
                || metodoVampirico(operacion2, operacion3, numeroVampiro)
                || metodoVampirico(operacion2, operacion4, numeroVampiro)
                || metodoVampirico(operacion2, operacion5, numeroVampiro)
                || metodoVampirico(operacion2, operacion6, numeroVampiro)
                || metodoVampirico(operacion3, operacion4, numeroVampiro)
                || metodoVampirico(operacion3, operacion5, numeroVampiro)
                || metodoVampirico(operacion3, operacion6, numeroVampiro)
                || metodoVampirico(operacion4, operacion5, numeroVampiro)
                || metodoVampirico(operacion4, operacion6, numeroVampiro)
                || metodoVampirico(operacion5, operacion6, numeroVampiro))
            esNumeroVampiro = true;

        // le comentas tu descubrimiento al colegón que prueba el programa
        System.out.println("El numero " + numeroVampiro + " es un numero vampiro ? --> " + esNumeroVampiro);
    }
}
