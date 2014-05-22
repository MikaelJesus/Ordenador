package Metodos;

/**
 *
 * @author Juanan
 */
public class Burbuja {

    private int cont;

    public Burbuja() {
        this.cont = 0;
    }

    public Integer[] Comenzar(Integer A[]) {
        setCont(0);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {

                if (A[j] > A[j + 1]) {
                    setCont(getCont() + 1);
                    int aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }

        return A;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
