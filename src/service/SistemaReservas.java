package service;

import model.Reserva;
import java.util.ArrayList;
import java.util.Iterator;

public class SistemaReservas {
    private ArrayList<Reserva> reservas;
    public SistemaReservas() {
        this.reservas = new ArrayList<>();
    }
    // Agregar reserva
    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.printf(">> Reserva agregada (ID=%d).%n", r.getId());
    }

    // Eliminar reserva por id; lanza excepción si no existe
    public void eliminarReserva(int id) throws Exception {
        Iterator<Reserva> it = reservas.iterator();
        while (it.hasNext()) {
            Reserva r = it.next();
            if (r.getId() == id) {
                it.remove();
                System.out.printf(">> Reserva con ID=%d eliminada correctamente.%n", id);
                return;
            }
        }
        // Si llegamos aquí, no se encontró la reserva
        throw new Exception("No existe una reserva con ID=" + id);
    }

    public void listarReservas() {
        System.out.println("=== LISTA DE RESERVAS ACTIVAS ===");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas activas.");
            return;
        }
        for (Reserva r : reservas) {
            // uso de getters para acceder a la información
            System.out.printf("ID: %d | Cliente: %s | Fecha: %s | Duración: %d hora(s)%n",
                    r.getId(), r.getCliente(), r.getFecha(), r.getDuracionHoras());
        }
    }
    // Contar reservas
    public int contarReservas() {
        return reservas.size();
    }
    // Getter de la colección (si se necesita externo)
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
