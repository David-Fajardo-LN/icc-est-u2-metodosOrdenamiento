public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {1,2,3,5,6,8,12,-2};
        runBubbleSort();
    }
    public static void runBubbleSort(){
        int numeros[] = {-5,10,2,0,7};
        System.out.println("Método Burbuja");
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.printlnArreglo(numeros);
        bubblesort.sortAscendente(numeros);
        bubblesort.printlnArreglo(numeros);
    }
}
