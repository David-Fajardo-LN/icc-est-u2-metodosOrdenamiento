public class BubbleSortAvz {
    int [] array;


    public BubbleSortAvz(int[] arreglo){
        this.array= arreglo;
    }
    public void sort(boolean asc){
        int tam = array.length;
        boolean huboIntercambio;
        int contadorComparaciones = 0;
        for(int i = 0; i<tam-1;i++){
            huboIntercambio = false;
            for(int j = 0; j< tam-1 -i; j++){
                contadorComparaciones++;
                if (array[j]>array[j+1]){
                    huboIntercambio= true;
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1]= aux;
                }
            }
            if(!huboIntercambio){
               break;
            }
        }
        System.out.println("Comparaciones totales:"+ contadorComparaciones);
    }

    public static void runBubbleSort(){
        int[] array = {9,2,3,0,8,5,10,50,100}; 
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        bSortAvz.sort(true);
    } 
    public void printArray(int[] numeros){
        for(int i : numeros){
            System.out.println(i +",");
        }
        System.out.println();
    }
}
