import java.util.Scanner;

public class T1_C4_Apellido {
    static int contarDigitos(int n) {
        if (n == 0) {
            return 1;
        }
        int cantidad = 0;
        while (n > 0) {
            n = n / 10;
            cantidad++;
        }
        return cantidad;
    }

    static int potencia(int b, int e) {
        int resultado = 1;
        for (int i = 1; i <= e; i++) {
            resultado = resultado * b;
        }
        return resultado;
    }

    static boolean esArmstrong(int n) {
        int cantidad = contarDigitos(n);
        int suma = 0;
        int copia = n;

        while (copia > 0) {
            int digito = copia % 10;
            suma = suma + potencia(digito, cantidad);
            copia = copia / 10;
        }
        return suma == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = sc.nextInt();

        if (esArmstrong(n)) {
            System.out.println(n + " SI es un numero de Armstrong.");
        } else {
            System.out.println(n + " NO es un numero de Armstrong.");
        }
    }
}
