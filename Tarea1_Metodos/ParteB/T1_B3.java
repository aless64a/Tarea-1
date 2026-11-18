public class T1_B3 {
    static void modificar(int n, int[] v) {
        n = n * 10;          // cambia solo la copia local de n
        v[0] = v[0] * 10;    // cambia el arreglo original (misma direccion)
        v = new int[]{-1, -1}; // v local apunta ahora a un arreglo nuevo
        v[1] = 99;           // modifica el arreglo nuevo, no el original
    }

    public static void main(String[] args) {
        int n = 3;
        int[] v = {3, 4};
        modificar(n, v);
        System.out.println(n + " " + v[0] + " " + v[1]);
    }
}
