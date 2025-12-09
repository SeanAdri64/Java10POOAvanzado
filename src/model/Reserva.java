package model;

public class Reserva {
    private int id;
    private String cliente;
    private String fecha;
    private int duracionHoras;

    // Constructor que inicializa todos los atributos
    public Reserva(int id, String cliente, String fecha, int duracionHoras) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Método para mostrar información de la reserva
    public void mostrarInfo() {
        System.out.printf("Reserva [ID=%d] - Cliente: %s | Fecha: %s | Duración: %d hora(s)%n",
                id, cliente, fecha, duracionHoras);
    }
}
