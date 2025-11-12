package EjerciciosCuentaPropia;

import java.util.Scanner;

public class CalculadoraEnTerminal {

    public static double numero1, numero2;
    public static int decision;
    public static boolean booleano;
    public static Scanner scDecision = new Scanner(System.in);

    public static void menu() {
        booleano = true;
        System.out.println("\nQue operacion deseas realizar\n"
                + "\n\t(1) Suma"
                + "\n\t(2) Resta"
                + "\n\t(3) Multiplicacion"
                + "\n\t(4) Division"
                + "\n\t(5) Salir"
                + "\n_________________________________");

        do {
            if (scDecision.hasNextInt()) {
                decision = Integer.parseInt(scDecision.nextLine());
                booleano = false;
            } else {
                scDecision.nextLine();
                booleano = true;
            }
            if (((decision < 1) || (decision > 5))) {
                System.out.println("Por favor, introduce un entero");
                booleano = true;
            }
        } while (booleano);

        switch (decision) {
            case 1 -> operacionSuma();
            case 2 -> operacionResta();
            case 3 -> operacionMultiplicacion();
            case 4 -> operacionDivision();
            case 5 -> salidaUsuario();
        }
    }

    public static void operacionSuma() {
        System.out.println("\nintroduce el primer numero a sumar: \n");
        numero1 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nintroduce el segundo numero a sumar\n");
        numero2 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nLa suma de " + numero1 + " + " + numero2 + " da: " + (numero1 + numero2));
        salidaUsuario();
    }

    public static void operacionResta() {
        System.out.println("\nintroduce el primer numero a restar: \n");
        numero1 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nintroduce el segundo numero a restar: \n");
        numero2 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nLa resta de " + numero1 + " - " + numero2 + " da: " + (numero1 - numero2));
        salidaUsuario();
    }

    public static void operacionMultiplicacion() {
        System.out.println("\nintroduce el primer numero a multiplicar: \n");
        numero1 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nintroduce el segundo numero a multiplicar: \n");
        numero2 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nLa multiplicacion de " + numero1 + " * " + numero2 + " da: " + (numero1 * numero2));
        salidaUsuario();
    }

    public static void operacionDivision() {
        System.out.println("\nintroduce el primer numero a dividir: \n");
        numero1 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nintroduce el segundo numero a dividir: \n");
        numero2 = scDecision.nextDouble();
        scDecision.nextLine();
        System.out.println("\nLa division de " + numero1 + " / " + numero2 + " da: " + (numero1 / numero2));
        salidaUsuario();
    }

    public static void salidaUsuario() {
        System.out.println("\nDeseas salir?\n"
                + "\n\t(1) Salir"
                + "\n\t"
                + "\n\t(2) Menu"
                + "\n_________________________________");

        do {
            if (scDecision.hasNextInt()) {
                decision = Integer.parseInt(scDecision.nextLine());
                booleano = false;
            } else {
                scDecision.nextLine();
                booleano = true;
            }
            if (((decision < 1) || (decision > 2))) {
                System.out.println("Por favor, introduce un entero");
                booleano = true;
            }
        } while (booleano);

        if (decision == 1) {
            System.out.println("\nPROGRAM CLOSED");
        } else if (decision == 2) {
            menu();
        }
    }
}