package co.com.tcs.certification.retoavianca.utils;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;

public class Metodos {

    public void lectura(String nombreArchivo){
        File archivo;
        FileReader fr;
        BufferedReader br;

        try{

            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();

            while((line = br.readLine()) != null){
                System.out.println(line);
                personas.add(line);
            }

            System.out.println("\n2. el numero de filas del archivo es: " + personas.size());
            System.out.println("\n3. Datos de los asociados: ");

            for(int i = 0; i < personas.size(); i++){
                String string = personas.get(i);
                String[] asociado = string.split("-");

                String fechaAsociado = asociado[5];
                String [] fecha = fechaAsociado.split("/");

                System.out.println("\nAsociado " + (1+i) + "\n" + "Primer nombre: " + asociado[0]  + "\nSegundo nombre: " + asociado[1] +
                        "\nPrimer apellido: " + asociado[2] + "\nSegundo apellido: " + asociado[3] +
                        "\nTelefono: " + asociado[4] + "\nFecha de ingreso: " + "\nDia: " + fecha[0]+ " Mes: "  + fecha[1] +
                        " Año: " + fecha[2]);
            }

            br.close();
            fr.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error al leer el archivo ".concat(e.toString()));
        }
    }
}