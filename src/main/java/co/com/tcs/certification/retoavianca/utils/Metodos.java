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
            int cont = 0;
            int cont1 = 0;
            List<String> personas = new ArrayList();
            Map<String, String> dict = new Hashtable<>();

            while((line = br.readLine()) != null){
                System.out.println(line);
                cont += 1;
                personas.add(line.toString());
            }

            System.out.println("\n");
            System.out.println("2. el numero de filas del archivo es: " + cont);
            System.out.println("************************************************");
            System.out.println("\n");
            System.out.println("3. Datos de los asociados: \n");

            for(int i = 0; i < personas.size(); i++){
                String trabajador = personas.get(i).replace("-", ",");
               /* String pNombre = trabajador[0];
                String sNombre = trabajador[1];
                String pApellido = trabajador[2];
                String sApellido = trabajador[3];
                String telefono = trabajador[4];
                String fIngreso = trabajador[5];
                dict.put("Primer nombre: ", pNombre);
                dict.put("Segundo nombre: ", sNombre);
                dict.put("Primer apellido: ", pApellido);
                dict.put("Segundo apellido: ", sApellido);
                dict.put("Telefono: ", telefono);
                dict.put("Fecha de Ingreso: ", fIngreso);*/
                cont1 +=1;

                System.out.println("Asociado: "+ cont1);
                System.out.println(trabajador);
            }



            br.close();
            fr.close();

        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Hubo un error al leer el archivo ".concat(e.toString()));
        }
    }
}
