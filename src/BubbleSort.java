
public class BubbleSort {
    public BubbleSort(){
        System.out.println("se creo la clase en el constructor");
    }
    public void sortAscendente(int numeros[]){
        for (int i = 0; i<numeros.length; i++){
            for (int j = i+1; j<numeros.length; j++){
                if (numeros[i]<numeros[j]){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }
    public void printlnArreglo(int[] numeros) {
        /*for (int i = 0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }*/
        for(int i : numeros){
            System.out.print(i+", ");
        }
        System.out.println();
    }

    public void sortDescendente(int numeros[]){
        for (int i = 0; i<numeros.length; i++){
            for (int j = i+1; j<numeros.length; j++){
                if (numeros[i]>numeros[j]){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }
    public void sort(int[] numeros, boolean asc){
        if (asc == true){
            sortAscendente(numeros);
        }else{
            sortDescendente(numeros);
        }
        printlnArreglo(numeros);
    }

}
