
package prueba;


public class Cliente {
    private String rut;
    private String nombre;
    private int edad;
    private double renta;
    private Tarjeta_de_credito tarjeta;

    public Cliente(String rut, String nombre, int edad, double renta, Tarjeta_de_credito tarjeta) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.renta= renta;
        this.tarjeta = tarjeta;
    }
public void asignarTarjeta(Tarjeta_de_credito tarjeta) {
        this.tarjeta = tarjeta;
        this.tarjeta.activarTarjeta();
    }

   
}


