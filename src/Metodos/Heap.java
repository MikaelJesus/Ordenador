package Metodos;

/**
 *
 * @author Juanan
 */
public class Heap {

    private int cont;
    private static int N;

    public Heap() {
        this.cont = 0;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public Integer[] Comenzar(Integer A[]) {
        setCont(0);
        heapify(A);
        for (int i = N; i > 0; i--) {
            swap(A, 0, i);
            N = N - 1;
            maxheap(A, 0);
        }

        return A;
    }

    public void heapify(Integer arr[]) {
        N = arr.length - 1;
        for (int i = N / 2; i >= 0; i--) {
            maxheap(arr, i);
        }
    }

    public void maxheap(Integer arr[], int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i]) {
            max = left;
        }
        if (right <= N && arr[right] > arr[max]) {
            max = right;
        }
        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }

    public void swap(Integer arr[], int i, int j) {
        setCont(getCont() + 1);
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
