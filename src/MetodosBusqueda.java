public class MetodosBusqueda {
    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {

        int iter = 0;
        for (int i = 0; i < arreglo.length; i++) {
            iter++;
            if (arreglo[i] == valorBuscado) {
                iter = i;
                return i;
            }
            System.out.println("Número de iteraciones secuenciales: " + iter);

        }
        return -1;
    }

    public void printArreglo(int[] arreglo) {
        for (int elem : arreglo) {
            System.out.print(elem + " ");
        }
    }

    int iteraciones = 0;
    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            iteraciones++;
            
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                System.out.println("El numero de iteraciones de binario es: " + iteraciones);
                return medio;
            }
            if (arr[medio] < value) {
                inicio = medio + 1; // buscar en la mitad de la derecha
            } else {
                fin = medio - 1; // buscar en la mitad de la izquierda
            }
            
        }
        //System.out.print("Número de iteraciones: " + iteraciones);

        return -1;
    }
}
