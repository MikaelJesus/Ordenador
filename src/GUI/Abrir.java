package GUI;

import java.io.*;

/**
 *
 * @author Juanan
 */
public class Abrir {

    FileInputStream fs = null;
    DataInputStream fr = null;
    BufferedReader br = null;

    public Integer[] Captura(String ruta) {
        try {

            fs = new FileInputStream(ruta);
            fr = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(fr));

            String line;
            Integer resultado[] = new Integer[Integer.parseInt(br.readLine())];

            int i = 0;
            while ((line = br.readLine()) != null) {
                resultado[i] = Integer.parseInt(line);
                i++;
            }
            fr.close();
            return resultado;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
