package Metodos;

/**
 *
 * @author Juanan
 */
public class BurbujaMejorada {

    private int cont;

    public BurbujaMejorada() {
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

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    setCont(getCont() + 1);
                    int aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }

        return A;
    }
}
