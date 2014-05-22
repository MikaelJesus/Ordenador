package Metodos;

/**
 *
 * @author Juanan
 */
public class Shell {

    private int cont;

    public Shell() {
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

        int incremento = A.length;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < A.length; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && A[j] < A[j - incremento]) {
                        setCont(getCont() + 1);
                        int tmp = A[j];
                        A[j] = A[j - incremento];
                        A[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);


        return A;
    }
}
