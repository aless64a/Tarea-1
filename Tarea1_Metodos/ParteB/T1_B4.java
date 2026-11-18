// Version CORREGIDA del programa de la pregunta 4
public class T1_B4 {
    static int total = 0;

    static void sumar(int x) {
        int parcial = x * 2;
        total += parcial;
        System.out.println(parcial);   // parcial solo existe dentro de sumar
    }

    public static void main(String[] args) {
        int i;                          // i se declara fuera del for para usarla despues
        for (i = 1; i <= 3; i++) {
            sumar(i);
        }
        System.out.println(i);
        System.out.println(total);      // total estatico = 12
        int total = 5;                  // variable local que "oculta" a la estatica
        System.out.println(total);      // imprime 5
    }
}
