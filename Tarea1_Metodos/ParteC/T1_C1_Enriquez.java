import java.util.Locale;
import java.util.Scanner;

public class T1_C1_Apellido {
    static double leerConsumo(Scanner sc) {
        double m3;
        do {
            System.out.print("Ingrese el consumo en m3: ");
            m3 = sc.nextDouble();
            if (m3 < 0) {
                System.out.println("Error: el consumo no puede ser negativo.");
            }
        } while (m3 < 0);
        return m3;
    }

    static double calcularValor(double m3) {
        double cargoFijo = 2.50;
        double valor;
        if (m3 <= 15) {
            valor = m3 * 0.40;
        } else {
            valor = 15 * 0.40 + (m3 - 15) * 0.75;
        }
        return valor + cargoFijo;
    }

    static void mostrarPlanilla(double m3, double total) {
        System.out.println("----- PLANILLA DE AGUA -----");
        System.out.println("Consumo: " + m3 + " m3");
        System.out.println("Cargo fijo: $2.50");
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double m3 = leerConsumo(sc);
        double total = calcularValor(m3);
        mostrarPlanilla(m3, total);
    }
}
