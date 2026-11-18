import java.util.Locale;
import java.util.Scanner;

public class T1_C3_Apellido {
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    static double leerMedida(Scanner sc, String mensaje) {
        double valor;
        do {
            System.out.print(mensaje);
            valor = sc.nextDouble();
            if (valor <= 0) {
                System.out.println("Debe ser mayor que 0.");
            }
        } while (valor <= 0);
        return valor;
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("===== MENU DE VOLUMENES =====");
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                double lado = leerMedida(sc, "Lado: ");
                System.out.printf("Volumen del cubo: %.2f%n", volumen(lado));
            } else if (opcion == 2) {
                double radio = leerMedida(sc, "Radio: ");
                double altura = leerMedida(sc, "Altura: ");
                System.out.printf("Volumen del cilindro: %.2f%n", volumen(radio, altura));
            } else if (opcion == 3) {
                double largo = leerMedida(sc, "Largo: ");
                double ancho = leerMedida(sc, "Ancho: ");
                double alto = leerMedida(sc, "Alto: ");
                System.out.printf("Volumen del prisma: %.2f%n", volumen(largo, ancho, alto));
            } else if (opcion != 4) {
                System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);

        System.out.println("Programa terminado.");
    }
}
