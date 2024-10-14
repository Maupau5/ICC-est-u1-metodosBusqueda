import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        // int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int[] arreglo = new int[100000];

        for (int i = 0; i < 100000; i++) {
            arreglo[i] = i + 1;
        }

        int valorBuscado = 50418;
        //metodosBusqueda.printArreglo(arreglo);


        
        long startTimeS = System.nanoTime();
        int posicion = metodosBusqueda.busquedaSecuencial(arreglo, 50418);
        if (posicion != -1) {
            System.out.println("El valor se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("El valor no se ha encontrado 404");
        }
        
        long endTimeS = System.nanoTime();
        long totalTimeS = endTimeS - startTimeS;
        System.out.println(totalTimeS);

        long startTimeB = System.nanoTime();
        int posi = metodosBusqueda.busquedaBinaria(arreglo, 50418);
        if (posi != -1) {
            System.out.println("El valor se encuentra en la posicion: " + posi);
        } else {
            System.out.println("El valor no se ha encontrado 404");
        }
        
        long endTimeB = System.nanoTime();
        long totalTimeB = endTimeB - startTimeB;
        System.out.println(totalTimeB);

    }
}
