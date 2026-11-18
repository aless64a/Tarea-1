import java.util.Locale;
import java.util.Scanner;

public class T1_C2_Apellido {

    // Devuelve el promedio de tres notas.
    static double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Devuelve el estado segun la nota: Aprobado, Supletorio o Reprobado.
    static String estado(double nota) {
        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    // Devuelve la nota minima que se necesita en el supletorio para que
    // el promedio entre la nota y el supletorio sea 14.
    // Si el estudiante no esta en supletorio devuelve -1.
    static double necesitaEnSupletorio(double nota) {
        if (nota >= 9 && nota < 14) {
            return 28 - nota;   // (nota + sup) / 2 = 14  ->  sup = 28 - nota
        }
        return -1;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   // para escribir decimales con punto
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double prom = promedio(n1, n2, n3);
        String est = estado(prom);

        System.out.printf("Promedio: %.2f%n", prom);
        System.out.println("Estado: " + est);

        if (est.equals("Supletorio")) {
            double minimo = necesitaEnSupletorio(prom);
            System.out.printf("Necesita minimo %.2f en el supletorio.%n", minimo);
        }
    }
}
