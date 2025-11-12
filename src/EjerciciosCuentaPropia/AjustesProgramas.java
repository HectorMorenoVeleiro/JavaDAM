package EjerciciosCuentaPropia;

import java.util.Scanner;

public class AjustesProgramas {
    // Ajustes programas es una clase dedicada a la
    // iniciación de formas, ejemplos y mas que tengan
    // objetivo la simplificación de código de forma mas
    // eficiente
    public static Scanner sc = new Scanner(System.in);

    public static int introduceNumeroPorScanner(String orden) {
        // Esta clase simplifica el método para que no haya necesidad de explicar mas
        int numero1;
        System.out.print(orden);
        numero1 = Integer.parseInt(sc.nextLine());
        return numero1;
    }

    public static String introducePalabraPorScanner(String orden) {
        String palabra;
        System.out.print(orden);
        palabra = sc.nextLine();
        return palabra;
    }

    public static int operacionNumeros(int numero1, int numero2, String orden) {
        int resultado = 0;
        switch (orden) {
            case "suma" -> resultado = numero1 + numero2;
            case "resta" -> resultado = numero1 - numero2;
            case "multiplicacion" -> resultado = numero1 * numero2;
            case "division" -> resultado = numero1 / numero2;
            case "resto" -> resultado = numero1 % numero2;
        }
        return resultado;
    }

    public static void CalculadoraEnTerminal() {
        CalculadoraEnTerminal.menu();
    }

    public static int cuentaDigitosNumero(int numero) {
        int digitos = 0;
        while (numero > 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }

    public static int invierteOrdenNumero(int numero) {
        int potenciaNumero = cuentaDigitosNumero(numero) - 1;
        int reverso = 0;
        while (numero > 0) {
            int cifra = numero % 10;
            numero /= 10;
            reverso += cifra * Math.pow(10, potenciaNumero);
            potenciaNumero--;
        }
        return reverso;
    }

    public static int introduceRangoDeIntegers(int rangoSuperior, int rangoInferior, String orden) {
        int numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Integer.parseInt(sc.nextLine());
                if (numero1 >= rangoInferior && numero1 <= rangoSuperior) {
                    break;
                } else {
                    System.out.println("ERROR: Fuera de rango");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static String introduceStringPorScanner(String orden) {
        String palabra;
        while (true) {
            System.out.print(orden);
            palabra = sc.nextLine();
            if (!palabra.isEmpty()) {
                break;
            } else {
                System.out.println("ERROR: No puede estar vacío");
            }
        }
        return palabra;
    }

    public static float introduceFloatPorScanner(String orden) {
        float numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static double introducirDoublePorScanner(String orden) {
        double numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static int introducirIntegerPorScanner(String orden) {
        int numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static long introducirLongPorScanner(String orden) {
        long numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Long.parseLong(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static int salir() {
        System.out.println(
                """
                        \tQue deseas hacer?
                        \t(1)Seguir
                        \t(2)Salir
                        ____________________________""");
        return introduceRangoDeIntegers(2, 1, null);
    }
}
