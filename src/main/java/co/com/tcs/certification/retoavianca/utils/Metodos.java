package co.com.tcs.certification.retoavianca.utils;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;



public class Metodos {

    private String pName;
    private String sName;
    private String pApe;
    private String sApe;
    private String phone;
    private String email;
    private String country;
    private String city;
    private String username;
    private String password;
    private String[] asociado;

    public Metodos() {
    }

    public String getpName() {
        return pName;
    }

    public String getsName() {
        return sName;
    }

    public String getpApe() {
        return pApe;
    }

    public String getsApe() {
        return sApe;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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

            System.out.println("\n2. el numero de filas del archivo es: " + personas.size());
            System.out.println("\n3. Datos de los asociados: ");

            for(int i = 0; i < personas.size(); i++){
                String string = personas.get(i);
                asociado = string.split("-");

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
                System.out.println(line);
                personas.add(line);
            }

            persona = personas.get(0);
            asociado = persona.split("-");
            wholeName = asociado[0]+asociado[1]+asociado[2]+asociado[3];
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
                System.out.println(line);
                personas.add(line);
            }

            persona = personas.get(0);
            asociado = persona.split("-");
            phone = asociado[4];
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
                System.out.println(line);
                personas.add(line);
            }

            persona = personas.get(0);
            asociado = persona.split("-");
            email = asociado[0]+ "@" + asociado[2] + ".com";
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
                System.out.println(line);
                personas.add(line);
            }

            persona = personas.get(0);
            asociado = persona.split("-");
            userName = asociado[0].substring(0,2)+ asociado[1]
                    .substring(0,2) + asociado[2].substring(0,2) +
                    asociado[3].substring(0,2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userName;
    }
}