package co.com.tcs.certification.retoavianca.utils;



public class App {

    public static void main(String[] args) {
        Metodos met = new Metodos();
        System.out.println("************************************************");
        System.out.println("1. El archivo contiene los siguientes datos: \n");
        met.lectura("src/main/java/co/com/tcs/certification/retoavianca/utils/insumo.txt");
        System.out.println("************************************************");
    }
}
