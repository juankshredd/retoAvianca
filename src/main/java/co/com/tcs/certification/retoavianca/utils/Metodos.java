package co.com.tcs.certification.retoavianca.utils;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;



public class Metodos {

    private String[] dude;

    public Metodos() {
    }


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
            System.out.println("************************************************");
            System.out.println("\n2. el numero de filas del archivo es: " + personas.size());
            System.out.println("************************************************");
            System.out.println("\n3. Datos de los asociados: ");

            for(int i = 0; i < personas.size(); i++){
                String string = personas.get(i);
                dude = string.split("-");

                String fechaAsociado = dude[5];
                String [] fecha = fechaAsociado.split("/");

                System.out.println("\nAsociado " + (1+i) + "\n" + "Primer nombre: " + dude[0]  + "\nSegundo nombre: " + dude[1] +
                        "\nPrimer apellido: " + dude[2] + "\nSegundo apellido: " + dude[3] +
                        "\nTelefono: " + dude[4] + "\nFecha de ingreso: " + "\nDia: " + fecha[0]+ " Mes: "  + fecha[1] +
                        " Año: " + fecha[2]);
                System.out.println("************************************************");
            }

            br.close();
            fr.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error al leer el archivo ".concat(e.toString()));
        }
    }

    public String datos() {
        File archivo;
        FileReader fr;
        BufferedReader br;
        String persona ="";
        String wholeName = "";
        try {
            String nombreArchivo;
            archivo = new File("src/main/java/co/com/tcs/certification/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();

            while((line = br.readLine()) != null){
                personas.add(line);
            }

            persona = personas.get(0);
            dude = persona.split("-");
            wholeName = dude[0]+dude[1]+dude[2]+dude[3];
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wholeName;
    }
    public String phone(){
        File archivo;
        FileReader fr;
        BufferedReader br;
        String persona ="";
        String phone = "";
        try {
            String nombreArchivo;
            archivo = new File("src/main/java/co/com/tcs/certification/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();

            while((line = br.readLine()) != null){
                personas.add(line);
            }

            persona = personas.get(0);
            dude = persona.split("-");
            phone = dude[4];
        } catch (IOException e) {
            e.printStackTrace();
        }

        return phone;
    }
    public String email(){
        File archivo;
        FileReader fr;
        BufferedReader br;
        String persona ="";
        String email = "";
        try {
            String nombreArchivo;
            archivo = new File("src/main/java/co/com/tcs/certification/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();

            while((line = br.readLine()) != null){
                personas.add(line);
            }

            persona = personas.get(0);
            dude = persona.split("-");
            email = dude[0]+ "@" + dude[2] + ".com";
        } catch (IOException e) {
            e.printStackTrace();
        }

        return email;
    }
    public String userName(){
        File archivo;
        FileReader fr;
        BufferedReader br;
        String persona ="";
        String userName = "";
        try {
            String nombreArchivo;
            archivo = new File("src/main/java/co/com/tcs/certification/retoavianca/utils/insumo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line;
            List<String> personas = new ArrayList();

            while((line = br.readLine()) != null){
                personas.add(line);
            }

            persona = personas.get(0);
            dude = persona.split("-");
            userName = dude[0].substring(0,2)+ dude[1]
                    .substring(0,2) + dude[2].substring(0,2) +
                    dude[3].substring(0,2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userName;
    }
}