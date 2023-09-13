
package prueba;

public class Tarjeta_de_credito {
    private String marca;
    private String producto;
    private String estado;
    private double cupoPesos;
    private int numeroTarjeta;
    private static int contadorTarjetas = 1; 

    public Tarjeta_de_credito(String marca, String producto, String estado, double cupoPesos, int numeroTarjeta) {
        this.marca = marca;
        this.producto = producto;
        this.estado = estado;
        this.cupoPesos = cupoPesos;
        this.numeroTarjeta = numeroTarjeta;
    }
    public Tarjeta_de_credito(String producto) {
        this.marca = "Visa";
        this.producto = producto;
        this.estado = "Inactiva";
        if (producto.equals("Silver")) {
            this.cupoPesos = 100000;
        } else if (producto.equals("Gold")) {
            this.cupoPesos = 500000;
        } else if (producto.equals("Black")) {
            this.cupoPesos = 1000000;
        }
        this.numeroTarjeta = contadorTarjetas++;
    }

    public void activarTarjeta() {
        this.estado = "Activa";
    }
}



