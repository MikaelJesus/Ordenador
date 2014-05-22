package GUI;

import java.io.*;

/**
 *
 * @author Juanan
 */
public class Guardar {

    public void Save(Integer A[], String ruta) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            if (ruta.isEmpty()) {
                fw = new FileWriter("src/Archivo/Orden.txt");
            } else {
                fw = new FileWriter(ruta);
            }

            pw = new PrintWriter(fw);
            pw.println(A.length);
            for (int i = 0; i < A.length; i++) {
                pw.println(A[i]);
            }

            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
