package Metodos;

/**
 *
 * @author Juanan
 */
public class QuickSort {

    private int cont;

    public QuickSort() {
        this.cont = 0;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int partition(Integer arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                setCont(getCont() + 1);
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    public void quickSort(Integer A[], int left, int right) {
        int index = partition(A, left, right);
        if (left < index - 1) {
            quickSort(A, left, index - 1);
        }
        if (index < right) {
            quickSort(A, index, right);
        }
    }

    public Integer[] Comenzar(Integer A[]) {

        setCont(0);
        quickSort(A, 0, A.length - 1);

        return A;
    }
}
