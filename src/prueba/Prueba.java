
package prueba;
import java.util.ArrayList;
public class Prueba {


public class prueba {
    public static void main(String[] args) {
        // Crear tarjetas de crédito automáticamente y almacenarlas en un ArrayList
        ArrayList<Tarjeta_de_credito> tarjetas = new ArrayList<>();
        Tarjeta_de_credito tarjeta1 = new Tarjeta_de_credito("Silver");
        Tarjeta_de_credito tarjeta2 = new Tarjeta_de_credito("Gold");
        Tarjeta_de_credito tarjeta3 = new Tarjeta_de_credito("Black");
        tarjetas.add(tarjeta1);
        tarjetas.add(tarjeta2);
        tarjetas.add(tarjeta3);
        
        Cliente cliente1 = new Cliente("12345678-9", "Juan Perez", 30, 500000);
        Cliente cliente2 = new Cliente("98765432-1", "Ana López", 25, 200000);
        Cliente cliente3 = new Cliente("45678901-2", "Pedro Gómez", 35, 1200000);
        
        cliente1.asignarTarjeta(tarjeta1);
        cliente1.asignarTarjeta(tarjeta2);
        cliente1.asignarTarjeta(tarjeta3);
    }
    

