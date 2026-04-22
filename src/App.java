public class App {
    public static void main(String[] args) throws Exception {
        //int[] numeros = {1,2,3,5,6,8,12,-2};
        runBubbleSort();
        runBubbleSortAvz();
    }
    public static void runBubbleSort(){
        int numeros[] = {-5,10,2,0,7};
        System.out.println("Método Burbuja");
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.printlnArreglo(numeros);
        bubblesort.sortAscendente(numeros);
        bubblesort.printlnArreglo(numeros);
    }

    private static void  runBubbleSortAvz(){
        int[] array = new int[]{9,2,3,0,8,5};
        int[] numeros = new int[]{9,2,3,0,8,5,10,50,100};
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        bSortAvz.printArray(numeros);
        bSortAvz.sort(true);
        bSortAvz.printArray(numeros);
    }
}
